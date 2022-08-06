import java.util.*;
public class p2_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        //creation of array list named persons
		ArrayList<BankAccount> persons = new ArrayList<BankAccount>();
		boolean flag = true;
		double money;

        //first 10 bank accounts
		for(int i = 0 ; i < 11 ; i++) {
			BankAccount p = new BankAccount();
			persons.add(p);
			persons.get(i).AccountDetails();
		}

        //Asking user what they want to do
		while(flag) {
			System.out.println("Enter Your Choice Number : ");
			System.out.println("1. Balance Enquiry");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Deposite Money");
			System.out.println("4. Money Transfer");
			System.out.println("5. Create New Account");
			System.out.println("6. Deactivate Account");
			System.out.println("7. Exit");

            int Choice = sc.nextInt();
            //Process according to their choice
            switch(Choice){
                case 1:
                    int i = verify(persons);
                    persons.get(i).AccountDetails();
                    break;
                case 2:
                    i = verify(persons);
                    System.out.println("Amount to withdraw : ");
                    money = sc.nextDouble();
                    persons.get(i).withdraw(money);
                    break;
                case 3:
                    i = verify(persons);
                    System.out.println("Amount to deposit : ");
                    money = sc.nextDouble();
                    persons.get(i).deposit(money);
                    break;
                case 4:
                //transfer money using withdraw and deposit
                    i = verify(persons);
                    System.out.println("Account in which ypu want to transfer money : ");
                    int j = verify(persons);
                    System.out.println("Money to tranfer : ");
                    money = sc.nextDouble();
                    persons.get(i).withdraw(money);
                    persons.get(j).deposit(money);
                    break;
                case 5:
                //add new bank account
                    BankAccount newp = new BankAccount();
                    persons.add(newp);
                    newp.AccountDetails();
                    break;
                case 6:
                //remove account
                    i = verify(persons);
                    persons.remove(i);
                    System.out.println("Account removed");
                    break;
                case 7:
                //break the loop
                    break;
            }
		}
	}

    //function to verify if the account exists or not
    static int verify(ArrayList<BankAccount> persons){
        int i = 0;
        String id = null;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Account id : ");
        boolean f = true;
        for(i = 0 ; i <= persons.size() ; i++){
            if(f){
                id = sc1.next();
                i = 0;
                f = false;
            }else if(i == persons.size()){
                System.out.println("Wrong id - enter again : ");
                f = true;
                i = 0;
                continue;
            }

            //if account exists
            if(id.equals(persons.get(i).getAccountId())){
                System.out.println("Account found");
                break;
            }
        }
        //return array index
        return i;
    }
}

//Class BankAccount
class BankAccount{
	Scanner sc = new Scanner(System.in);
	private String id;
	private double balance = 300;
	private double annualInterestRate = 0.07;
	private Date dateCreated ;
	static int cnt = 0;
	
    //default constructor to initialise account and id
	BankAccount(){
		if(cnt >= 10) {
			id = "AC0" + cnt;
			sc = new Scanner(System.in);
		}else {
			id = "AC00" + cnt;
			sc = new Scanner(System.in);
		}
        cnt++;
	}
	
    //parameterised constructor
	BankAccount(String x, double y){
		id = x;
		balance = y;
	}
	
    //display account details
	void AccountDetails() {
		System.out.println("Id : " + id);
		System.out.println("Balance : " + balance);
		System.out.println("Interest Rate : " + annualInterestRate);
	}
	
	public void setter(String id, double balance, double annualInterestRate) {  
	    this.id = id;
	    this.balance = balance;
	    this.annualInterestRate = annualInterestRate;
	} 

    //get account id and date created
	public String getAccountId(){
        return id;
    }
	public Date getDate() {
		return dateCreated;
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
		if(balance > 300 && balance - x > 300) {
			balance -= x;
			System.out.println("Amout" + x + "Withdrawn - Balance is : " + balance);
		}else {
			System.out.println("Insufficient balance - Cannot withraw");
		}
	}
	
    //method to deposite money
	void deposit(double x) {
		balance += x;
		System.out.println("Amout" + x + "Deposited - Balance is : " + balance);
	}
}