package com.Parama.in.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users=new ArrayList<>();
    private static  int usercount=0;
    static {
    	users.add(new User(++usercount,"chandru",LocalDate.now().minusYears(20 )));
    	users.add(new User(++usercount,"tharun",LocalDate.now().minusYears(21 )));
    	users.add(new User(++usercount,"viki",LocalDate.now().minusYears(30 )));	
    }
	
     public List<User> findAll(){
    	 return users;
    	 
     }
     public User save(User user) {
    	 user.setId(++usercount);
    	 users.add(user);
    	 return user;
     }
     public User findOne(int id){
    	 Predicate<? super User> predicate =user -> user.getId().equals(id);
    	 return users.stream().filter(predicate).findFirst().get();
     }
     public void deleteByid(int id){
    	 Predicate<? super User> predicate =user -> user.getId().equals(id);
    	 users.removeIf(predicate);
     }
     
}
