package com.project.demo;



public class Person {
    
    private String name;
    private int age;
    private double points;
    private String hobby;
 
    

    public Person(String name, int age, double points, String hobby){
    this.name = name;
    this.age = age;
    this.points = points;
    this.hobby = hobby;

    }
    //Getters ja setters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getPoints(){
        return this.points;
    }
    public String getHobby(){   
        return this.hobby;
    }

    
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
  }
    public void setHobby(String hobby){
        this.hobby = hobby;
  }
    public void setPoints(Double points){
        this.points = points;
  }

}


