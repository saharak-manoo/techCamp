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
    int resp = calculator.add(1, 2);
    assertEquals(2, resp);
    assertEquals(4, calculator.add(3, 1));
  }

  @Test
  void testMinusFunc() {
    int resp = calculator.minus(2, 2);
    assertEquals(0, resp);
    assertEquals(5, calculator.minus(10, 5));
  }

  @Test
  void testMultiplyFunc() {
    int resp = calculator.multiply(2, 2);
    assertEquals(4, resp);
    assertEquals(3, calculator.multiply(3, 1));
  }

  @Test
  void testDivideFunc() {
    BigDecimal num1, num2;

    num1 = new BigDecimal("16");
    num2 = new BigDecimal("2");
    BigDecimal resp = calculator.divide(num1, num2);
    assertEquals(8, resp);
    assertEquals(0.125, calculator.divide(num2, num1));
  }
}