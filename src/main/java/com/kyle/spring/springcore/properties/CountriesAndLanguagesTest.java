package com.kyle.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountriesAndLanguagesTest {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("propertiesconfig.xml");
    // .getBean("countriesAndLangs") comes from the bean name in propertiesconfig.xml file
    CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages) ctx.getBean("countriesAndLangs");
    System.out.println(countriesAndLangs.toString());
  }
}
