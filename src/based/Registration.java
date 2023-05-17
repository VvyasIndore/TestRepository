package based;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Registration {

	Scanner sc = new Scanner(System.in);
	// ArrayList<Userdetail> userList = new ArrayList<Userdetail>();

		public String number() {
		String debitcardno = "";

		Random random = new Random();
		for (int i = 0; i < 16; i++) {
			debitcardno += random.nextInt(10);
		}
		return debitcardno;
	}

	public String creditnumber() {
		String Creditcardno = "";

		Random random = new Random();
		for (int i = 0; i < 16; i++) {
			Creditcardno += random.nextInt(10);
		}
		return Creditcardno;
	}

	Userdetail ud = new Userdetail();

	public Userdetail getRegistration() {

		System.out.println("Enter your Userid");
		System.out.println("Userid must be in AlphaNumeric");
		String userid = sc.next();
		ud.setUserid(userid);
		System.out.println("Enter the password");
		String password = sc.next();
		ud.setPassword(password);
		System.out.println("Enter FirstName");
		String firstName = sc.next();
		ud.setFirstname(firstName);
		System.out.println("Enter Lastname");
		String lastName = sc.next();
		ud.setLastname(lastName);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		ud.setAge(age);
		System.out.println("Enter your DOB");
		String dob = sc.next();
		ud.setdob(dob);
		System.out.println("Enter your Mobile no");
		long mob = sc.nextLong();
		ud.setMobileno(mob);
		System.out.println(ud);
		long min = 1000000000;
		long max = 2000000000;
		long accno = (long)(Math.random() * (max - min + 1) + min);
		ud.setSavingAccountno(accno);
		int min1 = 100;
		int max1 = 200;
		int cvvvv = (int) (Math.random() * (max1 - min1) + min1);
		ud.setCvvno(cvvvv);
		int mincredit1 = 100;
		int maxcredit1 = 200;
		int creditcvv = (int) (Math.random() * (maxcredit1 - mincredit1) + mincredit1);
		ud.setCreditcvvno(creditcvv);
		BigInteger debitcrdno = new BigInteger(number());
		ud.setDebitCardno(debitcrdno);
		BigInteger Creditcardno = new BigInteger(number());
		ud.setCreditno(Creditcardno);
		ud.setSav(new Savvingaccount());
		System.out.println();
		System.out.println("Your Registration has done Successfully");
		System.out.println();
		System.out.println("You Saving Account number is " + ud.getSavingAccountno());
		System.out.println();
		// ud.setCav(new CurrentAccount());
		// BankingProj1.message();
		return ud;

	}

//	public ArrayList<Userdetail> getUserDetailList() {
//		return userList;
//	}

}
