class Karnataka1{
	
	//array has limitation - size is fixed
  static String cityNames[] = {null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addCityName(String cityName){
  boolean isAdded = false;
  
  //validate city
  if(index<cityNames.length){
  
  }
  if(cityName!=null && cityName.length()>0){
  cityNames[index] = cityName;
  index++;
  isAdded = true;
  System.out.println("City Added"+isAdded);
  }else{
  System.out.println("cannot add city as it is null value");
  
  }
  return isAdded;
  }
  public static void getAllCityNames(){
  System.out.println("Invoking getAllChaiAvailable");
  for( int cityName = 0; cityName<cityNames.length;cityName++){
  String reference = cityNames[cityName];
  System.out.println("Accessing city "+reference+" at "+cityName);
  }
  System.out.println("End of getAllCityNames");
  }
  
  public static boolean updateCityName(String existingCityName , String updatedCityName){
	boolean isUpdated = false;
for(int cityIndex = 0; cityIndex < cityNames.length; cityIndex++){
if(cityNames[cityIndex].equals(existingCityName)){
	cityNames[cityIndex] = updatedCityName;
	isUpdated = true;
	
	
}	
}	  
	 return isUpdated; 
  } 
  public static int deleteCityName(String cityName){
	boolean isDeleted = false;
	int cityIndex;
	int noOfElements = cityNames.length;
	
	for(cityIndex=0;cityIndex<cityNames.length;cityIndex++){
		if(cityNames[cityIndex].equals(cityName)){
			break;
		}
		
	}
	if(cityIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=cityIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          cityNames[newindex] = cityNames[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllCityPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(cityNames[itemIndex]);
	}
	
}
  
}