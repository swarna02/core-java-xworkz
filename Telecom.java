class Telecom{
 static String sim[] = {null,null,null,null,null};
 static int index;
 
 
 public static boolean addSim(String network){
 boolean isAdded = false;
 if(sim!=null){
 sim[index] = network;
 index++;
 
 }else{
 System.out.println("cannot add city as it is null value");
 }
 return isAdded;
 }
public static void getAllSimAvailable(){
System.out.println("Invoking getAllSimAvailable");
for(int network=0 ; network<sim.length; network++){
String reference    = sim[network];
System.out.println("Accessing network "+reference+" at "+network);
}
System.out.println("End of getAllSimAvailable");
}

public static boolean updateSim(String exitingSim , String updatedSim){
boolean isUpdated = false;
for(int simCardIndex = 0 ; simCardIndex < sim.length ; simCardIndex++){
if(sim[simCardIndex].equals(exitingSim)){
	sim[simCardIndex] = updatedSim;
	isUpdated = true;
	
	
}		
}
return isUpdated;
}

public static boolean deletesim(String network){
	boolean isDeleted = false;
	int deleteIndex;
	int noOfElements = sim.length;
	
	for(deleteIndex=0;deleteIndex<sim.length;deleteIndex++){
		if(sim[deleteIndex].equals(network){
			break;
			
		}
	}
	if(deleteIndex<noOfElements){
		noOfElements = noOfElements-1;
		for(int newindex=deleteIndex;newindex<noOfElements;newindex++){
			sim[newindex] = sim[newindex+1];
		}
	}
	return noOfElements;
}
public static void getAllSimPostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(sim[itemIndex]);
	}
}
}