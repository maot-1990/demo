package com.github.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public final static String YYYYMMDD = "yyyyMMdd";
    public final static String YYYY_MM_DD = "yyyy-MM-dd";
    public final static String YYYYMMDDHHMMSS = "yyyyMMdd hhmmss";

    public static Date parse(String date, String pattern) throws Exception{
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.parse(date);
    }

    public static String format(Date date, String pattern) throws Exception{
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    public static Date addDay(Date date, Integer day){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, day);
        return calendar.getTime();
    }

    public static Date addMonth(Date date, Integer month){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    public static Date addYear(Date date, Integer year){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, year);
        return calendar.getTime();
    }

}
