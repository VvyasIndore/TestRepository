package based;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Creditcard 
{
	Userdetail curentUssser;

	Scanner sc = new Scanner(System.in);
	 
	public	Creditcard(Userdetail curentUssser)
 	{
 		this.curentUssser=curentUssser;
 	}
 
	
	
	public LocalDate expiryDate()
	{
	int maxYearInFuture =5;	
	LocalDate currentDate=LocalDate.now();
	LocalDate expiryDate = currentDate.plusYears(new Random().nextInt(maxYearInFuture +1)).plusMonths(new Random().nextInt(12));
	return expiryDate;
	}
	
	
	public void getCreditCardetails()
	{
		//System.out.println("Please Enter the Pin");
		//int pin= sc.nextInt();
		
		if(curentUssser.getCreditcardpin()==null)
		{
			System.out.println("Please Set the pin");
			int pin =sc.nextInt();
			
			curentUssser.setCreditcardpin(pin);
			System.out.println("Pin Set Successfully");
			System.out.println("Your Credit Card no is "+curentUssser.getCreditno());
			System.out.println("Your Pin no is "+curentUssser.getCreditcardpin());
			System.out.println("Your cvv no is " +curentUssser.getCreditcvvno());
			System.out.println("Your Expiry date is" + expiryDate());
			
		}
		else
		{
			System.out.println("Please Enter the pin");
			int pin =sc.nextInt();
			if(curentUssser.getCreditcardpin()==pin)
			{
				System.out.println("Your Credit Card no is "+curentUssser.getCreditno());
				System.out.println("Your Pin no is "+curentUssser.getCreditcardpin());
				System.out.println("Your cvv no is " +curentUssser.getCreditcvvno());
					
			}
			else
			{
				System.out.println("Please Enter Correct Pin");
			}
		}
	}
	
}

	

