package com.kyle.spring.springcore.reftypes;

public class Student {

  // Field(s)
  private Scores scores;

  // Getters & Setters
  public Scores getScores() {
    return scores;
  }

  public void setScores(Scores scores) {
    this.scores = scores;
  }


  @Override
  public String toString() {
    return "Student{" +
            "scores=" + scores +
            '}';
  }
}
