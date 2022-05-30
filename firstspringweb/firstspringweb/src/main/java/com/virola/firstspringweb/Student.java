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
  
  private Long getId(Long id){
   this.id = id; 
  }
  
  private setId(Long id){
   this.id = id; 
  }
}
