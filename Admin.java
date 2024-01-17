//Admin.java

import java.util.Scanner;
import java.io.*;

public class Admin extends User{
	Scanner input = new Scanner(System.in);
	public Admin(){
			
	}
	public void menu(){
		boolean sentry=true;

		while(sentry){
			System.out.println("Welcome to the Admin Menu");
			System.out.println("Please type the number preceeding what you want to do \n1.) Add User \n2.) Delete User \n3.) List all Users \n4.) Apply Interest \n5.) Exit");
			String response = input.nextLine();
			if(response.equals("1")){
				System.out.println("Please enter new User name in the format Last First");
				String name= input.nextLine();
				System.out.println("Please enter a 5 digit account num");
				String accountnum=input.nextLine();
				System.out.println("Please enter a 5 digit pin");
				String p=input.nextLine();
				System.out.println("Please enter a starting balance for checking");
				String c=input.nextLine();
				System.out.println("Please enter a starting balance for savings");
				String s=input.nextLine();
				addUser(name,accountnum,p,c,s);
			}
			else if(response.equals("2")){
				listUsers();
				System.out.println("Input a line number to be deleted \nex. 1. Scott Michael, 12309, Checkings: 20000,Savings 3245\n You would type 1 to remove this line");
				String de=input.nextLine();
				int d=Integer.parseInt(de);
				deleteUser(d);
			}
			else if(response.equals("3")){
				listUsers();
			}
			else if(response.equals("4")){
				System.out.println("Please enter a time in months");
				String time=input.nextLine();
				double datime=Double.parseDouble(time);
				System.out.println("Please enter a interest rate");
				String interest=input.nextLine();
				double dainterest=Double.parseDouble(interest); 
				applyInt(datime,dainterest);
			}
			else if(response.equals("5")){
				try{
                        		FileWriter outfile= new FileWriter("User.txt");
                        		PrintWriter writer=new PrintWriter(outfile);
                        		for(int k=0;k<ATM.list.size();k++){
                               	         	writer.println(ATM.list.get(k).getName()+","+ATM.list.get(k).getAccNum()+","+ATM.list.get(k).getPin()+","+ATM.list.get(k).getCBalance()+","+ATM.list.get(k).getSBalance());
                                	
                        	}
					outfile.close();
                	 	}catch(IOException e){
                        	 	System.out.println(e.getMessage());
                 		}
				
				System.exit(0);
			}
			else{
				System.out.println("invalid response please try again");
			}
		}
	}
	public void addUser(String n,String a, String p,String cb,String sb){
		try{
			FileWriter outfile= new FileWriter("User.txt",true);
			PrintWriter writer= new PrintWriter(outfile);
			writer.println(n+","+ a +","+ p +","+cb+","+sb);
			outfile.close();

		} catch (IOException e){
			System.out.println(e.getMessage());
		}
		ATM.list.add(new User(n+","+a+","+p+","+cb+","+sb));		
		
	}
	public void deleteUser(int n){

		try{
			ATM.list.remove(n);
			FileWriter outfile= new FileWriter("User.txt");
			PrintWriter writer=new PrintWriter(outfile);
			for(int k=0;k<ATM.list.size();k++){
					writer.println(ATM.list.get(k).getName()+","+ATM.list.get(k).getAccNum()+","+ATM.list.get(k).getPin()+","+ATM.list.get(k).getCBalance()+","+ATM.list.get(k).getSBalance());		
						
			}
			outfile.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	
	}
	public void listUsers(){
		for(int x=0;x<ATM.list.size();x++){
			System.out.println(x+". "+ATM.list.get(x).getName()+ ","+ATM.list.get(x).getAccNum()+", Checking Balance:"+ATM.list.get(x).getCBalance()+", Saving Balance: "+ATM.list.get(x).getSBalance());
		}
	}
	public void applyInt(double t,double r){
		for(int i=0;i<ATM.list.size();i++){
			ATM.list.get(i).Interest(t,r);
		}
	}
}
