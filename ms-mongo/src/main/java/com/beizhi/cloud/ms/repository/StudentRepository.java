package com.beizhi.cloud.ms.repository;

import com.beizhi.cloud.ms.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by eric on 16/11/19.
 */
public interface StudentRepository  extends MongoRepository<Student, String> {

    public Student findByFirstName(String firstName);

    public List<Student> findByLastName(String lastName);

}