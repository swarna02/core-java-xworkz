class TravelAgencyTester{
 public static void main(String Place[]){
 TravelAgency.addplaces("Beluru");
 TravelAgency.addplaces("Hornadu");
 TravelAgency.addplaces("Chikmangluru");
 TravelAgency.addplaces("ooty");
 TravelAgency.addplaces("Nandi Hills");
 TravelAgency.addplaces("kumara Parvata");
 TravelAgency.addplaces("Halabidu");
 TravelAgency.addplaces("Jog falls");
 TravelAgency.getAllTouristNames();
 TravelAgency. updatePlace("ooty","OOTY");
 TravelAgency.getAllTouristNames();
 
 int newLength = TravelAgency.deleteStation("Halabidu");
System.out.println("calling all flavors");

TravelAgency. getAllPlacePostDeletion(newLength);
 }
}