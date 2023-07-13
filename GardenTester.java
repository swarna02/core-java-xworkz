class GardenTester{
public static void main(String flower[]){
Garden.addFlowers("lilly");
Garden.addFlowers("jasmin");
Garden.addFlowers("daffodiles");
Garden.addFlowers("rose");
Garden.addFlowers("may flower");
Garden.getAllFlowerNames();

boolean isupdated = Garden.updateFlowerName("jasmin" , "sunflower");

Garden.getAllFlowerNames();

int newLength = Garden.deleteFlower("rose");
System.out.println("calling all flower");

Garden. getAllFlowerPostDeletion(newLength);
}
}