package based;

import java.util.ArrayList;
import java.util.Scanner;

public class Currentaccount {
	
	//Transaction tc = new Transaction();
	//Transaction tcw = new Transaction();
	Scanner sc = new Scanner(System.in);

	private double Balance;

	private long Accountno;

	private long withdrwnamnt;

	//ArrayList<Transaction> currentHistory = new ArrayList<Transaction>();
	
	Repository rr = new Repository();

	public long getAccountno() {
		return Accountno;
	}

	public long getWithdrwnamnt() {
		return withdrwnamnt;
	}

	public void setWithdrwnamnt(long withdrwnamnt) {
		this.withdrwnamnt = withdrwnamnt;
	}

	public void setAccountno(long accountno) {
		Accountno = accountno;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public double depositAmount(double Amount) {
		Balance = Balance + Amount;
		Transaction tc = new Transaction();
		tc.setAmount(Amount);
		tc.setTotalBalance(Balance);
		tc.setType(Transaction.Transtype.DEPOSIT);
		rr.addCurrentHistory(tc);
		return Balance;
	}

	public double withdrwlAmount(double withdwlAmount) {
		if (Balance < withdwlAmount) {
			System.out.println("In Sufficent Balance");
		} else {
			Balance = Balance - withdwlAmount;
			Transaction tcw = new Transaction();
			tcw.setAmount(withdwlAmount);
			tcw.setTotalBalance(Balance);
			tcw.setType(Transaction.Transtype.WITHDRAWL);
			rr.addCurrentHistory(tcw);
		}
		return Balance;

	}
	
	public void cuurenHistory()
	{
		ArrayList<Transaction>cuu=rr.getCurrentHistory();
		for(Transaction t : cuu)
		{
			System.out.println(t.getAmount());
			System.out.println(t.getType());
			System.out.println("Your Total Balance is" +t.getTotalBalance());
		}
	}

	
	
	public void transaction()
	{
		boolean exit = false;
		
		do
		{
			System.out.println("press 1 for Check Balance");
			System.out.println("press 2 for Deposit ");
			System.out.println("Press 3 for Withdrwal");
			System.out.println("Press 4 for return Back");
			
			switch(sc.nextInt())
			{
			case 1:
				
				System.out.println("Your Current Account balance is "+Balance);
				break;
			case 2:
				System.out.println("Please Enter the Amount to be Deposited");
				double amntt = sc.nextDouble();
				double cccc =depositAmount(amntt);
				System.out.println("Your Current Account Balance is" +cccc);
				break;
			case 3:
				System.out.println("Please Enter the withdrwal Amount");
				double wtdramntjj = sc.nextDouble();
				double eee = withdrwlAmount(wtdramntjj);
				System.out.println("Your balance is "+eee);
				break;
			case 4:
				exit = true;
				break;
				default:
				System.out.println("Please Enter valid Choice");	
				
				
			}
		
			
		}while(!exit);
	}
	
	
	

	
	
	
	
	
	
	
	
	
}
