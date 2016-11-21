package com.beizhi.cloud.ms.entity;

import org.springframework.data.annotation.Id;

import java.util.Map;

/**
 * Created by eric on 16/11/19.
 */
public class Student {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Map<String,String> extendedFields;



    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Map<String, String> getExtendedFields() {
        return extendedFields;
    }

    public void setExtendedFields(Map<String, String> extendedFields) {
        this.extendedFields = extendedFields;
    }

    @Override
    public String toString() {
        return String.format("Student[id=%s, firstName='%s', lastName='%s']", id,
                firstName, lastName);
    }

}
