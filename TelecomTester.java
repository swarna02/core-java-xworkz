class TelecomTester{
public static void main(String network[]){
 Telecom.addSim("Airtel");
 Telecom.addSim("Jio");
 Telecom.addSim("Idea");
 Telecom.addSim("Vodafone");
 Telecom.addSim("Aicel");
 Telecom.getAllSimAvailable();
 
 boolean isUpdated = Telecom.updateSim("Airtel" , "BSNL");
 System.out.println("Is sim Name updated" + isUpdated);
 Telecom.getAllSimAvailable();
 
 int newLength = Telecom.deletesim("Aicel");
 System.out.println("Calling all Simavailable");
 Telecom.getAllSimPostDeletion(newLength);
}
}