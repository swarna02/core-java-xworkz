class Garden{
 static String flowerNames[] = {null,null,null,null,null};
 static int index;
 

 public static boolean addFlowers(String flower){
 boolean isAdded = false;
 if(flower!=null){
 flowerNames[index] = flower;
 index++;
 
 }else{
 System.out.println("cannot add flower as it is null value");
 }
 return isAdded;
 }
public static void getAllFlowerNames(){
System.out.println("Invoking getAllFlowerNames ");
for(int flower=0 ; flower<flowerNames.length; flower++){
String reference    = flowerNames[flower];
System.out.println("Accessing flower "+reference+" at "+flower);
}
System.out.println("End of getAllFlowerNames ");
}

public static boolean updateFlowerName(String exisitingFlowerName , String updatedFlowerName){
	boolean isUpdated = false;
	for(int flowerIndex = 0 ; flowerIndex < flowerNames.length ; flowerIndex++){
	if(flowerNames[flowerIndex].equals(exisitingFlowerName)){
		flowerNames[flowerIndex] = updatedFlowerName;
		isUpdated = true;
		System.out.println("Is Flower Name updated" + isUpdated);
		
	}	
		
		
	}
	
	return isUpdated;
}
public static int deleteFlower(String flowerName){
	boolean isDeleted = false;
	int flowerIndex;
	int noOfElements = flowerNames.length;
	
	for(flowerIndex=0;flowerIndex<flowerNames.length;flowerIndex++){
		if(flowerNames[flowerIndex].equals(flowerName)){
			break;
		}
		
	}
	if(flowerIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=flowerIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          flowerNames[newindex] =flowerNames[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllFlowerPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(flowerNames[itemIndex]);
	}
	
}
}