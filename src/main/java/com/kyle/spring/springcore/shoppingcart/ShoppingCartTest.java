package com.kyle.spring.springcore.shoppingcart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingCartTest {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("shoppingcart.xml");
    ShoppingCart shoppingcart = (ShoppingCart) ctx.getBean("shoppingcart");
    System.out.println(shoppingcart);
  }
}
