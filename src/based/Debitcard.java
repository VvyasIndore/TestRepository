package based;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;


public class Debitcard 
{
	Userdetail curentussser;
	Scanner sc = new Scanner(System.in);
 
	public	Debitcard( Userdetail curentussser)
 	{
 		this.curentussser=curentussser;
 	}
 
	
	public LocalDate expiryDate()
	{
	int maxYearInFuture =5;	
	LocalDate currentDate=LocalDate.now();
	LocalDate expiryDate = currentDate.plusYears(new Random().nextInt(maxYearInFuture +1)).plusMonths(new Random().nextInt(12));
	return expiryDate;
	}
	
	
	
	public void getdebitcarddetails()
	{
		//System.out.println("Please Enter the Pin");
		//int pin= sc.nextInt();
		
		if(curentussser.getPin()==null)
		{
			System.out.println("Please Set the pin");
			int pin =sc.nextInt();
			
			curentussser.setPin(pin);
			System.out.println("Pin Set Successfully");
			System.out.println("Your Debit Card no is "+curentussser.getDebitCardno());
			System.out.println("Your Pin no is "+curentussser.getPin());
			System.out.println("Your cvv no is " +curentussser.getCvvno());
			System.out.println("Card Expiry date is" +expiryDate());
			
				
		}
		else
		{
			System.out.println("Please Enter the pin");
			int pin =sc.nextInt();
			if(curentussser.getPin()==pin)
			{
				System.out.println("Your Debit Card no is "+curentussser.getDebitCardno());
				System.out.println("Your Pin no is "+curentussser.getPin());
				System.out.println("Your cvv no is " +curentussser.getCvvno());
				System.out.println("Card Expiry date is" +expiryDate());

					
			}
			else
			{
				System.out.println("Please Enter Correct Pin");
			}
		}
	}
	
}
