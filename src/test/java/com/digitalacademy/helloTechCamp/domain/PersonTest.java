package com.digitalacademy.helloTechCamp.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonTest {
  private final Person person = new Person("Saharak", "Manoo", "Dove", 23);

  @Test
  void testGetPerson() {
    assertEquals("Saharak", person.getFirstName());
    assertEquals("Manoo", person.getLastName());
    assertEquals("Dove", person.getNickName());
    assertEquals(23, person.getAge());

    assertAll("person", 
      () -> assertEquals("Saharak", person.getFirstName()),
      () -> assertEquals("Manoo", person.getLastName()),
      () -> assertEquals(23, person.getAge())
    );

    String firstName = person.getFirstName();
    assertNotNull(firstName);

    assertAll("first name",
      () -> assertTrue(person.getFirstName().startsWith("S"))
    );
  }

  @Test
  void testNewPersonObject() {
    Person person = new Person();
    person.setFirstName("Saharak");
    person.setLastName("Manoo");
    person.setNickName("Dove");

    assertAll("first name", 
      () -> assertTrue(person.getFirstName().startsWith("S"))
    );
  }
}