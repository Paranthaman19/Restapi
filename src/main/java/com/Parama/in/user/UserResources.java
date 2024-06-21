package com.Parama.in.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResources {
       private UserDaoService service;

	   public UserResources(UserDaoService service) {
	   this.service =service;
	   }
	   @GetMapping("/user")
	   public List<User> retrieveAllUsers(){
		     return service.findAll();
		     }
       
       
}
