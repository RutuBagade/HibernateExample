package com.dss;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;  
import javax.persistence.Table;  
  
@Entity  
@Table(name= "employee")   
public class Employee {    
  
@Id   
@Column
@GeneratedValue
private int id;  
@Column
private String firstName,lastName;    
    
public int getId() {    
    return id;    
}    
public void setId(int id) {    
    this.id = id;    
}    
public String getFirstName() {    
    return firstName;    
}    
public void setFirstName(String firstName) {    
    this.firstName = firstName;    
}    
public String getLastName() {    
    return lastName;    
}    
public void setLastName(String lastName) {    
    this.lastName = lastName;    
}    
}   
