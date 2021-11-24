package com.kyle.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    ApplicationContext ctx =
        new ClassPathXmlApplicationContext("listconfig.xml");
    Hospital hos = (Hospital) ctx.getBean("hospital");
    System.out.println(hos.getDepartments());
    System.out.println(hos.getName());
  }
}
