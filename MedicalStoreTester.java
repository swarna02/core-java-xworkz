class MedicalStoreTester{
 public static void main(String Medicine[]){
 MedicalStore.addmedicineNames("Paracentamol");
 MedicalStore.addmedicineNames("Dolo");
 MedicalStore.addmedicineNames("Dort");
 MedicalStore.addmedicineNames("Pan D");
 MedicalStore.addmedicineNames("Azintromycin");
 MedicalStore.addmedicineNames(" Cipla");
 MedicalStore.addmedicineNames("Amoxiciln");
 MedicalStore.addmedicineNames("Pantoprazole");
 MedicalStore.getAllMedicineNames();
 
 boolean isUpdated = MedicalStore.updateMedicalStore("Dolo" , "Dolo650");
 System.out.println("Is Medicine Name updated" + isUpdated);
 MedicalStore.getAllMedicineNames();
 
 int newLength = MedicalStore.deleteMedicine("Halabidu");
System.out.println("calling all medicine");

MedicalStore. getAllMedicinePostDeletion(newLength);
 }
}