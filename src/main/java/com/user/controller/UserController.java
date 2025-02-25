package com.user.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.dao.UserDataDAO;
import com.user.dto.UserDataDTO;
import com.user.entity.UserData;
import com.user.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	UserService service;

	// single user
	@RequestMapping(path = "/create", method = RequestMethod.POST, consumes = { "application/xml",
			"application/json" }, produces = "application/json")
	public ResponseEntity<String> createUser(@Valid @RequestBody UserDataDTO dto) {
		UserData data = service.createSingleUser(dto);
		return new ResponseEntity<String>("One Record Created Successfully Email Id is : "+dto.getEmail(), HttpStatus.CREATED);
	}

	// multiple user

	/*
	 * @PostMapping(path = "/creates", consumes = "application/json" ,produces
	 * ="application/json" ) public ResponseEntity<String>
	 * createMultipleUsers(@RequestBody List<UserDataDTO> dto) { String data =
	 * service.createMoreUsers(dto); if(data.isEmpty()) { return new
	 * ResponseEntity<String>("Falied to Insert Group Of Data into Database "
	 * ,HttpStatus.BAD_REQUEST); }else { return new ResponseEntity<String>(data,
	 * HttpStatus.CREATED); }
	 * 
	 * }
	 */

	@GetMapping(value = "/get")
	public List<UserDataDAO> getAllUserData() {
		List<UserDataDAO> userDataDAOs = service.getAllUserData();
		return userDataDAOs;
	}

	@GetMapping(path = "/email/{email}")
	public UserDataDAO getUserBasedOnEmailId(@PathVariable("email") String email) {
		return service.getUserBasedOnEmailId(email);

	}

	@GetMapping(path = "/city/{city}")
	public List<UserDataDAO> getBasedOnCityAndGender(@PathVariable("city") String city,
			@RequestParam(required = false) String gender) {
		if (gender != null) { // Male!=null => true
			return service.getByCityAndGender(city, gender);
		} else {
			return service.getByCity(city);
		}
	}

	@GetMapping(path = "{city}")
	public List<UserDataDAO> getBasedOnCityAndAge(@PathVariable("city") String city,
			@RequestParam(required = false) Integer age) {
		Integer ages = age;
		if (ages != null) { // Male!=null => true
			return service.getByCityAndAge(city, age);
		} else {
			return service.getByCity(city);
		}
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<UserDataDAO> getByAge(@RequestParam(required = false) Integer age) {
		if (age != null) {
			return service.getByAge(age);
		} else {
			return service.getAllUserData();
		}
	}

	// FIND BASED ON ID
	@GetMapping("/id/{id}")
	public ResponseEntity<UserDataDAO> getUserById(@PathVariable Long id) {
		UserDataDAO user = service.getUserById(id);
		if (user == null) {
			return ResponseEntity.notFound().build(); // Return 404 if user not found
		}
		return ResponseEntity.ok(user); // Return 200 OK with the user data
	}

	// Update Operation
	@PutMapping(value = "/update/{email}")
	public ResponseEntity<String> updateContact(@RequestParam long contact, @PathVariable("email") String email) {
		if (email.equalsIgnoreCase(email)) {
			String result = service.updateUserContact(email, contact);
			return new ResponseEntity<String>(result, HttpStatusCode.valueOf(200));
		} else {
			return new ResponseEntity<>("Cannot Update Contact without Valid Email", HttpStatus.NO_CONTENT);
		}
	}
}
