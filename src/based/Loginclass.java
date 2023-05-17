package based;

import java.util.ArrayList;
import java.util.Scanner;

public class Loginclass {
	// ArrayList<TransactionHandler> transactionlist = new
	// ArrayList<TransactionHandler>();

	private ArrayList<Userdetail> usrlst;
	Userdetail currentuser;
	Userdetail ud = new Userdetail();

	public Loginclass(ArrayList<Userdetail> usrlst) {
		this.usrlst = usrlst;
	}

	// Repositoryclass repo = new Repositoryclass();
	// SavvingAccount ts = new SavvingAccount();
	// CurrentAccount ca = new CurrentAccount();
	
	Repository rc = new Repository();
//	BankingProj1 ba = new BankingProj1();
	Scanner sc = new Scanner(System.in);
	// Scanner sm = new Scanner(System.in);
	

	/*
	 * public void usermessage() { boolean isExit = false; do { int no;
	 * System.out.println("Wellcomee to your page");
	 * System.out.println("*****1****for deposit money");
	 * System.out.println("*****2*****for withdrwal money");
	 * System.out.println("*****3*****for Check Balance");
	 * System.out.println("*****4*****for Transaction History");
	 * System.out.println("*****5*****for Return Back To main Menu");
	 * System.out.println("Please Enter your Choice"); no = sc.nextInt(); switch
	 * (no) { case 1: System.out.
	 * println("Plese Select the Account type 101 for Saving &102 for Current"); int
	 * choice; choice = sc.nextInt(); switch (choice) { case 1:
	 * System.out.println("Please Enter the Amount to be Deposit"); double
	 * savingAmount = sc.nextDouble(); double b = ts.DepositAmount(savingAmount);
	 * rc.addsavingtransaction(ts); System.out.println("your Saving balance is" +
	 * b); // usermessage(); break; case 2:
	 * System.out.println("Please Enter the Amount to be Deposit"); double
	 * currentAmount = sc.nextDouble(); double ab = ca.depositAmount(currentAmount);
	 * rc.addcurrenttransaction(ca);
	 * System.out.println("your Current Account balance is" + ab); // usermessage();
	 * break; default: System.out.println("Please Enter correct no"); //
	 * usermessage(); } break; case 2: System.out.
	 * println("Please Select the Account for withdrawl 201 for saving &202 for current"
	 * ); int wchoice; wchoice = sc.nextInt(); switch (wchoice) { case 1:
	 * System.out.println("Please Enter the Amount for withdrawl"); double
	 * wtdrawamnt = sc.nextDouble(); if (ts.getBalance() < wtdrawamnt) {
	 * System.out.println("Insufficent balance"); } else { double sawtd =
	 * ts.withdrlamont(wtdrawamnt); rc.addsavingtransaction(ts);
	 * System.out.println("you Current saving account balance is " + sawtd); } //
	 * usermessage(); break; case 2:
	 * System.out.println("Please Enter the Amouny for withdrwal"); double
	 * crntwthdrl = sc.nextDouble(); if (ca.getBalance() < crntwthdrl) {
	 * System.out.println("Insuffient balance"); } else { double bcv =
	 * ca.withdrwlAmount(crntwthdrl); rc.addcurrenttransaction(ca);
	 * System.out.println("you Current balance is " + bcv); } // usermessage();
	 * break; default: System.out.println("Please enter correct no"); //
	 * usermessage(); } break; case 3:
	 * System.out.println("301 for saving balance &302 for current balance"); int
	 * bchoice; bchoice = sc.nextInt(); switch (bchoice) { case 1:
	 * System.out.println(ts.getBalance()); usermessage(); break; case 2:
	 * System.out.println(ca.getBalance()); // usermessage(); break; default:
	 * System.out.println("please Enter correct no for checking balance"); } break;
	 * 
	 * case 4:
	 * System.out.println("press 501 for Saving History &502 For Current History");
	 * int hischoice = sc.nextInt(); switch (hischoice) { case 1:
	 * System.out.println("Please find your transaction history");
	 * ts.transhistory(); break; case 2:
	 * System.out.println("Please find you Current Account Transaction History");
	 * ca.cuurenHistory(); break; default:
	 * System.out.println("Please Enter Correct No"); }
	 * 
	 * break; case 5: isExit = true; System.out.println("Thanks for using our app");
	 * break; default: System.out.println("Please Enter Valid Choice"); } } while
	 * (!isExit); }
	 */

	// ArrayList<TransactionHandler> getTransactionList()
	// {
	// return transactionlist;
	// }

	
	
	public void logg() 
	{
		
		
		System.out.println("Wellcome to Login page");
		System.out.println("Enter login details");
		System.out.println("Enter the Userid");
		String a = sc.next();
		System.out.println("Enter the Password");

		String b = sc.next();
		
		currentuser = null;

		// ArrayList<Userdetail> usrlst = repo.getUserList();

		// System.out.println("name "+ userList.get(0).getUserid() +" i "+ 0);
		// System.out.println("name "+ userList.get(1).getUserid() +" i "+ 1);

		// System.out.println(userList.size());
		// for(int i =0;i<userList.size();i++)

		for (Userdetail ele : this.usrlst) {
			if (a.equals(ele.getUserid()) && b.equals(ele.getPassword())) {
				System.out.println("User Login Successful");
				
				

				currentuser = ele;
			//	System.out.println(currentuser.getSavingAccount());
				Savvingaccount sv = currentuser.getSav();
				Currentaccount cv = currentuser.getCav();

				boolean isExit = false;
				do {
					int no;
					System.out.println("*****1*****for Transaction ");
					System.out.println("*****2*****for Transaction History");
					System.out.println("*****3*****for Showing debit card details");
					System.out.println("*****4*****for Creating Credit Card");
					System.out.println("*****5******for Check your Profile");				
					System.out.println("*****6******for Returning Back to Main Menu");
					System.out.println("Please Enter your Choice");
					no = sc.nextInt();
					switch (no) {
					
					case 1:
						Transactionhandler trnsac = new Transactionhandler(currentuser);
						trnsac.transactionHandler();
						break;
						
					case 2: 
						Transactionhistory hhh = new Transactionhistory(currentuser);
						hhh.Trransaction();
						break;
//					case 1:
//						System.out.println("Plese Select the Account type 1 for Saving and 2 for Current");
//						int choice;
//						choice = sc.nextInt();
//						switch (choice) {
//						case 1:
//							System.out.println("Please Enter the Amount to be Deposit");
//							double savingAmount = sc.nextDouble();
//							double v = sv.DepositAmount(savingAmount);
//
//							// rc.addsavingtransaction(ts);
//							System.out.println("your Saving Account balance is" + v);
//							// usermessage();
//							break;
//						case 2:
//
//							if ((currentuser.getCav() != null)) {
//								System.out.println("Please Enter the Amount to be Deposit");
//								double currentAmount = sc.nextDouble();
//								double ab = currentuser.getCav().depositAmount(currentAmount);
//								// System.out.println("exevvrfrfergtergregf");
//								// rc.addcurrenttransaction(ca);
//								System.out.println("your Current Account balance is" + ab);
//							} else {
//								System.out.println("You Dont have Current Account");
//							}
//							// usermessage();
//							break;
//						default:
//							System.out.println("Please Enter correct no");
//							// usermessage();
//						}
//						break;
//					case 2:
//						System.out.println("Please Select the Account for withdrawl 1 for saving  and 2 for current");
//						int wchoice;
//						wchoice = sc.nextInt();
//						switch (wchoice) {
//						case 1:
//							System.out.println("Please Enter the Amount for withdrawl");
//							double wtdrawamnt = sc.nextDouble();
//							if (sv.getBalance() < wtdrawamnt) {
//								System.out.println("Insufficent balance");
//							} else {
//								double sawtd = sv.withdrlamont(wtdrawamnt);
//								// rc.addsavingtransaction(ts);
//								System.out.println("you Current saving account balance is " + sawtd);
//							}
//							// usermessage();
//							break;
//						case 2:
//							if ((currentuser.getCav() != null)) {
//								System.out.println("Please Enter the Amouny for withdrwal");
//								double crntwthdrl = sc.nextDouble();
//								if (currentuser.getCav().getBalance() < crntwthdrl) {
//									System.out.println("Insuffient balance");
//								} else {
//									double bcv = currentuser.getCav().depositAmount(crntwthdrl); // rc.addcurrenttransaction(ca);
//									System.out.println("you Current balance is " + bcv);
//								}
//							} else {
//								System.out.println("You Dont have Current Account");
//							}
//							// usermessage();
//							break;
//						default:
//							System.out.println("Please enter correct no");
//							// usermessage();
//						}
//						break;
//					case 3:
//						System.out.println("1 for saving balance and 2 for current balance");
//						int bchoice;
//						bchoice = sc.nextInt();
//						switch (bchoice) {
//						case 1:
//							System.out.println(sv.getBalance());
//							// usermessage();
//							break;
//						case 2:
//							if ((currentuser.getCav() != null)) {
//								System.out.println(currentuser.getCav().getBalance());
//							} else {
//								System.out.println("You Dont have Current Account");
//							}
//							// usermessage();
//							break;
//						default:
//							System.out.println("please Enter correct no for checking balance");
//						}
//						break;
//					case 2:
//						System.out.println("press 1 for Saving History  and 2 For Current History");
//						int hischoice = sc.nextInt();
//						switch (hischoice) {
//						case 1:
//							System.out.println("Please find your transaction history");
//							sv.transhistory();
//							break;
//						case 2:
//							if ((currentuser.getCav() != null)) {
//								System.out.println("Please find you Current Account Transaction History");
//								currentuser.getCav().cuurenHistory();
//							} else {
//								System.out.println("You Dont have Current Account");
//							}
//							break;
//						default:
//							System.out.println("Please Enter Correct No");
//						}
//
//						break;
					case 3:
						Debitcard db = new Debitcard(currentuser);
						db.getdebitcarddetails();
						break;
						
					case 4:
						
						if (currentuser.getSav().getBalance()> 500000 && currentuser.getCav() != null) {
							if (currentuser.getCav().getBalance() > 500000) {
								System.out.println("You are eligible to open a credit card");
								Creditcard cd = new Creditcard(currentuser);
								cd.getCreditCardetails();

							}

							else {
								System.out.println("It seems you Dont have Enough Balance in current Account");
							}
						} else {
							System.out.println("You are not eligible to open a credit card");
						}
						break;
						
					case 5:
						System.out.println("Your Userid is" +currentuser.getUserid());
						System.out.println("Your Account name is " +currentuser.getFirstname());
						System.out.println("Your Saving Account no is" +currentuser.getSavingAccountno());
						System.out.println("Your Current Account no is"+currentuser.getCurrentAccountnoo());
						System.out.println("Your Debit Card no is " +currentuser.getDebitCardno());
						System.out.println("your Debit card cvv no is" +currentuser.getCvvno());
						//System.out.println("Your Credit Card no is" +currentuser.getCreditno());
						//System.out.println("Your Credit card cvv no is "+currentuser.getCreditcvvno());
						break;
//					case 5:
//						if (sv.getBalance() > 500000 && currentuser.getCav() != null) {
//							if (currentuser.getCav().getBalance() > 500000) {
//								System.out.println("You are eligible to open a credit card");
//								creditcard cd = new creditcard(currentuser);
//								cd.getcreditcardetails();
//
//							}
//
//							else {
//								System.out.println("It seems you Dont have Enough Balance in current Account");
//							}
//						} else {
//							System.out.println("You are not eligible to open a credit card");
//						}
//						break;
//					case 8:
//						if (currentuser.getCav() == null ) {
//							// if (sv.getBalance() > 100000) {
//
//							currentuser.setCav(new CurrentAccount());
//							System.out.println("Congratulation your Current Account Generated");
//						} else {
//							System.out.println(
//									"You already have an Current Account");
//						}
//						break;
					case 6:
						isExit = true;
						System.out.println("Thanks for using our app");
						break;
					default:
						System.out.println("Please Enter Valid Choice");
					}
				} while (!isExit);

				// usermessage();

				// {
				// System.out.println("name "+ userList.get(i).getUserid() +" i "+ i);

				// if(a.equals(userList.get(i).getUserid()) &&
				// (b.equals(userList.get(i).getPassword())))
				// {
				// System.out.println("I m in if block1");
			}
			// else
			// BankingProj1.message();
		}
		if (currentuser == null) 
		{
			System.out.println("Please Enter correct password");
		}

	}

}
