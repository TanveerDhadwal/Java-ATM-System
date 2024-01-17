## Algorithm.md
## ATM.java
	import all necessary info
	create the public class
		declare a new instance of admin
		create a static arraylist called list
		create the main function
			create a new instance of atm
	create the atm constructor
		read the user.txt file and add each line as a new user and pass the line into the constructor of user
	call the login method from ATM
	create the login method 
		create a boolean sentry variable 
		create a while loop that runs while sentry is true
			print out enter account number
			take in the response
			call the ifUser method with response as the parameter
			check to see if the response equals 00000
				if it does print out enter a password 
				check to see if the password equals 12345
					if it does call administrator menu method 
				else if ifUser(response)
					don onthing
				else print out incorrect please try again
	create the boolean ifUser method which takes in a string
		declare teh an int
		create a for loop that goes through the size of the arraylist
			check to see if list equals r
				if it does ask for password then check tosee if that equals each other then call teh menu method from user for that one
				return true
		return false

## Admin.java
	create the Admin class which extends user
	create a scanner input
	create an admin constructor
	create the menu method
		create a sentry which equals true
		create a while loop that works until sentry is false
		print out the menu which is baiscally all of the things and call each method accordingly
	create the addUser which takes in 5 parameters
		append to the User.txt file and add all the parameters in there
	create the listusers method
		loop throught the size of the arraylist
			print out the checkign saving name and account number for every index inside of the list
	create teh applyint which takes in two doubles
		create a for loop that cycles through all of the users in the arraylist
		call the interest  method whic htakes in the two doubles


## User.java
	create the class user
		create a new instance of checkign
		create a new instance o fsaving 
		create a protected accnum	
		create a proctected pin 
		create a protected name
		create a scanner input
		create teh user constructor
		create another constructor which takes in a string
			create a new array fo string which divides the passed in string by , 
			setname array index 0
			setaccnum array index 1
			set pin araray index 2
			deposit saving array index 3
			deposit  saving array index 4

		create setaccount number which takes in a string
			set accNum to a
		create setPin wich takes in a string
			set pin to p
		creat setName which takes in a string 
			set name to intaken string
		create getaccnum
			returns acctnum
		create get pin
			return pin
		create getname
			return name
		create a interest whic htakes in two doubles
			call saving. applyinterest which takes in double
		create a getCBalance 
			return checking instance and getBalance
		creat a Sbalance
			retrun sa.getbalnce
		create teh menu method
			create a sentry variable 
			create a while loop that uses the sentry variable 
				create the main menu and call each thing accordingly given the response

## Checking.java
		create the Checking class 
		create a protected dobule balance 
		create a public checking constructor
		create a deposit which takes in a parameter double 
			add the parameter to banance
		create withdraw which takes in a parameter double 
			if balance is less than taken in parameter
				printout not enough in balance to do this please enter valid
		 	else subtract the taken in parameter from balance
		create a getBalance which returns douuble
			return balance
## Saving.java
	create the Saving class which extends checking
		create applyInterest which takes in two doubles
		set balance using the balance formula
