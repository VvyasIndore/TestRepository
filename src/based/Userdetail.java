package based;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Random;

public class Userdetail {
	private String userid;
	private String firstName;
	private String lastName;
	private int age;
	private String dob;
	private long mobileNo;
	private String password;
	private long savingAccount;
	private Savvingaccount sav;
	private long savingAccountno;
	private long currentAccountnoo;
	public BigInteger getCreditno() {
		return creditno;
	}

	public long getSavingAccountno() {
		return savingAccountno;
	}

	public void setSavingAccountno(long savingAccountno) {
		this.savingAccountno = savingAccountno;
	
	}
	

	public void setCreditno(BigInteger creditno) {
		this.creditno = creditno;
	}

	

	public int getCreditcvvno() {
		return creditcvvno;
	}

	public void setCreditcvvno(int creditcvvno) {
		this.creditcvvno = creditcvvno;
	}

	public Integer getCreditcardpin() {
		return creditcardpin;
	}

	public void setCreditcardpin(Integer creditcardpin) {
		this.creditcardpin = creditcardpin;
	}

	private Currentaccount cav;
	private BigInteger debitCardno;
	private BigInteger creditno;
	private int creditcvvno;
	private Integer creditcardpin;
	private int cvvno;
	private Integer pin;
	private LocalDate creditcardexpirydate;
	private LocalDate debitcardexpirydate;

	
	
	// public Userdetail(String userid, String firstname, String lastname, int age,
	// String dOB, long mobileno,String password)
	// {
	// this.userid = userid;
	// Firstname = firstname;
	// Lastname = lastname;
	// this.age = age;
	// DOB = dOB;
	// Mobileno = mobileno;
	// this.password = password;

	// }

	// public Userdetail()
	// {

	// }

	public LocalDate getCreditcardexpirydate() {
		return creditcardexpirydate;
	}

	public void setCreditcardexpirydate(LocalDate creditcardexpirydate) {
		this.creditcardexpirydate = creditcardexpirydate;
	}

	public LocalDate getDebitcardexpirydate() {
		return debitcardexpirydate;
	}

	public void setDebitcardexpirydate(LocalDate debitcardexpirydate) {
		this.debitcardexpirydate = debitcardexpirydate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstName) {
	this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getdob() {
		return dob;
	}

	public void setdob(String dob) {
		this.dob = dob;
	}

	public long getmobileNo() {
		return mobileNo;
	}

	public void setMobileno(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getsavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(long savingAccount) {
		this.savingAccount = savingAccount;
	}

	public Savvingaccount getSav() {
		return sav;
	}

	public void setSav(Savvingaccount sav) {
		this.sav = sav;
	}

	public Currentaccount getCav() {
		return cav;
	}

	public void setCav(Currentaccount cav) {
		this.cav = cav;
	}

	
	public int getCvvno() {
		return cvvno;
	}

	public void setCvvno(int cvvno) {
		this.cvvno = cvvno;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	
	public BigInteger getDebitCardno() {
		return debitCardno;
	}

	public void setDebitCardno(BigInteger debitCardno) {
		this.debitCardno = debitCardno;
	}
	
	
	
	

	public long getCurrentAccountnoo() {
		return currentAccountnoo;
	}

	public void setCurrentAccountnoo(long currentAccountnoo) {
		this.currentAccountnoo = currentAccountnoo;
	}

	

	@Override
	public String toString() {
		return "Userdetail [userid=" + userid + ", Firstname=" + firstName + ", Lastname=" + lastName + ", age=" + age
				+ ", DOB=" + dob + ", Mobileno=" + mobileNo + ", savingAccountno=" + savingAccountno + "]";
	}

	
	
	
	
	}

