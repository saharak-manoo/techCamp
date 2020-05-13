package com.digitalacademy.helloTechCamp.utill;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
  
  public int add(final int num1, final int num2) {
    return num1 + num2;
  }

  public int minus(final int num1, final int num2) {
    return num1 - num2;
  }

  public int multiply(final int num1, final int num2) {
    return num1 * num2;
  }

  public BigDecimal divide(final BigDecimal num1, final BigDecimal num2) {
    return num1.divide(num2, 3, RoundingMode.CEILING);
  }
}