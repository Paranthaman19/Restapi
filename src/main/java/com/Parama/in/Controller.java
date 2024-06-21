package com.Parama.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     @GetMapping(path="/hi")
     public String helloworld() {
    	 return "helloworld";
     }
     @GetMapping(path="/hibean")
     public Helloworldbean helloworldbean() {
    	 return new Helloworldbean  ("helloworld");
     }
     @GetMapping(path="/hibean/{name}")
     public Helloworldbean helloworldbean(@PathVariable String name) {
    	 return new Helloworldbean  ("helloworld"+ name);
     }
}
