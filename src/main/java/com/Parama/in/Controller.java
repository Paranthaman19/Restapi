package com.Parama.in;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private MessageSource messageSource;
	public Controller(MessageSource messageSource) {
		this.messageSource=messageSource;
	}
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
     @GetMapping(path="/helloworld-internationalized")
     public String helloworldInternationalized() {
    	 
    	 Locale locale=LocaleContextHolder.getLocale();
		 return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
    	
     }
}
