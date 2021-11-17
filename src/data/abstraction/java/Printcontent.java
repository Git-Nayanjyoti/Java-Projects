package data.abstraction.java;

public class Printcontent {

	public static void main(String[] args) {
		//RBI obj = new RBI();
		
		SBIBank bank = new SBIBank();
		bank.depositMoney();
		bank.giveInterest();
	} 
}
