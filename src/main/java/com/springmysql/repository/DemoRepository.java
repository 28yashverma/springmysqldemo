package com.springmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springmysql.model.Person;

public interface DemoRepository extends JpaRepository<Person, Integer> {

}
