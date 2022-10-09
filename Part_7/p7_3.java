import java.util.*;

public class AccountHolder {
    private String name;
    private int age;
    private int monthlyIncome;
    private int experiance;
    private String citizenship;

    //default constructor
    public AccountHolder() {
    }

    //parameterised constructor
    public AccountHolder(String name,int age, int monthlyIncome, int experiance, String citizenship) {
        this.name = name;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.experiance = experiance;
        this.citizenship = citizenship;
    }

    //getter methods
    public int getAge() {
        return age;
    }
    public int getMonthlyIncome() {
        return monthlyIncome;
    }
    public String getName() {
        return name;
    }
    public int getExperiance() {
        return experiance;
    }
    public String getCitizenship() {
        return citizenship;
    }
    
}

public class p7_3 {
    public static void main(String[] args) {
        //array list to store object of AccountHolder class
        ArrayList<AccountHolder> accounts = new ArrayList<AccountHolder>();

        // adding 5 accounts
        accounts.add(new AccountHolder("Krishna",18, 25000, 10, "Indian"));
        accounts.add(new AccountHolder("Mohit",19, 40000, 30, "Indian"));
        accounts.add(new AccountHolder("Krunal",23, 10000, 3, "Indian"));
        accounts.add(new AccountHolder("Muskan",24, 50000, 30, "Indian"));
        accounts.add(new AccountHolder("Jatin",18, 60000, 12, "Indian"));

        for (int i=0;i<accounts.size();i++) {
            AccountHolder accountHolder = accounts.get(i);
            if (accountHolder.getAge() >= 21 && accountHolder.getAge() <= 60
                    && accountHolder.getMonthlyIncome() >= 15000 && accountHolder.getExperiance() >= 1
                    && accountHolder.getCitizenship().equals("Indian")) {
                continue;
            } else {
                accounts.remove(accountHolder); // removing other accounts
            }
        }

        System.out.println("Eligible accounts holder's name:");
        for (AccountHolder accountHolder : accounts) {
            System.out.println(accountHolder.getName());
        }
    }

}