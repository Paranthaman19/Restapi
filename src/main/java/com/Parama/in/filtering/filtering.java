package com.Parama.in.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class filtering {
	  @GetMapping("/ststic-filtering")
      public  SomeBean filtering1(){
    	  return new SomeBean("value1","value2","value3");
      }
	  @GetMapping("/filtering_list")
      public  List<SomeBean> filtering2(){
    	  return Arrays.asList(new SomeBean("value1","value2","value3"),new SomeBean("value4","value5","value6"));
      }
	  @GetMapping("/dynamic-filtering")
      public  MappingJacksonValue filtering3(){
		  SomeBean somebean = new SomeBean("value1","value2","value3");
		  MappingJacksonValue mappingjacksonvalue=new MappingJacksonValue(somebean);
		  SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("field3","field2");
		  FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
		  mappingjacksonvalue.setFilters(filters);
		  return mappingjacksonvalue;
      }
}
