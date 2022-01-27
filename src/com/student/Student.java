package com.student;

import java.util.HashMap;
import java.util.ArrayList;

// TODO:
//  - make all f() based
//  - stdev of stats?

public class Student {
  String name = "Student Name";
  int height = 69;
  int studentHeight = 69;
  double grade = 0.75;
  int weight = 150;
  String hairColor = "Brown";
  String eyeColor = "Brown";

  ArrayList<Student> friends = new ArrayList<Student>();

  // creates a default constructor where no values need to be assigned
  public Student(String name){this.name = name;}

  public Student(String name, int height, double grade, int weight, String hairColor, String eyeColor){
    this.name = name;
    this.height = height;
    this.studentHeight = height;
    this.grade = grade;
    this.weight = weight;
    this.hairColor = hairColor;
    this.eyeColor = eyeColor;
  }

  /** Define a Shoe Name, Height will increase accordingly*/
  // TODO: - add more shoes
  //       - maybe double height?
  public void shoeChoice(String shoe){
    HashMap<String,Integer> shoes = new HashMap<String,Integer>();
    shoes.put("Tennis", 1);
    shoes.put("Boots", 2);
    shoes.put("Platform", 3);

    height = studentHeight + shoes.get(shoe);
  }

  /** Time in minutes running, weight will decrease accordingly */
  public void run(int time) {
    weight -= (int)(time * 0.05);
  }

  /** effort as a %, grade will increase or decrease logistically */
  public void effort(double effort) {
    grade = 1 / (1 + Math.pow(3,-3*(effort)));
  }

  /** change hair color */
  public void dyeHair(String color) {
    hairColor = color;
  }

  /** change eye color */
  public void contactColor(String color) {
    eyeColor = color;
  }

  // apply similar logistic function to stress
  /** stress as a % weight and grade will be affected accordingly */
  public void stress(double stressLevel){
    if (stressLevel >= 0.5) {
      grade -= 0.15;
      weight += 5;
    } else if (stressLevel >= 0.25) {
      grade -= 0.1;
      weight += 3;
    } else if (stressLevel >= 0.1) {
      grade -=0.05;
      weight += 1;
    }
  }

  /** Adds a Student to this student's friends list */
  public void addFriend(Student friend) {
    friends.add(friend);
    friend.friends.add(this);
  }

  /** Gets an ArrayList of names of friends */
  ArrayList<String> fListNames = new ArrayList<String>();
  public ArrayList<String> getFriendsList() {
    for (int i = 0; (i < friends.size()); i++) {
      fListNames.add(friends.get(i).name);
    }
    return fListNames;
  }
}