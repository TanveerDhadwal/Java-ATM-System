//User.java
import java.util.Scanner;
import java.io.*;

public class User{
	Checking CA = new Checking();
	Saving SA = new Saving();
	protected String accNum;
	protected String pin;
	protected String name;
	Scanner input = new Scanner(System.in);
	public User(){

	}	
	public User(String fullval){
		String [] info=fullval.split(",");
		this.setName(info[0]);
		this.setAccNum(info[1]);
		this.setPin(info[2]);
		double cb=Double.parseDouble(info[3]);
		double sb=Double.parseDouble(info[4]);
		CA.Deposit(cb);
		SA.Deposit(sb);	
		
	}

	public void setAccNum(String a){
		accNum = a;
	}
	public void setPin(String p){
		pin = p;
	}
	public void setName(String n){
		name=n;
	}
	public String getAccNum(){
		return accNum;
	}	
	public String getPin(){
		return pin;
	}
	public String getName(){
		return name;
	}
	public void Interest(double ti,double inter){
		SA.applyInterest(ti,inter);
	}
	public double getCBalance(){
		return CA.getBalance();
	}
	public double getSBalance(){
		return SA.getBalance();
	}
	public void menu(){
		boolean sentry= true;
		while(sentry){
			System.out.println("Welcome to the Main Menu");
			System.out.println("Please type the the number preceeding what you wish to do \n1.) Get Checking Balance \n2.) Deposit to Checking \n3.) Withdraw from Checking \n4.) Get Saving Balance \n5.) Deposit to Savings \n6.) Withdraw from Savings \n7.) Exit");
			String amount;
			double val;
			String response = input.nextLine();
			if(response.equals("1")){
				System.out.println(CA.getBalance());
			}else if(response.equals("2")){
				System.out.println("Please enter deposit amount");
				amount = input.nextLine();
				val = Double.parseDouble(amount);
				CA.Deposit(val);
			}else if(response.equals("3")){
				System.out.println("Please enter a withdraw amount");
				amount = input.nextLine();
				val=Double.parseDouble(amount);
				CA.withDraw(val);
			}else if(response.equals("4")){
				System.out.println(SA.getBalance());
			}else if(response.equals("5")){
				System.out.println("Please enter deposit amount");
				amount = input.nextLine();
				val=Double.parseDouble(amount);
				SA.Deposit(val);			
			}else if(response.equals("6")){
				System.out.println("Please enter a withdraw amount");
				amount = input.nextLine();
				val=Double.parseDouble(amount);
				SA.withDraw(val);
			}else if(response.equals("7")){
                                 try{
                                         FileWriter outfile= new FileWriter("User.txt");
                                         PrintWriter writer=new PrintWriter(outfile);
                                         for(int k=0;k<ATM.list.size();k++){
                                                 writer.println(ATM.list.get(k).getName()+","+ATM.list.get(k).getAccNum()+","+ATM.list.get(k).getPin()+","+ATM.list.get(k    ).getCBalance()+","+ATM.list.get(k).getSBalance());

                                 }
                                         outfile.close();
                                 }catch(IOException e){
                                         System.out.println(e.getMessage());
                                 }

				System.exit(0);						
			}else{
				System.out.println("invalid response please try again");
			}
		}
	}
}
