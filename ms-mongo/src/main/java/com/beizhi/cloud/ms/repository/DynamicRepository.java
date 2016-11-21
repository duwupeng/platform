package com.beizhi.cloud.ms.repository;

import com.beizhi.cloud.ms.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by eric on 16/11/19.
 */
public interface DynamicRepository extends MongoRepository<Map<String,String>, String> {
}