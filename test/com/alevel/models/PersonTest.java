package com.alevel.models;

import com.alevel.constants.Gender;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void createPersonTestSuccess(){
        Person person = new Person("Ivan", 18, Gender.MALE);
        assertEquals("Ivan", person.getName());
        assertEquals(18, person.getAge());
        assertEquals(Gender.MALE, person.getGender());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createPersonTestFailure(){
        new Person("Ivan", 101, Gender.MALE);
    }
}