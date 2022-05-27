package com.simplilearn.basics;

public class BillGatesCar{
public static void main(String[] args)
{
Car c = new Car() {	
public void start() {
System.out.println("Start the car");
}
public void stop() {
System.out.println("Stop the car");
}
public void changeGear() {
System.out.println("The car changed gears");
}
};
c.start();
c.stop();
c.changeGear();
}
}