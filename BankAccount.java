class BankAccount{
static int balance;

public static boolean credit(int amount){
	boolean isCredited = false;
	if(amount>0){
	balance = balance + amount;
}
return isCredited;
}
public static boolean debit(int amount){
	boolean isDebited = false;
	if(amount<balance){
	balance = balance - amount;
}
return isDebited;
}
 
 public static int getBalance(){
	 System.out.println("Available balance is");
	 return balance;
 }

}