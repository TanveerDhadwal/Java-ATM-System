ATM.class: ATM.java User.class Admin.class Checking.class Saving.class
	javac ATM.java
User.class: User.java Checking.class Saving.class
	javac User.java
Checking.class: Checking.java
	javac Checking.java
Saving.class: Saving.java Checking.class
	javac Saving.java
Admin.class: Admin.java User.class Checking.class Saving.class
	javac Admin.java
run: ATM.class
	java ATM
clean:
	rm *.class
