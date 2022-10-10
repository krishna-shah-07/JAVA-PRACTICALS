import java.util.*;

class Account{
    //private data members 
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	protected Date dateCreated ;
	
    //default constructor
	public Account(){
		id = 0;
        balance = 0;
        annualInterestRate = 0;
        System.out.println("Default account created");
	}
	
    //parameterised constructor
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
    //getter method
	public int getId() {
		return id;
	}
    public double getBalance(){
        return balance;
    }
    public double getAnnualRate(){
        return annualInterestRate;
    }
    public Date getDate() {
		return dateCreated;
	}
	
    //setter method
	public void setId(int id){  
	    this.id = id;
	} 
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualRate(double annualInterestRate){
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
            System.out.println("Amount " + x + " Withdrawn - Balance is : " + balance);
        }else{
            System.out.println("Insufficient Balance");
        }
	}
	
    //method to deposite money
	void deposit(double x) {
		balance += x;
		System.out.println("Amount " + x + " Deposited - Balance is : " + balance);
	}
}

//Demo class to check Account Class
public class Pr1{
    public static void main(String[] args){
        Account a1 = new Account(1 , 500);
        System.out.println("Initial Balance : " + a1.getBalance());
        a1.withdraw(200);
        a1.deposit(50);
    }
}