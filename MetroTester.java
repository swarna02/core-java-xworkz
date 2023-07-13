class MetroTester{
 public static void main(String Station[]){
 Metro.addStations("Attiguppe");
 Metro.addStations("Vijaynagar");
 Metro.addStations("jaynagar");
 Metro.addStations("Hosahalli");
 Metro.addStations("Rajajinagar");
 Metro.addStations("Nagasandra");
 Metro.addStations("Kengeringeri");
 Metro.getAllStationNames();
 Metro.updateStation("Kengeringeri","Kengeri");
  Metro.getAllStationNames();
  
  int newLength = Metro.deleteStation("Nagasandra");
System.out.println("calling all flavors");

Metro. getAllStationPostDeletion(newLength);

String station = searchStationByName("Nagasandra");
Metro.searchStationByName();
 }

}