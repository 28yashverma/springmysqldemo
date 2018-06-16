package com.springmysql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmysql.model.Person;
import com.springmysql.repository.DemoRepository;

@RestController
public class DemoController {

	@Autowired
	private DemoRepository demoRepo;

	public static List<Person> loadData() {
		List<Person> p = new ArrayList<>();
		p.add(new Person("Yeshendra", "Chinhat"));
		p.add(new Person("Manish", "Chinhat"));
		p.add(new Person("Milit", "Thakurganj"));
		return p;
	}

	@GetMapping("/list")
	public List<Person> list() {
		demoRepo.saveAll(loadData());
		System.out.println("Retrieving data");
		return demoRepo.findAll();
	}

}
