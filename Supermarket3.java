class Supermarket3{
 static String perfumes[] = {" secret","myop","whatgal","fog","tension","engage","wildstone","gucci","spinz","denver"};
 static String veggie[] =  {" bendi","potato","chilly","onion","tomato"};
 static String biscuits[] = {" parleG","goodday","oreo","tiger","jimjam","50-50","crackjack","momsmagic","hideandsick","Darkfantacy"};
 static String grociries[] = {" toordal","mungdal","rice","wheat","sugar","salt","savige","rava","turmaric","jeera"};
 static String cosmetics[] = {" moisturiser","sunscreen","toner","lipsticks","lipbalm","powder","primer","foundation","makeupremover","kajol","eyeliner","shades","serum","canceler","eyelashes","facewash","bodylotion","scrub","highlighter","contour","blush","lipliner","maskara","lipgloss","eyebrowpencile"};
 
 public static void main(String supermarket[]){
  System.out.println("List of perfumes");
  System.out.println("----------------------");
  getPerfumes();
  
  System.out.println("list of veggies");
  System.out.println("---------------------");
  fetchVegetables();
  
  System.out.println("list of biscuits");
  System.out.println("---------------------");
  fetchbiscuits();
  
    System.out.println("list of grociries");
  System.out.println("---------------------");
  fetchgrociries();
  
    System.out.println("list of cosmetics");
  System.out.println("---------------------");
  fetchcosmetics();
 
 
 }
 
 public static void getPerfumes(){
 for(String perfume : perfumes)
 System.out.println(perfume);
 }
 
 public static void fetchVegetables(){
 for(String vegetable : veggie)
 System.out.println(vegetable);
 }
 
 public static void fetchbiscuits() {
 for(String biscuit : biscuits)
 System.out.println(biscuit);
 }
public static void fetchgrociries() {
 for(String grocirie: grociries)
 System.out.println(grocirie);
}
public static void fetchcosmetics() {
 for(String cosmetic: cosmetics)
 System.out.println(cosmetics);
}
}
