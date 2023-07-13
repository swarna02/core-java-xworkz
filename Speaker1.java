class Speaker1{
 static String name = "JBL";
 static  int minVolume;
 static int currentVolume;
 static  int maxVolume = 30;
 static boolean isConnected;
 
 
// method
  public static boolean onOroff(){
   System.out.println("Invoking onOrOff()");
   System.out.println("parameter" + 0);
   if(isConnected == false){
     isConnected = true;
	 System.out.println(" Speaker is Turned on");
	 }
	 else if(isConnected == true){
	   isConnected = false;
	   System.out.println(" Speaker is Turned off");
	   
	 }
   
  return isConnected;
  }
  
    //increase volume
	public static void increaseVolume(){
		System.out.println("Start of increase volume");
		if(isConnected == true){
		if(currentVolume<maxVolume){
			currentVolume = currentVolume+1;
		    System.out.println("The current volume is"+currentVolume);
		}else{
            System.out.println("max volume reached");			
	}
		}else{
			System.out.println("idiot connect the speaker first");
		}
		System.out.println("End of increase volume");
	}


     //decrease volume
	 public static void decreaseVolume(){
		 System.out.println("Invoking decreseVolume");
		 System.out.println("parameter" +0);
		 
		 if(isConnected == true){
			 if(currentVolume > minVolume){
				 currentVolume = currentVolume - 1;
				 System.out.println("The current volume is"+currentVolume);
			 }else{
				 System.out.println("Minimum volume reached");
				 
			 }
				
			 
			 }
		 }
}