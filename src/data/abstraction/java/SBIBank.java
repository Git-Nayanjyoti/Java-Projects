package data.abstraction.java;

public class SBIBank implements RBI {

	// it is the responsibility of the class implementing the interface
	// to implement all the methods of the interface
	@Override
	public void depositMoney() {
		System.out.println("Depositing Money");

	}

	@Override
	public void withdrawMoney() {
		System.out.println("Withdrawing Money");

	}

	@Override
	public void giveInterest() {
		System.out.println("Interest Rate is 4 percent");

	}

}
