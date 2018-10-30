package com.alevel.models;

import com.alevel.constants.Gender;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest5 {
    @Test
    public void createPersonTestSuccess(){
        Person person = new Person("Ivan", 18, Gender.MALE);
        assertEquals("Ivan", person.getName());
        assertEquals(18, person.getAge());
        assertEquals(Gender.MALE, person.getGender());
    }

    @Test
    public void createPersonTestFailure(){
        assertThrows(IllegalArgumentException.class, () -> new Person("Ivan", 101, Gender.MALE));
    }

}