package com.student;

import java.text.DecimalFormat;

public class Student {
  int height = 69;
  double grade = 0.75;
  int weight = 150;
  String hairColor = "Brown";
  String eyeColor = "Brown";

  // creates a default constructor where no values need to be assigned
  public Student(){}

  public Student(int height, double grade, int weight, String hairColor, String eyeColor){
    this.height = height;
    this.grade = grade;
    this.weight = weight;
    this.hairColor = hairColor;
    this.eyeColor = eyeColor;
  }

  /** Define a Shoe Name, Height will increase accordingly*/
  public void shoeChoice(String shoe){
    switch (shoe) {
      case "Tennis":
        height += 1;
        break;
      case "Boots":
        height += 2;
        break;
      case "Platform":
        height += 3;
      default:
        break;
    }
  }

  /** Time in minutes running, weight will decrease accordingly */
  public void run(int time) {
    if (time >= 60)
      weight -= 3;
    else if (time >= 30)
      weight -= 2;
    else if (time >= 15)
      weight -= 1;
  }

  /** effort as a %, grade will increase accordingly */
  public void effort(double effort) {
    grade += (effort >= 0.5) ? (effort / 4)-.5 : -effort;
    grade = (grade < 0) ? 0 : grade;
    grade = (grade > 1) ? 1 : grade;
  }

  /** change hair color */
  public void dyeHair(String color) {
    hairColor = color;
  }

  /** change eye color */
  public void contactColor(String color) {
    eyeColor = color;
  }

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

}