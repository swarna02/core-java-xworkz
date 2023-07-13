class Karnataka1Tester{
  public static void main(String cityName[]){
 Karnataka1.addCityName("Tipaturu");
 Karnataka1.addCityName("Tumkur");
 Karnataka1.addCityName("Bengluru");
 Karnataka1.addCityName("madkeri");
 Karnataka1.addCityName("shivmogga");
 Karnataka1.addCityName("Udupi");
 Karnataka1.addCityName("Kolar");
 Karnataka1.addCityName("Sakaleshpur");
 Karnataka1.addCityName("Mandya");
 Karnataka1.addCityName("mysuru");
 
 
 
 Karnataka1.getAllCityNames();
boolean isUpdated =  Karnataka1.updateCityName("Tipaturu" , "Tiptur");
System.out.println("Is city Name updated"+isUpdated);
 Karnataka1.getAllCityNames();
 
 int newLength = Karnataka1.deleteCityName("Mandya");
System.out.println("calling all city");

Karnataka1. getAllCityPostDeletion(newLength);
 }
}