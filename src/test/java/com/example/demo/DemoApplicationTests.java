package com.example.demo;

import com.example.demo.dao.PersonDAO;
import com.example.demo.dao.TestModelDAO;
import com.example.demo.models.Person;
import com.example.demo.models.TestModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    TestModelDAO testModelDAO;
    @Autowired
    PersonDAO personDAO;

    @Test
    void contextLoads() {

        List<Person> persons = personDAO.findAllBySurName("Кузнецов");
        persons.forEach(p->
                {        p.getAccount().getPassword();
        TestModel testModel = testModelDAO.findByPersonId(p.getId());
                System.out.println(p.getSurName() + " "+ testModel.getLogin() + " " + testModel.getPassword());}
        );
        System.out.println(persons);
        /*Person person = personDAO.save(new Person("Кузнецов", "Дмитрий","Юрьевич"));
        testModelDAO.save(new TestModel(person.getId(), "dima", "dima"));*/
        /*TestModel testModel = testModelDAO.findById(3L).orElse(new TestModel());
        System.out.println(testModel.getLogin() + " " +testModel.getPassword());
        TestModel testModel1 = testModelDAO.save(new TestModel(101L, "dima1", "1463111111nd"));
        System.out.println(testModel1.getId());*/
    }

}
