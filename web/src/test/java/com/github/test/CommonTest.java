package com.github.test;

import com.github.common.calc.RepaymentModeCalc;
import com.github.common.dto.RequestInfo;
import com.github.common.enums.RepaymentModeEnum;
import com.github.common.po.User;
import com.github.common.util.ArithTools;
import com.github.common.util.DateUtils;
import com.github.common.util.HttpUtils;
import com.github.common.util.ReflectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        System.out.println(ArithTools.add(6.3548, 2.23154));
        System.out.println(ArithTools.div(6.3548, 2.2315498));
        System.out.println(ArithTools.div(6, 7));
        System.out.println(ArithTools.sub(6.3548, 2.23154));
        System.out.println(ArithTools.mul(6.3548, 2.23154));

        System.out.println(ArithTools.scale(3.21454, 2));

        System.out.println(0.00 == 0);

        /*Integer i = 9;
        Object obj = i;
        System.out.println(obj.getClass());*/

        /*Map<String, Object> map = new HashMap<String, Object>();
        map.put("userName", "maot");
        map.put("sex", "boy");
        map.put("age", 28);
        map.put("id", "12345678");
        map.put("country", "he");
        Object obj = ReflectionUtils.mapToObj(map, User.class);
        System.out.println(((User)obj).toJsonString());
        System.out.println(obj.toString());*/

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


    @Test
    public void test3() throws Exception{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = format.parse("2018-05-05");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR,-3);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,-4);
        System.out.println(calendar.getTime());

        System.out.println(currentDate);
    }

    @Test
    public void test4() throws Exception{
        System.out.println(DateUtils.format(new Date(), DateUtils.YYYY_MM_DD));
        System.out.println(DateUtils.format(new Date(), DateUtils.YYYYMMDD));
        System.out.println(DateUtils.format(new Date(), DateUtils.YYYYMMDDHHMMSS));

        System.out.println(DateUtils.parse("2018-02-14", DateUtils.YYYY_MM_DD));

        System.out.println(DateUtils.addDay(new Date(), 2));

        System.out.println(DateUtils.addMonth(new Date(), 4));
    }

    @Test
    public void test5() throws Exception{

        System.out.println(DateUtils.addMonth(DateUtils.parse("2018-01-31","yyyy-MM-dd"), 1));

        System.out.println(DateUtils.getDayByDate(DateUtils.addMonth(new Date(), 6)));
        System.out.println(DateUtils.getMonthByDate(DateUtils.addMonth(new Date(), 6)));
        System.out.println(DateUtils.getLastDayByDate(DateUtils.addMonth(new Date(), 6)));

        System.out.println(DateUtils.setDayByDate(DateUtils.addMonth(new Date(), 1), 3));

    }

    @Test
    public void test6() throws Exception{

        RepaymentModeCalc.calculation(RepaymentModeEnum.DAILY_INTEREST_LSBQ, new Date(), DateUtils.addDay(new Date(), 60), 10000.00,
                0.08, 90, 1);

        RepaymentModeCalc.calculation(RepaymentModeEnum.MONTH_INTEREST_LSBQ, new Date(), DateUtils.addDay(new Date(), 60), 10000.00,
                0.08, 3, 2);

        RepaymentModeCalc.calculation(RepaymentModeEnum.DAILY_INTEREST_XXHB, DateUtils.parse("2018-01-15", "yyyy-MM-dd"), DateUtils.addDay(DateUtils.parse("2018-01-15", "yyyy-MM-dd"), 100), 1234.00,
                0.08, 100, 1);

        RepaymentModeCalc.calculation(RepaymentModeEnum.MONTH_INTEREST_XXHB, DateUtils.parse("2018-01-15", "yyyy-MM-dd"), DateUtils.addMonth(DateUtils.parse("2018-01-15", "yyyy-MM-dd"), 3), 1234.00,
                0.08, 3, 2);

        RepaymentModeCalc.calculation(RepaymentModeEnum.MONTH_INTEREST_DEBX, DateUtils.parse("2018-01-15", "yyyy-MM-dd"), DateUtils.addMonth(DateUtils.parse("2018-01-15", "yyyy-MM-dd"), 3), 1234.00,
                0.08, 3, 2);

        RepaymentModeCalc.calculation(RepaymentModeEnum.MONTH_INTEREST_DEBJ, DateUtils.parse("2018-01-15", "yyyy-MM-dd"), DateUtils.addMonth(DateUtils.parse("2018-01-15", "yyyy-MM-dd"), 3), 1234.00,
                0.08, 3, 2);
    }

    @Test
    public void test7() throws Exception{
        System.out.println(ArithTools.roundUp(3.15));
    }
}
