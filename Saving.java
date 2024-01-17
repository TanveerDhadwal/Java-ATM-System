//Saving.java

public class Saving extends Checking{
	
	public void applyInterest(double t, double r){
		balance=balance*(1+(r*t));
	}
}
