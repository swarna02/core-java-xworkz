class BankAccountTester{

public static void main(String account[]){
	BankAccount.credit(2000);
System.out.println(BankAccount.getBalance());
	BankAccount.debit(300);
System.out.println(BankAccount.getBalance());
BankAccount.credit(10000);
BankAccount.credit(2000);
BankAccount.credit(20000);
BankAccount.credit(200);
double balance = BankAccount.getBalance();
System.out.println(balance);

BankAccount.debit(1000);
System.out.println(BankAccount.getBalance());
BankAccount.debit(200);
System.out.println(BankAccount.getBalance());

}
}