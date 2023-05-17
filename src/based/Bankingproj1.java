package based;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bankingproj1 {
	// Userdetail cb;
	Repository repo = new Repository();
	ArrayList<Userdetail> userList = repo.getUserList();

	// int a=5;

	// int b=6;
	int no;
	// ArrayList<Userdetail> list = repo.userlist;
	boolean isExit = false;

	void message() {
		// boolean isExit = false;
		Userdetail curt;
		curt = null;
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("Wellcome to the New Banking Software");
			System.out.println("Please Enter the following Option");
			System.out.println("*******1******For Registration");
			System.out.println("*******2******for Login");
			System.out.println("*******3******for Showing UserList");
			System.out.println("*******4******for Exit");
			System.out.println("Please Enter your Choice");
			no = sc.nextInt();

			// while (!(no == 0)) {
			switch (no) {
			case 1:

				Registration rc = new Registration();
				Userdetail usrdtl = rc.getRegistration();

				repo.addUser(usrdtl);
				curt = usrdtl;
				// list.add(usrdtl);
				// list.add(repo.addUser(usrdtl));
				// message();

				break;
			case 2:
				// ArrayList<Userdetail> userList=repo.getUserList();

				if (curt != null) {
					Loginclass lc = new Loginclass(userList);

					lc.logg();

				} else {
					System.out.println("You are not Registered, please do the Registration first");
				}

				// message();

				// Loginclass.logg();
				break;
			case 3:
				if (userList.contains(curt)) {
					System.out.println("Please Find User Detail List");
					Iterator itr1 = userList.iterator();
					while (itr1.hasNext()) {

						System.out.println(itr1.next());
					}
				} else {
					System.out.println("You Dont have any User");
				}
				break;
			case 4:
				// b=5;
				// a=6;

				System.out.println("Thanks for using our Application");
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter the Valid no");
				System.out.println("************************************************************");
				// message();
			}
		} while (!(isExit));
	}

	public static void main(String[] args) {

		Bankingproj1 bj = new Bankingproj1();
		bj.message();

	}

}
