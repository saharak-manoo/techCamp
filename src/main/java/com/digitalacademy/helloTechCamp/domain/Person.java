package com.digitalacademy.helloTechCamp.domain;

public class Person {
  private String firstName;
  private String lastName;
  private String nickName;
  private Integer age;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Person(String firstName, String lastName, String nickName, Integer age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.age = age;
  }

  public Person() { }
}