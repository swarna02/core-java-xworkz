class TravelAgency{
  static String touristNames[] = {null,null,null,null,null,null,null,null};
 static int index;
 

 public static boolean addplaces(String place){
 boolean isAdded = false;
 if(place!=null){
 touristNames[index] = place;
 index++;
 
 }else{
 System.out.println("cannot add flovor as it is null value");
 }
 return isAdded;
 }
	public static void getAllTouristNames(){
	System.out.println("Invoking getAllTouristNames");
	for(int place=0 ; place<touristNames.length; place++){
	String reference    = touristNames[place];
	System.out.println("Accessing place "+reference+" at "+place);
	}
	System.out.println("End of getAllTouristNames ");
}
public static boolean updatePlace(String exisitingPlace , String updatedPlace){
	boolean isUpdated = false;
	for(int Index = 0 ; Index < touristNames.length ;Index++){
	if(touristNames[Index].equals(exisitingPlace)){
		touristNames[Index] = updatedPlace;
		isUpdated = true;
		System.out.println("Is Place Name updated" + isUpdated);
		
	}	
		
		
	}
	
	return isUpdated;
}
public static int deleteStation(String placeName){
	boolean isDeleted = false;
	int placeIndex;
	int noOfElements = touristNames.length;
	
	for(placeIndex=0;placeIndex<touristNames.length;placeIndex++){
		if(touristNames[placeIndex].equals(placeName)){
			break;
		}
		
	}
	if(placeIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=placeIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          touristNames[newindex] =touristNames[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllPlacePostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(touristNames[itemIndex]);
	}
	
}
}