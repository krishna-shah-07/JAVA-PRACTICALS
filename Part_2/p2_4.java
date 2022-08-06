import java.util.*;
public class p2_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        //creating objects of the three classes 
        CheckingAccount c = new CheckingAccount(1, 150);
        SavingAccount s = new SavingAccount(2, 450);

        //trying the methods of child class
        System.out.println("Saving Account - ");
        s.withdrawSa(200);
        s.getter();

        System.out.println();
        System.out.println("Checking Account - ");
        c.check(300);
        c.getter();

        sc.close();
    }
}

class Account{
    //private data members 
	private int id;
	double balance;
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

//class CheckingAccount child of Account
class CheckingAccount extends Account{
    private double overDraft = -100;

    public CheckingAccount(int newid, double newbalance){
        super(newid, newbalance);
    }

    //check if amount can be withdrawn after overdraft
    public void check(double amt){
        if(balance - amt < overDraft){
            System.out.println("Failure");
        }else{
            balance -= amt;
        }
    }
}

//class SavingAccount child of Account 
class SavingAccount extends Account{
    private double overDraftLimit = 0;

    public SavingAccount(int newid, double newbalance){
        super(newid, newbalance);
    }
    
    //withdraw funds if available
    public void withdrawSa(double amt){
        if(balance - amt < overDraftLimit){
            System.out.println("Failure - Insufficient funds");
        }else{
            balance -= amt;
        }
    }
}