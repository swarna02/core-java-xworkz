class Modulus{
public static void main(String modulus[]){
 mod(65,34);
mod(100, 37);
 mod(568, 234);
 mod(908, 654);
 mod(1234, 876);
 mod(677, 87);
mod(3456, 765);
 mod(900, 76);
 mod(334, 243);
 mod(679, 165);
System.out.println("-----------------");
mod(6322,3,2);
 mod(1024,5, 3);
mod(18, 13, 2);
mod(3261,9, 5);
 mod(8234,5, 3);
 mod(8521,17, 8);
mod(63325,34, 6);
 mod(7123, 5,2 );
 mod(100,58, 8);
 mod(33,28,3);

}
public static void mod(int a, int b){
System.out.println(a%b);
}
 public static void mod(int x, int y, int z){
System.out.println(x%y%z);

}
}