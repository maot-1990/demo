package com.github.test;

import com.github.common.dto.RequestInfo;
import com.github.common.po.User;
import com.github.common.util.HttpUtils;
import com.github.common.util.ReflectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class CommonTest {

    @Test
    public void test1() throws Exception{
        /* User user = new User();
        user.setUserName("maot");
        user.setAge(28);
        user.setSex("boy");
        user.setCreateUser("who");
        System.out.println(ReflectionUtils.objToMap(user));*/
        /*System.out.println(ArithTools.add(6.3548, 2.23154, 2));
        System.out.println(ArithTools.div(6.3548, 2.23154, 2));
        System.out.println(ArithTools.sub(6.3548, 2.23154, 2));
        System.out.println(ArithTools.mul(6.3548, 2.23154, 2));

        System.out.println(ArithTools.scale(3.21454, 2));

        System.out.println(0.00 == 0);*/

        /*Integer i = 9;
        Object obj = i;
        System.out.println(obj.getClass());*/

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userName", "maot");
        map.put("sex", "boy");
        map.put("age", 28);
        map.put("createUser", "who");
        map.put("createTime", new Date());
        System.out.println(ReflectionUtils.mapToObj(map, User.class).toString());
    }

    @Test
    public void test2(){
        try {
            // clientGet("http://localhost:8080/test?phone=18126389004&dtype=json&key=1630d970c77131e74c250542b395da91", ResponseInfo.class);
            Map<String, Object> paramMap = new HashMap<String, Object>();
            RequestInfo requestInfo = new RequestInfo();
            requestInfo.setKey("x");
            requestInfo.setName("y");
            requestInfo.setContent("z");
            paramMap.put("key","warning");
            paramMap.put("name","警告");
            paramMap.put("content","1213");

            HttpUtils.clientPostObj("http://localhost:8080/demo/test2", requestInfo, String.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
