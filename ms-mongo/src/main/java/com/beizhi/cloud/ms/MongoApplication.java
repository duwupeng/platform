package com.beizhi.cloud.ms;

import com.beizhi.cloud.ms.entity.Student;
import com.beizhi.cloud.ms.repository.DynamicRepository;
import com.beizhi.cloud.ms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by eric on 16/11/19.
 */
@SpringBootApplication
public class MongoApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private DynamicRepository dynamicRepository;

    public void run1(String... args) throws Exception {
        this.repository.deleteAll();

        // save a couple of customers
        this.repository.save(new Student("Alice", "Smith"));
        this.repository.save(new Student("Bob", "Smith"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Student customer : this.repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(this.repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Student customer : this.repository.findByLastName("Smith")) {
            System.out.println(customer);
        }
    }



    @Override
    public void run(String... args) throws Exception {
        this.dynamicRepository.deleteAll();


        Map map = new HashMap<String,String>();
        map.put("exF3","extended3");
        map.put("exF4","extended4");
        map.put("exF5","extended5");

//        Student s = new Student("Alice", "Smith");
//        s.setExtendedFields(map);

        this.dynamicRepository.save(map);





        Map map1 = new HashMap<String,String>();
        map1.put("exF1","extended1");
        map1.put("exF2","extended2");
        map1.put("exF3","extended3");
        map1.put("exF4","extended4");
        map1.put("exF5","extended5");

//        Student s = new Student("Alice", "Smith");
//        s.setExtendedFields(map);

        this.dynamicRepository.save(map1);



        System.out.println(this.dynamicRepository.findOne("exF1"));
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MongoApplication.class, args);
    }
}