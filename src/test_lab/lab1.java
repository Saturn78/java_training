package test_lab;

public class lab1 {
	
	public static void main(String[] args) {
	
	Student stu1= new Student("Ivan", "14789443");
	
	//stu1.setPhone("Jim");
	System.out.println(stu1.getPhone());
	stu1.enroll(500, "vasja");
	stu1.pay(600);
	
	

	stu1.setPhone("26100125");
	stu1.setCity("Riga");
	stu1.setState("Latvija");
	

	System.out.println(stu1.toString());

	
	}
	
}
	
	
	class Student {
		
		//variables
		String name;
		String ssn ;
		String email;
		private static final String static_ID = "01";
		String UserID;
		int min = 1000 ;
		int max = 9000;
		private String phone;
		private String city;
		private String state;
		double balance;
		
		
		
		//construktor
		public Student(String name, String ssn){
			this.name=name;
			this.ssn=ssn;
			System.out.println("New student is :"+name+" His ssn is: "+ ssn );
			String email= name+"@tartu.ee";
			System.out.println(email);
			SetUserID(name, ssn);
			}
		private void SetUserID (String name,String ssn) {
			//String name = name;
			int random = min + (int)(Math.random() * max);
			UserID = static_ID + random + ssn.substring(4,8);
			System.out.println(name+" personal ID is: "+UserID);
		}
		
		
		public void setPhone (String phone) {
			this.phone = phone;
			}
		public String getPhone() {
			return phone;
		}
		public void setCity (String city) {
			this.city = city;	
		}
		public String getCity() {
			return city;
		}
		public void setState (String state) {
			this.state = state;
			}
		public String getState() {
			return state;
		}
		
		
		public void enroll(double amount,String name) {
			balance=amount;
			System.out.println(name+"is enrolled "+amount);
			checkBalance();
		}
		public void pay(double amount) {
			balance=balance-amount;
			System.out.println("pay for studes"+amount);
			checkBalance();
		}
		private void checkBalance() {
			System.out.println("Balance: "+balance);
			
		}
		
		public String toString() {
			return "[name:"+name+"]\n[Account Number: "+ UserID +"]\n"+ "[routing number: "+phone+ "]\n"+"[Balance now:"+balance+"]";
		}
		
		
	}
	
	
	
	

