package com.Parama.in.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class filtering {
	  @GetMapping("/filtering")
      public  SomeBean filtering1(){
    	  return new SomeBean("value1","value2","value3");
      }
}
