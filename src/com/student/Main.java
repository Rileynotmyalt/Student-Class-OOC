package com.student;

class Main {
  public static void main(String[] args) {
    Student carl = new Student("Carl");

    String shoes = "Boots";
    System.out.println("\n" + carl.height + " in");
    System.out.println(carl.name + " put on " + shoes);
    carl.shoeChoice(shoes);
    System.out.println(carl.height + " in");

    int minRunning = 60;
    System.out.println("\n" + carl.weight + " lbs");
    System.out.println(carl.name + " ran for " + minRunning + " minutes");
    carl.run(minRunning);
    System.out.println(carl.weight + " lbs\n");

    double effortPercent = 0.8;
    System.out.printf("%.2f",(carl.grade * 100));
    System.out.println("%\n" + carl.name + " put in " + (effortPercent * 100) + "% effort");
    carl.effort(effortPercent);
    System.out.printf("%.2f",(carl.grade * 100));
    System.out.print("%");

    String hairDye = "Blonde";
    System.out.println("\n\n" + carl.hairColor);
    System.out.println(carl.name + " Dyed their hair " + hairDye);
    carl.dyeHair(hairDye);
    System.out.println(carl.hairColor);

    String contactColor = "Blue";
    System.out.println("\n" + carl.eyeColor);
    System.out.println(carl.name + " put in " + contactColor + " contacts");
    carl.contactColor(contactColor);
    System.out.println(carl.eyeColor);

    double stressLevel = 0.3;
    System.out.println("\n" + carl.weight + " lbs ," + carl.grade + "%");
    System.out.println(carl.name + " was " + (stressLevel * 100) + "% Stressed");
    carl.stress(stressLevel);
    System.out.println(carl.weight + " lbs ," + carl.grade + "%");

    Student sarah = new Student("Sarah");
    System.out.println("\nNew Student: Sarah");
    System.out.println(sarah.name + "'s friends: " + sarah.friends);
    System.out.println(carl.name + "'s friends: " + carl.friends);
    System.out.println("Add " + sarah.name + " to " + carl.name + "'s friends list");
    carl.addFriend(sarah);
    System.out.println(sarah.name + "'s friends: " + sarah.getFriendsList());
    System.out.println(carl.name + "'s friends: " + carl.getFriendsList());
  }
}