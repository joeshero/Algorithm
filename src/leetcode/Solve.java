package com.project.lt;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

/**
 * @Author Qiao guorui
 * @Date 2020/12/9 7:47 下午
 */
public class Solve {

    private static HashSet<Integer> sets = Sets.newHashSet(1,2,20,21,38,
            53,62,70,100,101,
            104,112,136,141,160,
            169,198,200,206,226,
            283, 404);

    public static void main(String[] args) throws ParseException {
//        System.out.println(has(200));
        String dateStr1 = "2020-10-30 11:59:59";
        String dateStr2 = "2020-10-30 09:00:00";
        String dateStr3 = "2020-11-19 09:30:01";
        String dateStr4 = "2020-12-04 09:30:01";
        // 默认是系统时区
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 设置时区
        dateFormat.setTimeZone(TimeZone.getTimeZone(ZoneId.of("US/Eastern")));
        Date date1 = dateFormat.parse(dateStr1);
        Date date2 = dateFormat.parse(dateStr2);
        Date date3 = dateFormat.parse(dateStr3);
        Date date4 = dateFormat.parse(dateStr4);
        System.out.println(toLocalDate(date1));
        System.out.println(toLocalDate(date2));
        System.out.println(toLocalDate(date3));
        System.out.println(toLocalDate(date4));
    }

    private static LocalDate toLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.of("GMT+8")).toLocalDate();
    }


    private static boolean has(int count) {
        return sets.contains(count);
    }


}
