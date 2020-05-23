package com.aswin;

// We are extending the Machine abstract class here, we have to implement the abstract methods mentioned in Machine. It can also access "name" variable in Machine class.
public class Car extends Machine {
  @Override
  public void work() {
    System.out.println("Car is working");
  }
}
