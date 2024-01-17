//Checking.java


public class Checking {
	protected double balance;
	
	public Checking(){
		
	}
	public void Deposit(double v){
		balance=balance+v;
	}
	public void withDraw(double v){
		if(balance>=v){
			balance=balance-v;
		}else{
			System.out.println("Withdraw amount exceeds current balance. Please try again with a withdraw amount equal to or below current balance");	
		}
	}
	public double getBalance(){
		return balance;
	}	
}
