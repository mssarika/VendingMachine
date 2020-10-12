Vending Machine
---------------
This is a Vending Machine project. 

To run the Vending machine please follow the below steps : 

1. Clone the repository to a folder on to your machine
2. Navigate to the folder
3. Check the PreRequisites and install the missing softwares 

PreRequisites for running the tests :
-----------------------------------
	* Java 8
	* maven 
		-To install maven on your system please refer https://maven.apache.org/install.html 

4. Running the Vending machine program
--------------------------------------
To start the Vending Machine program please run the StartVendingMachine.bat file found in the base folder. 
This will download the dependencies, build the project, run the unit tests and start the Vending Machine.
You should be able to see the Vending Machine menu now.

Good to Know : 
Reset operation for vending machine supplier
--------------------------------------------
This functionality requires the user to enter a Supplier code. The valid supplier code is '999'. 
On selecting the reset option, when prompted please enter 999. 

Selecting the drink
-------------------
For selecting the drink the valid entries are 1/2/3

Cancelling the request after selecting the drink
------------------------------------------------
Enter 9 to cancel the transaction

Source Code
-------------
This is a maven project, so the folder structure follows maven standards

-The Vending Machine implementation can be found in src/main/java/VendingMachineImplementation folder
-Supporting classes can be found in src/main/java 
-The Unit tests can be found in src/test/java/VendingMachineTests folder


