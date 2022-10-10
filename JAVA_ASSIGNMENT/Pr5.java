import java.util.*;

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

public class Pr5 {
	public static void main(String args[]) {
        //creating objects of the three classes 
        CheckingAccount c = new CheckingAccount(1, 150);
        SavingAccount s = new SavingAccount(2, 450);

        //trying the methods of child class
        System.out.println("Saving Account - ");
        s.withdrawSa(200);
        System.out.println("Id : " + s.getId());
        System.out.println("Balance : " + s.getBalance());

        System.out.println();
        System.out.println("Checking Account - ");
        c.check(300);
        System.out.println("Id : " + c.getId());
        System.out.println("Balance : " + c.getBalance());
    }
}