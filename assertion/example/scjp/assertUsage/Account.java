package example.scjp.assertUsage;

import java.io.IOException;

import org.omg.SendingContext.RunTime;

public class Account {
	
	
	private double amount;
	
	public Account(double amount) {
		
		this.amount = amount;

	}
	
	
	public void withdraw(double amount) throws Exception {
		
		if(amount < 100) {
			throw new Exception("Invalid amount withdrawl exception");
		}
		
		else {
			
			this.amount -= amount;	
		}
		
	}
	
	public int withdraw1(double amount) throws RuntimeException {
		
		assert(amount < 100):"The amount is less than 100";
		
		return -1;
	}
	
	public void dowork() throws InterruptedException{
		doSubWork();
	}


	public void doSubWork() throws InterruptedException {
		doMoreWork();
		
	/*	try{
			int x = 10;
		}catch(IOException e){
			e.printStackTrace();
		}*/
	}


	public void doMoreWork() throws InterruptedException {
		
		 throw new RuntimeException();
		
	}

	
}
