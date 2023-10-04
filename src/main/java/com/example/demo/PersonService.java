package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//This annotation marks the class as a Spring service
@Service
public class PersonService {
// This annotation autowires the UserRepository dependency
	@Autowired
	PersonRepository repository;
	void saveUser(Person user) {
		repository.save(user);
		System.out.println("user created " + user.getName());
}
	public Iterable<Person> getAllUsers() {
		return repository.findAll();
	}
	public void deleteUser(int id) {
		repository.deleteById(id);	
	}
	
	public Person getById(int id) {
        return repository.findById(id).orElse(null);

    }
}