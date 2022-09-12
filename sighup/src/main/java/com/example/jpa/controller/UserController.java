package com.example.jpa.controller;

import javax.persistence.GeneratedValue;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.dto.UserDetailsDto;
import com.example.jpa.model.UserDetails;
import com.example.jpa.repo.UserRepository;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	 private UserRepository userrepository;
	
	
	@PostMapping("/addUser")
	public UserDetails addUser(@RequestBody UserDetails userDetails) {
		
		return userrepository.save(userDetails);
		
	}

	
	@GetMapping("getuser")
	public UserDetailsDto findUserDetailsByIdDetails(@PathParam("id") int id) { 
		System.out.println(id);
		
		UserDetailsDto detailsDto = new UserDetailsDto();
		

		UserDetails details= userrepository.getById(id);
		detailsDto.setFname(details.getFname());
		detailsDto.setEmail(details.getEmail());
		detailsDto.setLname(details.getLname());
		detailsDto.setId(details.getId());
		detailsDto.setPassword(details.getPassword());
		 return detailsDto;
	}
	

		

}
