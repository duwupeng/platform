package com.beizhi.cloud.ms.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by eric on 16/11/19.
 */
public class Student {
    @Id
    private String id;

    private String firstName;
    private String lastName;



    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return String.format("Student[id=%s, firstName='%s', lastName='%s']", id,
                firstName, lastName);
    }

}
