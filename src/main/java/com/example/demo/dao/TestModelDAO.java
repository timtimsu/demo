package com.example.demo.dao;

import com.example.demo.models.TestModel;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author timtims
 * @date 19.09.2020
 */

@Transactional
public interface TestModelDAO extends CrudRepository<TestModel, Long> {
    Optional<TestModel> findById(Long id);
}
