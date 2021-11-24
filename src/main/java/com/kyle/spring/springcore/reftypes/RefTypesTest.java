package com.kyle.spring.springcore.reftypes;

import com.kyle.spring.springcore.properties.CountriesAndLanguages;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTypesTest {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("reftypesconfig.xml");
    // .getBean("countriesAndLangs") comes from the bean name in propertiesconfig.xml file
    Student student = (Student) ctx.getBean("student");
    System.out.println(student);
  }
}
