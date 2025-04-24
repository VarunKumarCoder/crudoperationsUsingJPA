package com.cd.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.cd.service.IOneToManyPerson;

public class MapingRunner implements CommandLineRunner {

	@Autowired
	private IOneToManyPerson person;
	@Override
	public void run(String... args) throws Exception {
		person.saveDataUsingParent();
		person.saveDataUsingChild();
		person.loadDataUsingParent();

	}

}
