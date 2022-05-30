package com.virola.firstspringweb;

public class Student{
  private Long id;
  private String firstName;
  private String lastName;
  
  public Student(){
    
  }
  
  public Student(Long id, String firstName, String lastName){
     this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    
  }
  
  public Student(String firstName, String lastName){ 
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  
  public Long getId(){
   return id; 
  }
  
  public void setId(Long id){
   this.id = id; 
  }
}
