package based;

import java.util.ArrayList;
import java.util.Scanner;

class Savvingaccount {
	// public ArrayList<TransactionHandler>translst;

	// public TransactionHandler(ArrayList<TransactionHandler>translst)
	// {
	// this.translst=translst;
	// }

	Scanner sc = new Scanner(System.in);
	Repository rr = new Repository();
	// @Override
	// public String toString() {
	// return "withdwl=" + withdwl + ", deposit=" + deposit + "";
	// }

	// ArrayList<Transaction> SavingHistory = new ArrayList<Transaction>();
	// Transaction transd = new Transaction();
	// Transaction transw = new Transaction();
	private double Balance = 0.0;
	private double withdwl;
	private double deposit;

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public double getWithdwlmnt() {
		return withdwl;
	}

	public void setwithdrwamnt(double with) {
		withdwl = with;
	}

	public double DepositAmount(double Amount) {
		Balance = Balance + Amount;
		Transaction transd = new Transaction();
		transd.setAmount(Amount);
		transd.setTotalBalance(Balance);
		transd.setType(Transaction.Transtype.DEPOSIT);
		rr.addSavingHistory(transd);
		return Balance;
	}

	public double withdrlamont(double withdamnt) {
		if (Balance < withdamnt)
			System.out.println("In Sufficient Balance");
		else
			Balance = Balance - withdamnt;
		Transaction transw = new Transaction();
		transw.setAmount(withdamnt);
		transw.setTotalBalance(Balance);
		transw.setType(Transaction.Transtype.WITHDRAWL);
		rr.addSavingHistory(transw);

		return Balance;
	}

	// public void showtransaction()
	// {
	// ArrayList<TransactionHandler> Trn= Loginclass.getTransactionList();
	// System.out.println(Trn);

	// for(int i=0;i<Trn.size();i++)
	// {
	// for(TransactionHandler ele:translst)
	// {
	// System.out.println(translst);
	// System.out.println(ele.getDeposit());
	// System.out.println(ele.getWithdwlmnt());

	void transhistory() {
		ArrayList<Transaction> Savvv = rr.getSavinghistory();

		for (Transaction t : Savvv) {
			System.out.println(t.getAmount());
			System.out.println(t.getType());
			System.out.println("Your Total Balance is" + t.getTotalBalance());
		}

	}

	public void transaction() {
		boolean exit = false;

		do {
			System.out.println("Press 1 for Check balance");
			System.out.println("press 2 for Deposit Amount");
			System.out.println("Press 3 for Withdrawl");
			System.out.println("press 4 for Return Back");

			switch (sc.nextInt()) {

			case 1:

				System.out.println("You Saving Account balance is " + Balance);
				break;
			case 2:
				System.out.println("Please Enter the Amount to be deposited");
				double Am = sc.nextDouble();
				double v = DepositAmount(Am);
				System.out.println("You Saving Account balance is" + v);
				break;
			case 3:
				System.out.println("Please Enter the Amount to be withdrwal");
				double wdmnt = sc.nextDouble();
				double w = withdrlamont(wdmnt);
				System.out.println("Your Saving Account balace is " + w);
				break;
			case 4:
				exit = true;
				break;
			default:
				System.out.println("Please Enter Valid Choice");

			}

		} while (!exit);

	}

}

// }

// }

/*
 * public double depositAmount(double Amount) { Balance=Balance + Amount; return
 * Balance; }
 * 
 * public double withdrwlAmount(double withdwlAmount) {
 * if(Balance<withdwlAmount) { System.out.println("In Sufficent Balance"); }
 * else { Balance = Balance - withdwlAmount; } return Balance; }
 * 
 * 
 * 
 * } /* /*static ArrayList<TransactionalDetail>TransacHistory=new
 * ArrayList<TransactionalDetail>();
 * 
 * 
 * static double DepositedAmount; static double TotalAmount =0; double Amount;
 * 
 * 
 * static Scanner sc = new Scanner(System.in); public void DepositAmount() {
 * System.out.println("Ente the Amount to be Deposited");
 * Amount=sc.nextDouble(); TotalAmount = TotalAmount + Amount; DepositedAmount=
 * TotalAmount; System.out.println("Your Current Available Balance is "
 * +DepositedAmount); double Userbal;
 * 
 * } public void withdrawAmount() { double withdrawAmount;
 * System.out.println("Enter the Amount to be withdrawn");
 * withdrawAmount=sc.nextDouble(); if(withdrawAmount>DepositedAmount) {
 * System.out.println("Insufficent bal"); } else {
 * TotalAmount=TotalAmount-withdrawAmount;
 * System.out.println("your available balance is "+TotalAmount); } }
 * 
 * 
 * static ArrayList<TransactionalDetail> getTransdetail() { return
 * TransacHistory; } } /* public void Showtransaction() {
 * ArrayList<TransactionalDetail>tarns=Transaction.getTransdetail();
 * 
 * TransactionalDetail td = new TransactionalDetail();
 * td.setDepositamount(DepositedAmount); td.setWdamount(withdrawAmount);
 * System.out.println("Please find your transaction History");
 * TransacHistory.add(td); System.out.println(td);
 * 
 * 
 * } }
 */
