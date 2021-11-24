package com.kyle.spring.springcore.list;

import java.util.List;

public class Hospital {
  // Fields
  private String name;
  private List<String> departments;

  // Getters & Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getDepartments() {
    return departments;
  }

  public void setDepartments(List<String> departments) {
    this.departments = departments;
  }
} // end class Hospital
