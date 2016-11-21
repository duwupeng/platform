package com.beizhi.cloud.ms;

import com.beizhi.cloud.ms.entity.Student;
import com.beizhi.cloud.ms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

/**
 * Created by eric on 16/11/19.
 */
public class MongoApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository repository;

    @Override
    public void run(String... args) throws Exception {
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

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MongoApplication.class, args);
    }
}