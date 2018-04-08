package cn.lanya.util;

import cn.lanya.dao.ApplicationMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.util.Date;

public class Test {

    public  static void main(String[] args){
        System.out.print(new Timestamp(new Date().getTime()));

    }
}
