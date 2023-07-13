class AcTester{

public static void main(String test[]){
	
  boolean connected = Ac.onOroff();
  System.out.println("is AC connected "+connected);
  Ac.increaseTemp();
   Ac.increaseTemp();
    Ac.increaseTemp();
	 Ac.increaseTemp();
	  Ac.increaseTemp();
   boolean connected1 = Ac.onOroff();
  System.out.println("is AC connected "+connected1);
   Ac.increaseTemp();
    Ac.increaseTemp();
	 Ac.increaseTemp();
	  Ac.increaseTemp();
  boolean connected3 = Ac.onOroff();
  System.out.println("is AC connected "+connected3);
  Ac.decreaseTemp();
  Ac.decreaseTemp();
    boolean connected2 = Ac.onOroff();
 System.out.println("is AC connected "+connected2);
 Ac.decreaseTemp();
  Ac.decreaseTemp();
  Ac.decreaseTemp();
  Ac.decreaseTemp();
  
  
}
}
