package com.github.common.util;

import java.math.BigDecimal;

/**
 * 算术工具类
 * @author maot
 */
public class ArithTools {

    public static Double add(Double d1, Double d2, int scale){
        if(d1 == null){
            d1 = 0.0;
        }
        if(d2 == null){
            d2 = 0.0;
        }
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(d1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(d2));
        return bigDecimal1.add(bigDecimal2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static Double sub(Double d1, Double d2, int scale){
        if(d1 == null){
            d1 = 0.0;
        }
        if(d2 == null){
            d2 = 0.0;
        }
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(d1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(d2));
        return bigDecimal1.subtract(bigDecimal2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static Double mul(Double d1, Double d2, int scale){
        if(d1 == null){
            d1 = 0.0;
        }
        if(d2 == null){
            d2 = 0.0;
        }
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(d1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(d2));
        return bigDecimal1.multiply(bigDecimal2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static Double div(Double d1, Double d2, int scale) throws Exception{
        if(d1 == null){
            d1 = 0.0;
        }
        if(d2 == null && d2 == 0){
            throw new Exception("参数不合法，除数不能为零");
        }
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(d1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(d2));
        return bigDecimal1.divide(bigDecimal2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static Double scale(Double d, int scale){
        if(d == null){
            d = 0.0;
        }
        BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
        return bigDecimal.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static Integer add(Integer i1, Integer i2){
        if(i1 == null){
            i1 = 0;
        }
        if(i2 == null){
            i2 = 0;
        }
        BigDecimal bigDecimal1 = new BigDecimal(Integer.toString(i1));
        BigDecimal bigDecimal2 = new BigDecimal(Integer.toString(i2));
        return bigDecimal1.add(bigDecimal2).intValue();
    }

    public static Integer sub(Integer i1, Integer i2){
        if(i1 == null){
            i1 = 0;
        }
        if(i2 == null){
            i2 = 0;
        }
        BigDecimal bigDecimal1 = new BigDecimal(Integer.toString(i1));
        BigDecimal bigDecimal2 = new BigDecimal(Integer.toString(i2));
        return bigDecimal1.subtract(bigDecimal2).intValue();
    }

    public static Integer mul(Integer i1, Integer i2){
        if(i1 == null){
            i1 = 0;
        }
        if(i2 == null){
            i2 = 0;
        }
        BigDecimal bigDecimal1 = new BigDecimal(Integer.toString(i1));
        BigDecimal bigDecimal2 = new BigDecimal(Integer.toString(i2));
        return bigDecimal1.multiply(bigDecimal2).intValue();
    }

    public static Double div(Integer i1, Integer i2, int scale) throws Exception{
        if(i1 == null){
            i1 = 0;
        }
        if(i2 == null && i2 == 0){
            throw new Exception("参数不合法，除数不能为零");
        }
        BigDecimal bigDecimal1 = new BigDecimal(Integer.toString(i1));
        BigDecimal bigDecimal2 = new BigDecimal(Integer.toString(i2));
        return bigDecimal1.divide(bigDecimal2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
