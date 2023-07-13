class Multiplication{
	//method
public static void main(String Multiplication[]){
 mul(56, 78);
 mul(458, 112);
 mul(89, 67);
 mul(263, 890);
 mul(345, 876);
 mul(5, 8);
 mul(988, 342);
 mul(567, 77);
 mul(2233, 8890);
 mul(25, 86);
 System.out.println("-------------------------");
 mul(56, 78, 28);
 mul(458, 112, 12);
 mul(89, 67, 2);
 mul(263, 890, 125);
 mul(345, 876, 16);
 mul(5, 8, 2);
 mul(988, 342, 23);
 mul(567, 77, 15);
 mul(223, 890, 125);
 mul(25, 86, 36);
 
}
public static void mul(int a, int b){
System.out.println(a*b);
}

public static void mul(int x,int y, int z){
	System.out.println(x*y*z);
}
}