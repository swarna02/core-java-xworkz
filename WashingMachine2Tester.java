class WashingMachine2Tester{

public static void main(String test[]){
	
  boolean connected = WashingMachine2.onOroff();
  System.out.println("is Washing Machine connected "+connected);
  WashingMachine2.increaseTime();
  WashingMachine2.increaseTime();
  WashingMachine2.increaseTime();
  WashingMachine2.increaseTime();
  WashingMachine2.increaseTime();
  
   boolean connected1 = WashingMachine2.onOroff();
  System.out.println("is Washing Machine connected "+connected1);
   WashingMachine2.increaseTime();
  WashingMachine2.increaseTime();
  WashingMachine2.increaseTime();
  WashingMachine2.increaseTime();
  WashingMachine2.increaseTime();
  boolean connected3 = WashingMachine2.onOroff();
  System.out.println("is Washing Machine connected "+connected3);
  WashingMachine2.decreaseTime();
  WashingMachine2.decreaseTime();
  WashingMachine2.decreaseTime();
  WashingMachine2.decreaseTime();
    boolean connected2 = WashingMachine2.onOroff();
 System.out.println("is Washing Machine connected "+connected2);
  WashingMachine2.decreaseTime();
  WashingMachine2.decreaseTime();
  WashingMachine2.decreaseTime();
  WashingMachine2.decreaseTime();
  
  
}
}