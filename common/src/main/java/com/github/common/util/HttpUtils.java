package com.github.common.util;

import com.alibaba.fastjson.JSON;
import com.github.common.dto.RequestInfo;
import com.github.common.dto.ResponseInfo;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpClientParams;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class HttpUtils {

    public static Object urlPost(String urlPath, Class clazz) throws Exception{
        URL url = new URL(urlPath);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        InputStream in = null;
        OutputStream out = new ByteArrayOutputStream();
        if(httpURLConnection.getResponseCode() == httpURLConnection.HTTP_OK){
            in = httpURLConnection.getInputStream();
            byte[] bytes = new byte[1024];
            int len = -1;
            while((len = in.read(bytes)) > -1){
                System.out.println("len=" + len);
                out.write(bytes);
                bytes = new byte[1024];
            }
            System.out.println("len=" + len);
            System.out.println(new String ((((ByteArrayOutputStream) out).toByteArray()), "utf-8"));
        }
        return new Object();
    }

    public static Object urlGet(String url, Class clazz) throws Exception{
        return new Object();
    }

    public static Object clientPostMap(String url, Map<String, Object> paramMap, Class clazz) throws Exception{
        Object obj = null;
        HttpClient client = new HttpClient();
        PostMethod posMethod = new PostMethod(url);
        InputStream in = null;
        OutputStream out = new ByteArrayOutputStream();
        NameValuePair[] params = null;
        if(paramMap != null && !paramMap.isEmpty()){
            params = new NameValuePair[paramMap.size()];
            int i=0;
            for(Map.Entry<String, Object> entry : paramMap.entrySet()){
                params[i++] = new NameValuePair(entry.getKey(), JSON.toJSONString(entry.getValue()));
            }
        }
        HttpClientParams httpClientParams = new HttpClientParams();
        httpClientParams.setContentCharset("utf-8");
        httpClientParams.setConnectionManagerTimeout(6000);
        posMethod.setParams(httpClientParams);
        posMethod.setRequestBody(params);
        int code = client.executeMethod(posMethod);
        if(code == 200){
            in = posMethod.getResponseBodyAsStream();
            byte[] bytes = new byte[1024];
            int len = -1;
            while((len = in.read(bytes)) > -1){
                System.out.println("len=" + len);
                out.write(bytes);
                bytes = new byte[1024];
            }
            // bytes = getMethod.getResponseBody();
            String res = new String (((ByteArrayOutputStream) out).toByteArray(), "utf-8");
            if(clazz == String.class){
                obj = res;
            }else if(clazz == ResponseInfo.class){
                obj = JSON.parseObject(res.trim(), ResponseInfo.class);
            }
            System.out.println(obj.toString());
        }

        return obj;
    }

    public static Object clientPostObj(String url, Object paramObj, Class clazz) throws Exception{
        Object obj = null;
        HttpClient client = new HttpClient();
        PostMethod posMethod = new PostMethod(url);
        InputStream in = null;
        OutputStream out = new ByteArrayOutputStream();
        HttpClientParams httpClientParams = new HttpClientParams();
        httpClientParams.setContentCharset("utf-8");
        httpClientParams.setConnectionManagerTimeout(6000);
        posMethod.setParams(httpClientParams);
        // 想用@RequestBody，就必须指定Content-Type,并且用RequestEntity传参
        posMethod.setRequestEntity(new StringRequestEntity(JSON.toJSONString(paramObj)));
        posMethod.setRequestHeader("Content-Type","application/json");
        int code = client.executeMethod(posMethod);
        if(code == 200){
            in = posMethod.getResponseBodyAsStream();
            byte[] bytes = new byte[1024];
            int len = -1;
            while((len = in.read(bytes)) > -1){
                System.out.println("len=" + len);
                out.write(bytes);
                bytes = new byte[1024];
            }
            // bytes = getMethod.getResponseBody();
            String res = new String (((ByteArrayOutputStream) out).toByteArray(), "utf-8");
            if(clazz == String.class){
                obj = res;
            }else if(clazz == ResponseInfo.class){
                obj = JSON.parseObject(res.trim(), ResponseInfo.class);
            }
            System.out.println(obj.toString());
        }

        return obj;
    }

    public static Object clientGet(String url, Class clazz) throws Exception{
        Object obj = null;
        HttpClient client = new HttpClient();
        GetMethod getMethod = new GetMethod(url);
        InputStream in = null;
        OutputStream out = new ByteArrayOutputStream();
        HttpClientParams params = new HttpClientParams();
        params.setContentCharset("utf-8");
        params.setConnectionManagerTimeout(6000);
        getMethod.setParams(params);
        int code = client.executeMethod(getMethod);
        if(code == 200){
            in = getMethod.getResponseBodyAsStream();
            byte[] bytes = new byte[1024];
            int len = -1;
            while((len = in.read(bytes)) > -1){
                System.out.println("len=" + len);
                out.write(bytes);
                bytes = new byte[1024];
            }
            System.out.println("len=" + len);
            // bytes = getMethod.getResponseBody();
            String res = new String (((ByteArrayOutputStream) out).toByteArray(), "utf-8");
            if(clazz == String.class){
                obj = res;
            }else if(clazz == ResponseInfo.class){
                obj = JSON.parseObject(res.trim(), ResponseInfo.class);
            }
            System.out.println(obj.toString());
        }

        return obj;
    }

}
