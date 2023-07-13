class DoorDash{
public static double search(String foodName){
    
	if("peas pulav" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 125.00;
	}
   if("steamed rice" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 99.00;
	}
	if("egg sandwich" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 89.00;
	}
	if("kebab roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 99.00;
	}
	if("masala wai wai" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 99.00;
	}
	if("fried egg sandwich" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 165.00;
	}
	if("chatpata bhel ala wai wai" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 99.00;
	}
	if("wai wai sandwich" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 162.00;
	}
	if("pan cake with chocoate syrup" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 168.00;
	}
	if("romal roti with egg masala" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 175.00;
	}
	if("omlet with fries" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 185.00;
	}
	if("navarathan dal" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 144.00;
	}
	if("scambled paneer" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 220.00;
	}
	if("roasted bhindi" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 84.00;
	}
	if("chilly egg" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 134.00;
	}
	if("rotti with navarathan combo" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 110.00;
	}
	if("rice with murgh lapabdar combo" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 225.00;
	}
	if("ghee rice" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 110.00;
	}
	if("meti chicken" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 240.00;
	}
	if("dahi chicken" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 240.00;
	}
    return 0.0;
   
   } 

   
   //Method overloading
   public static double search(String foodName , int quantity){
    
	if("peas pulav" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 125.00 * quantity;
	}
   if("steamed rice" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 99.00 * quantity;
	}
	if("egg sandwich" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 89.00 * quantity;
	}
	if("kebab roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 99.00 * quantity;
	}
	if("masala wai wai" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 99.00 * quantity;
	}
	if("fried egg sandwich" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 165.00 * quantity;
	}
	if("chatpata bhel ala wai wai" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 99.00 * quantity;
	}
	if("wai wai sandwich" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 162.00 * quantity;
	}
	if("pan cake with chocoate syrup" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 168.00 * quantity;
	}
	if("romal roti with egg masala" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 175.00 * quantity;
	}
	if("omlet with fries" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 185.00 * quantity;
	}
	if("navarathan dal" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 144.00 * quantity;
	}
	if("scambled paneer" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 220.00 * quantity;
	}
	if("roasted bhindi" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 84.00 * quantity;
	}
	if("chilly egg" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 134.00 * quantity;
	}
	if("rotti with navarathan combo" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 110.00 * quantity;
	}
	if("rice with murgh lapabdar combo" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 225.00 * quantity;
	}
	if("ghee rice" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 110.00 * quantity;
	}
	if("meti chicken" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 240.00 * quantity;
	}
	if("dahi chicken" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 240.00 * quantity;
	}
    return 0.0;
   
   } 
   
}