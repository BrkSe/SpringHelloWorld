package com.burakkutbay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by burak on 22.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringContext.xml");
        HelloWorld helloWorld= (HelloWorld) applicationContext.getBean("helloWorld");

        System.out.println(helloWorld.getMessage());
    }

}
