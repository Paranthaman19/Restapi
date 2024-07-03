package com.Parama.in.user;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class UserResources {
       private UserDaoService service;

	   public UserResources(UserDaoService service) {
	   this.service =service;
	   }
	   @GetMapping("/users")
	   public List<User> retrieveAllUsers(){
		     return service.findAll();
		     }
	   @GetMapping("/user/{id}")
	   public User retrieveUser(@PathVariable int id){
		     User user=service.findOne(id);
		     if (user==null) 
		    	 throw new UserNotFoundException("id:"+id);
		     return user;
		     }
	   @DeleteMapping("/user/{id}")
	   public void deleteUser(@PathVariable int id){
		      service.deleteByid (id);
		     
		     }
       @PostMapping("/user")
       public void createUsers(@Valid @RequestBody User user ) {
    	   service.save(user);
       }
       
}
