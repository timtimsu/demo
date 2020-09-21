package com.example.demo;

import com.example.demo.dao.TestModelDAO;
import com.example.demo.models.TestModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    TestModelDAO testModelDAO;

    @Test
    void contextLoads() {

        TestModel testModel = testModelDAO.findById(3L).orElse(new TestModel());
        System.out.println(testModel.getLogin() + " " +testModel.getPassword());
        TestModel testModel1 = testModelDAO.save(new TestModel(101L, "dima1", "1463111111nd"));
        System.out.println(testModel1.getId());
    }

}
