package com.alevel;

import com.alevel.constants.Gender;
import com.alevel.models.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	Student oleh = new Student("oleh", 20, Gender.FEMALE, "QWE1234", 4.5);
    Student anna = new Student("anna", 21, Gender.FEMALE, "QWE1234", 2.5);
    Student taras = new Student("taras", 24, Gender.MALE, "QWE1234", 3.5);
    Student meph = new Student("meph", 12, Gender.MALE, "QWE1234", 4.1);
    Student inna = new Student("inna", 28, Gender.FEMALE, "QWE1234", 4.2);
	Student[] students =  {oleh, anna, taras, meph, inna};

	//Arrays.sort(students);

	Arrays.sort(students, (o1, o2) -> {
        if(o1.getGpa() > o2.getGpa()){
            return 1;
        }
        if (o1.getGpa() == o2.getGpa()){
            return 0;
        }
        return -1;
    });

	System.out.println(Arrays.toString(students));

    }
}
