package cn.lanya.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {

    public static Date getDate(String str){
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            Date newDate =sdf.parse(str);
            date = new Date(newDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
