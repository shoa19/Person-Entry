package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user")
public class PersonController {
// This class is responsible for handling all requests to the "/user" endpoint.
	@Autowired
	PersonService personService;
// This method is used to create a new user.
	@PostMapping
	void saveUser(@RequestBody Person user) {
		personService.saveUser(user);
		System.out.println("user created " + user.getName());
	}
// This method is used to get all users.
	@GetMapping
	Iterable<Person> getUser() {
		personService.getAllUsers();
		return personService.getAllUsers();
	}
	
	@GetMapping("/{id}")

	public Person getById(@PathVariable int id) {

		return personService.getById(id);

}


}