echo Building the project
call mvn clean compile
call mvn package
echo Opening the VendingMachine....
call java -cp target/VendingMachine-0.0.1-SNAPSHOT.jar VendingMachineImplementation.VendingMachine