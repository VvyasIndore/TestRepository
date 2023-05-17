package based;

public class Transaction 
{
 private double Amount;
 
 enum Transtype
 {
	 DEPOSIT,WITHDRAWL;
 }
 
 private Transtype type;
 
 private double TotalBalance;

public double getAmount() {
	return Amount;
}

public void setAmount(double amount) {
	Amount = amount;
}

public Transtype getType() {
	return type;
}

public void setType(Transtype type) {
	this.type = type;
}

public double getTotalBalance() {
	return TotalBalance;
}

public void setTotalBalance(double totalBalance) {
	TotalBalance = totalBalance;
}
 
 
 
 
 
 
 
 
}