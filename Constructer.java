package Constructer;

public class Bank 
{
int amount=5000;
public Bank() {
	// TODO Auto-generated constructor stub
	System.out.println("Default Constructer: "+amount);
}
public Bank(int newAmount)
{
	amount=amount+newAmount;
	System.out.println("parameterised Constructer: "+amount);
}
public static void main(String[] args)
{
	Bank b1= new Bank(2000);
	Bank b2= new Bank();
}
}