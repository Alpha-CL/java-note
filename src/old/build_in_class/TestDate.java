package src.old.build_in_class;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestDate {

    public static void main(String[] args) {

        // System
        long time = System.currentTimeMillis();         // 当前时间的时间戳 [1970-1-1  00:80:00, now]
        System.out.println(time);


        // Date
        Date date1 = new Date(1545364985172L);
        Date date2 = new Date();
        System.out.println(date2);                      // 重写 toString(); 方法

        boolean x = date1.before(date2);                // date1是否在date2之前
        boolean y = date1.after(date2);                 // date1是否在date2之后

        System.out.println(x);
        System.out.println(y);


        // SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String v = sdf.format(date1);                   // 通过sdf对象将date1格式化成你描述的样子
        System.out.println(v);

        // Calendar
        Calendar calendar = Calendar.getInstance();     // 系统当前时间的calendar对象

        // java.util.GregorianCalendar[name=value,name=value]
        System.out.println(calendar);

        calendar.set(Calendar.YEAR, 2015);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);//从0开始数
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "/" + month + "/" + day);

        TimeZone tz = calendar.getTimeZone();               // 获取时区
        //TimeZone tz = TimeZone.getDefault();
        System.out.println(tz);
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());
    }
}
