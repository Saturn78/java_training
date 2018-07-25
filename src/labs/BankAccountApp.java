package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1= new BankAccount ("14884315", 1000.50);
		BankAccount acc2= new BankAccount ("99884315", 2000);
		BankAccount acc3= new BankAccount ("44884315", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}

	
	
}
class BankAccount implements IInterest {
	private int iD=1000 ;
	private String accountNumber;
	private static final String routingNumber="00994321";
	private String  name;
	private String SSN;
	private double balance;
	
	public BankAccount(String SSN, double initDeposit) {
		System.out.println ("New account created!");
		balance=initDeposit;
		this.SSN=SSN;
		iD++;
		SetAccountNumber();
	}
	private void SetAccountNumber () {
		int random =(int) (Math.random() *100);
		accountNumber = iD+""+random +SSN.substring(0,2);
		System.out.println("Your Account Number:"+accountNumber);
	}
	public void setName (String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		balance=balance-amount;
		System.out.println("Paying bill"+amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance=balance+amount;
		System.out.println("Making Deposit"+amount);
		showBalance();
	}
	private void showBalance() {
		System.out.println("Balance: "+balance);
		
	}
	@Override
	public void accrue() {
		balance= balance*(1+rate/100);
		showBalance();		
	}
	public String toString() {
		return "[name:"+name+"]\n[Account Number: "+ accountNumber +"]\n"+ "[routing number: "+routingNumber+ "]\n"+"[Balance now:"+balance+"]";
	}
	
	
}