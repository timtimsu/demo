package com.example.demo.dao;

import com.example.demo.models.Person;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author timtims
 * @date 26.09.2020
 */
@Transactional
public interface PersonDAO extends CrudRepository<Person,Long> {

    List<Person> findAllBySurName(String surName);

}
