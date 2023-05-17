package based;

import java.util.Scanner;

public class Transactionhandler {

	Userdetail currentuser;
	Scanner sc = new Scanner(System.in);

	Transactionhandler(Userdetail currentuser) {
		this.currentuser = currentuser;

	}

	public void transactionHandler() {
		boolean exit = false;

		do {
			System.out.println("Press 1 for Transaction using Saving Account");
			System.out.println("Press 2 for Transaction using current Account");
			System.out.println("Press 3 for return back to main menu");
			switch (sc.nextInt()) {
			case 1:

				currentuser.getSav().transaction();
				break;
			case 2:
				if (currentuser.getCav() != null)
				{
					currentuser.getCav().transaction();
				} 
				else 
				{
					System.out.println("You Dont have Current Account");
					System.out.println("Press 1 to Open Current Account");

					switch (sc.nextInt()) {
					case 1:
						if(currentuser.getSav().getBalance()>50000 && currentuser.getCav() ==null)
						{
						long min = 1000000000;
						long max = 2000000000;
						long accno = (long) (Math.random() * (max - min + 1) + min);	
						currentuser.setCurrentAccountnoo(accno);
						currentuser.setCav(new Currentaccount());
						System.out.println("Congratulation Your Current Account generated");
						}
						else
						{
						System.out.println("You are not Eligible to Open Account");	
						}
						break;
						default:
						System.out.println("Please Enter Correct Option");	
					}
				}
				break;
			case 3:
				exit = true;
				break;
			default:
				System.out.println("Please Enter valid Choice");

			}
		} while (!exit);

	}

}
