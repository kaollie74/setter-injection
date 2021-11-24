package com.kyle.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("setconfig.xml");
    CarDealer carDealer = (CarDealer) ctx.getBean("carDealer");
    System.out.println(carDealer.getModels());
    System.out.println(carDealer.getName());
  }
}
