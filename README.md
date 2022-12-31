# javaWork
Java project including GUI

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
   EOC E11.15
*/
public class BankAcctParastoo
{  
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAcctParastoo()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAcctParastoo(double initialBalance)
   {   
      if (initialBalance < 0)
         throw new IllegalArgumentException("Cannot enter negative balance.");
            
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      if (amount < 0)
         throw new IllegalArgumentException("Sorry! Cannot deposit negative amount.");

      double newBalance = balance + amount;
      balance = 0;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      if (amount < 0 || amount > balance)
         throw new IllegalArgumentException("Sorry! Cannot withdraw this amount.");
      
      double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}
