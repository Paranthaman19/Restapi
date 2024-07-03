package com.Parama.in.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {

 public Integer id;
public User(Integer id, String name, LocalDate birthdate) {
	super();
	this.id = id;
	this.name = name;
	this.birthdate = birthdate;
}
@Size(min=2)
public String name;
@Past
 public LocalDate birthdate;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getBirthdate() {
	return birthdate;
}
public void setBirthdate(LocalDate birthdate) {
	this.birthdate = birthdate;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
}
}
