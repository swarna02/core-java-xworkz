class FaceBook {
	public static boolean login(String eMail,String password){
		boolean isLogedIn=false;
		
			if(eMail=="swarnant4@gmail.com" && password=="swarna@2001"){
		        isLogedIn=true;
		        System.out.println("Succusfully loged in with eMail and Password..");
			}
		    else{
				isLogedIn=false;
			    System.out.println("Invalid eMail or password..Plz provide correct eMail or Password..");
		    }
	    return isLogedIn;
		}
		
	
	public static boolean login(long mobileNo , String password){
		boolean isLogedIn=false;
		
			if(mobileNo==7019469435L && password=="swarna@2001"){
			 isLogedIn=true;
			 System.out.println("Succusfully loged in with Mobile Number and Password..");
		    }else{
				isLogedIn=false;
			System.out.println("Invalid eMail or password..Plz provide correct eMail or Password..");
			}
		return isLogedIn;
		}
		
	}