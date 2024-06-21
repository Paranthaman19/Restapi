package com.Parama.in.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users=new ArrayList<>();
    static {
    	users.add(new User(1,"chandru",LocalDate.now().minusYears(20 )));
    	users.add(new User(1,"tharun",LocalDate.now().minusYears(21 )));
    	users.add(new User(1,"viki",LocalDate.now().minusYears(30 )));	
    }
     public List<User> findAll(){
    	 return users;
    	 
     }
}
