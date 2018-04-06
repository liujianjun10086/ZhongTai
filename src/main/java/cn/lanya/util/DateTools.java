package cn.lanya.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTools {

    public static Date getDate(String str){
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

}
