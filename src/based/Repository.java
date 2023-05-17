 package based;

import java.util.ArrayList;


public class Repository 
{
	 ArrayList<Userdetail> userlist = new ArrayList<Userdetail>();
	
	// ArrayList<SavvingAccount> savingtransaction =  new ArrayList<SavvingAccount>();
	// ArrayList<CurrentAccount>    CurrentTransaction = new ArrayList<CurrentAccount>();
	 
	 ArrayList<Transaction> SavingHistory = new ArrayList<Transaction>();
	ArrayList<Transaction> currentHistory = new ArrayList<Transaction>();

	public void addSavingHistory(Transaction a) 
	{
		SavingHistory.add(a);
	}
	
	public ArrayList<Transaction> getSavinghistory()
	{
		return SavingHistory;
	}
	
	public void addCurrentHistory(Transaction a)	
	{
		currentHistory.add(a);
	}
	
	public ArrayList<Transaction> getCurrentHistory()
	{
		return currentHistory;
	}
	
	public  void addUser(Userdetail a)
	{
		userlist.add(a);
	}
	
	public  ArrayList<Userdetail> getUserList()
	{
		
		return userlist;
	}
	
	/*public void addsavingtransaction(SavvingAccount a)
	{
		savingtransaction.add(a);
		
	}
	public void addcurrenttransaction(CurrentAccount c)
	{
		CurrentTransaction.add(c);
	}
	
	
	public ArrayList<SavvingAccount> getSavingList()
	{
		return savingtransaction;
	}
	
	public ArrayList<CurrentAccount> getCurrentList()
	{
		return CurrentTransaction;
	}
	*/
}






