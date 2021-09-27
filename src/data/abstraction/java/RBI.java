package data.abstraction.java;

public interface RBI {

	//by default all the members of Interface are abstract
	//you cannot create object of Interface
	public abstract void depositMoney();
	
	public void withdrawMoney();
	
	public void giveInterest();
	
}