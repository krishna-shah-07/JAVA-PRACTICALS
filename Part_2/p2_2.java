import java.util.*;
public class p2_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        //tester account formed 
        Account a1 = new Account();
        a1.getter(); //-----> balance 500 and rate 7
        a1.deposit(500); //-----> balance becomes 1000
        a1.getter();

        sc.close();
	}
}

//class Account
class Account{
    //private data members 
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated ;
	static int cnt = 0;
	
    //default constructor
	public Account(){
		id = 0;
        balance = 500;
        annualInterestRate = 7;
	}
	
    //parameterised constructor
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
    //getter method
	public void getter() {
		System.out.println("Id : " + id);
		System.out.println("Balance : " + balance);
		System.out.println("Interest Rate : " + annualInterestRate);
	}
    public Date getDate() {
		return dateCreated;
	}
	
    //setter method
	public void setter(int id, double balance, double annualInterestRate) {  
	    this.id = id;
	    this.balance = balance;
	    this.annualInterestRate = annualInterestRate;
	} 
	
	double getMonthlyInterestRate() {
		double mit = annualInterestRate / 12;
		return mit;
	}

	double getMonthlyInterest() {
		double mi = balance * annualInterestRate / 12 ;
		return mi;
	}
	
    //method to withdraw money
	void withdraw(double x) {
		if(balance >= x){
            balance -= x;
            System.out.println("Amout " + x + " Withdrawn - Balance is : " + balance);
        }else{
            System.out.println("Insufficient Balance");
        }
	}
	
    //method to deposite money
	void deposit(double x) {
		balance += x;
		System.out.println("Amout " + x + " Deposited - Balance is : " + balance);
	}
}
