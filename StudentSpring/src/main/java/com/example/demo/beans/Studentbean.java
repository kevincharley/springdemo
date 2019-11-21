package com.example.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="SPRING_STUDENT_TB")
public class Studentbean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ")
	@SequenceGenerator(sequenceName = "KEVIN_SEQ",allocationSize = 1,name = "SEQ")
private int id;
private String name;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
