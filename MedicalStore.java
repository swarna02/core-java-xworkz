class MedicalStore{
 static String medicineNames[] = {null,null,null,null,null,null,null,null};
 static int index;
 

 public static boolean addmedicineNames(String medicines){
 boolean isAdded = false;
 if(medicines!=null){
 medicineNames[index] = medicines;
 index++;
 
 }else{
 System.out.println("cannot add medicines as it is null value");
 }
 return isAdded;
 }
	public static void getAllMedicineNames(){
	System.out.println("Invoking getAllMedicineNames");
	for(int medicines=0 ; medicines<medicineNames.length; medicines++){
	String reference    = medicineNames[medicines];
	System.out.println("Accessing medicines "+reference+" at "+medicines);
	}
	System.out.println("End of getAllMedicineNames ");
}

public static boolean updateMedicalStore(String existingMedicalStore , String updatedMedicalStore){
	boolean isUpdated = false;
	for(int medicalIndex = 0 ; medicalIndex < medicineNames.length ; medicalIndex++){
	if(medicineNames[medicalIndex].equals(existingMedicalStore)){
		medicineNames[medicalIndex] = updatedMedicalStore;
		isUpdated = true;
		
	}	
		
		
	}
	
return isUpdated;	
}
public static int deleteMedicalname(String medicineName){
	boolean isDeleted = false;
	int medicineIndex;
	int noOfElements = medicineNames.length;
	
	for(medicineIndex=0;medicineIndex<medicineNames.length;medicineIndex++){
		if(medicineNames[medicineIndex].equals(medicineName)){
			break;
		}
		
	}
	if(medicineIndex<noOfElements){
	noOfElements = noOfElements-1;
	for(int newindex=medicineIndex;newindex<noOfElements;newindex++){
		//logic to remove data from array
		          medicineNames[newindex] =medicineNames[newindex+1];
	}
	}
	
	return noOfElements;
}
public static void getAllMedicinePostDeletion(int newLength){
	for(int itemIndex=0;itemIndex<newLength;itemIndex++){
		System.out.println(medicineNames[itemIndex]);
	}
	
}
}