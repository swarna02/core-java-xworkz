class Zomato{
   public static double search(String foodName){
    
	if("Pizza" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 99.00;
	}
   if("cutlet" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 100.00;
	}
	if("veg biryani" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 140.00;
	}
	if("kachori" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 30.00;
	}
	if("hyd biryani" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 220.00;
	}
	if("veg roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 65.00;
	}
	if("pani puri" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 30.00;
	}
	if("sev puri" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 45.00;
	}
	if("noddels dosa" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 125.00;
	}
	if("masal dosa" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 70.00;
	}
	if("idli" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 50.00;
	}
	if("burger" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 125.00;
	}
	if("Peri peri fries" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 125.00;
	}
	if("chaco lava cake" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 150.00;
	}
	if("red velvet cake" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 120.00;
	}
	if("momos" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 110.00;
	}
	if("brownie" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 100.00;
	}
	if("sandwich" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 75.00;
	}
	if("noodles" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 130.00;
	}
	if("friedrice" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 140.00;
	}
    return 0.0;
   
   } 
   
     
    //Method overloading
	
      public static double search(String foodName, int quantity){
	 if("Pizza" == foodName){
	 System.out.println("Searched food name is "+foodName);
	 return 99.00 * quantity;
	   }

	 if("cutlet" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 100.00 * quantity;
	}
	if("veg biryani" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 140.00 * quantity ;
	}
	if("kachori" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 30.00 * quantity;
	}
	if("hyd biryani" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 220.00 * quantity;
	}
	if("veg roll" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 65.00 * quantity;
	}
	if("pani puri" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 30.00 * quantity;
	}
	if("sev puri" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 45.00 * quantity;
	}
	if("noddels dosa" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 125.00 * quantity;
	}
	if("masal dosa" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 70.00 * quantity;
	}
	if("idli" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 50.00 * quantity;
	}
	if("burger" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 125.00 * quantity;
	}
	if("Peri peri fries" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 125.00 * quantity;
	}
	if("chaco lava cake" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 150.00 * quantity;
	}
	if("red velvet cake" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 120.00 * quantity;
	}
	if("momos" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 110.00 * quantity;
	}
	if("brownie" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 100.00 * quantity;
	}
	if("sandwich" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 75.00 * quantity;
	}
	if("noodles" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 130.00 * quantity;
	}
	if("friedrice" == foodName){
	System.out.println("Searched food name is " +foodName);
	return 140.00 * quantity;
	}
    return 0.0;
   
   } 
}
