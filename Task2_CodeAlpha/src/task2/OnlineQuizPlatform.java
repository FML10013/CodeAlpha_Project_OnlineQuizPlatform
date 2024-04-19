package task2;
import java.util.Scanner;

public class OnlineQuizPlatform {
	
	private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit = false;
        while (!quit) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
	    
	}
	  private static void Deposit() {
		// TODO Auto-generated method stub
		  System.out.print("Enter the amount to deposit: ");
	        double amount = scanner.nextDouble();
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. Current balance: $" + balance);
	        } else {
	            System.out.println("Invalid amount. Please enter a positive number.");
	        }
	}
	private static void withdraw() {
		// TODO Auto-generated method stub
		  System.out.print("Enter the amount to withdraw: ");
	        double amount = scanner.nextDouble();
			 if (amount > 0 && amount <= balance) {
		            balance -= amount;
		            System.out.println("Withdrawal successful. Current balance: $" + balance);
		        } else if (amount > balance) {
		            System.out.println("Insufficient balance.");
		        } else {
		            System.out.println("Invalid amount. Please enter a positive number.");
		        }
		  }
	
	private static void checkBalance() {
		// TODO Auto-generated method stub
		  System.out.println("Your current balance is: $" + balance);
	}
		

	}


