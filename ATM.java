//ATM.java

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class ATM{
	Admin ad = new Admin();
	static ArrayList<User> list = new ArrayList<User>();
	Scanner input = new Scanner(System.in);
	public static void main(String args[]){		
		ATM ATM = new ATM();
	}
	
	public ATM(){
	
		try{
			File daFile=new File("User.txt");
			Scanner in= new Scanner(daFile);
			while(in.hasNext()){
				String Line=in.nextLine();
				ATM.list.add(new User(Line));
	

			} 

		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		this.login();	
	}
	public void login(){
		boolean sentry=true;
		while(sentry){
			System.out.println("Please enter Account Number");
			String response = input.nextLine();
			if(response.equals("00000")){
				System.out.println("Please enter a password");
				String ir = input.nextLine();
				if((ir.equals("12345"))){
					ad.menu();
				}
			}
			else if(ifUser(response)){
				int elmo=1;
			}
			else{
				System.out.println("incorrect please try again");
			}
		}
	}

	public boolean ifUser(String r){
		int ans;	
		for(int i = 0;i<list.size();i++){
				
			if(r.equals(list.get(i).getAccNum())){		
				System.out.println("Please enter a password");
				String in =input.nextLine();
				if(in.equals(list.get(i).getPin())){
				
					list.get(i).menu();
					return true;
					
				}
				
			}	
		} 
		return false;
	} 
}
