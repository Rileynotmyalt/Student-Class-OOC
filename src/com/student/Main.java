package com.student;

class Main {
  public static void main(String[] args) {
    Student carl = new Student();

    String shoes = "Boots";
    System.out.println("\n" + carl.height + " in");
    System.out.println("Put on " + shoes);
    carl.shoeChoice(shoes);
    System.out.println(carl.height + " in");

    int minRunning = 60;
    System.out.println("\n" + carl.weight + " lbs");
    System.out.println("Ran for " + minRunning + " minutes");
    carl.run(minRunning);
    System.out.println(carl.weight + " lbs\n");


    double effortPercent = 0.8;
    System.out.printf("%.2f",(carl.grade * 100));
    System.out.println("%\nPut in " + (effortPercent * 100) + "% effort");
    carl.effort(effortPercent);
    System.out.printf("%.2f",(carl.grade * 100));
    System.out.print("%");
    
  }
}