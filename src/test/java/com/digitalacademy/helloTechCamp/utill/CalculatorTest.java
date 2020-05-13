package com.digitalacademy.helloTechCamp.utill;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {
  private final Calculator calculator = new Calculator();

  @Test
  void testAddFunc() {
    final int resp = calculator.add(1, 2);
    assertEquals(3, resp);
    assertEquals(4, calculator.add(3, 1));
  }

  @Test
  void testMinusFunc() {
    final int resp = calculator.minus(2, 2);
    assertEquals(0, resp);
    assertEquals(5, calculator.minus(10, 5));
  }

  @Test
  void testMultiplyFunc() {
    final int resp = calculator.multiply(2, 2);
    assertEquals(4, resp);
    assertEquals(3, calculator.multiply(3, 1));
  }

  @Test
  void testDivideFunc() {
    final int resp = calculator.divide(2, 2);
    assertEquals(1, resp);
    assertEquals(20, calculator.divide(100, 5));
  }
}