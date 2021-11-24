package com.kyle.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    Employee emp = (Employee) ctx.getBean("emp");
    System.out.println("EMPLOYEE ID >>>" + emp.getId());
    System.out.println("EMPLOYEE NAME >>>" + emp.getName());
  } // psv Main
} // end class Test
