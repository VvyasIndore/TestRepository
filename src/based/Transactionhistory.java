package based;

import java.util.Scanner;

public class Transactionhistory {
	Scanner sc = new Scanner(System.in);
	Userdetail currentuser;

	Transactionhistory(Userdetail currentuser) {
		this.currentuser = currentuser;
	}

	public void Trransaction() {

		boolean exit = false;

		do {
			System.out.println("Press 1 for Saving Transaction History");
			System.out.println("Press 2 for Current Transaction History");
			System.out.println("Press 3 for return Back");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Please Find your Transaction History");
				currentuser.getSav().transhistory();
				break;
			case 2:
				if (currentuser.getCav() != null) {
					System.out.println("Please find your Transaction History");
					currentuser.getCav().cuurenHistory();
				} else {
					System.out.println("You Dont have Current Account");
				}
				break;
			case 3:
				exit = true;
				break;
			default:
				System.out.println("Please enter valid choice");
			}
		} while (!exit);
	}

}
