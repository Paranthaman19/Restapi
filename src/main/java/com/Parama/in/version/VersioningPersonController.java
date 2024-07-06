package com.Parama.in.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	   @GetMapping("v1/person")//URL Versioning
       public PersonV1 getFirstVersionofPerson() {
		   return new PersonV1("Ennamo Yedho");
	   }
	   @GetMapping("v2/person")//URL Versioning
       public PersonV2 getSecondVersionofPerson() {
		   return new PersonV2(new Name("Ennamo","Yedho"));
	   }
	   @GetMapping(path="person",params = "version=1")//Request Parameter Versioning
       public PersonV1 getFirstVersionofPersonRequestParameter() {
		   return new PersonV1("Ennamo Yedho");
	   }
	   @GetMapping(path="person",params = "version=2")//Request Parameter Versioning
       public PersonV2 getSecondVersionofPersonRequestParameter() {
		   return new PersonV2(new Name("Ennamo","Yedho"));
	   }
	   @GetMapping(path="person",headers = "X-API-VERSION=1")//Header Versioning
       public PersonV1 getFirstVersionofPersonHeader1() {
		   return new PersonV1("Ennamo Yedho");
	   }
	   @GetMapping(path="person",headers = "X-API-VERSION=2")//Header Versioning
       public PersonV2 getSecondVersionofPersonHeader2() {
		   return new PersonV2(new Name("Ennamo","Yedho"));
	   }
	   @GetMapping(path="person",produces  = "application/vnd.company.app-v1+json")//Accept Header Versioning
       public PersonV1 getFirstVersionofPersonAcceptHeader1() {
		   return new PersonV1("Ennamo Yedho");
}
	   @GetMapping(path="person",produces = "application/vnd.company.app-v2+json")//Header Versioning
       public PersonV2 getSecondVersionofPersonAcceptHeader2() {
		   return new PersonV2(new Name("Ennamo","Yedho"));
	   }
}