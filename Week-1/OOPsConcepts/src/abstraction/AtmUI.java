package abstraction;

import java.util.Scanner;

public class AtmUI {

	public static void main(String[] args) {
		System.out.println("***  WELCOME TO ATM  ***");
		Scanner scanner =new Scanner(System.in);
		
		IBank bank = new BankImp2(); 
		
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("Enter 1 to deposit");
			System.out.println("Enter 2 to withdraw");
			System.out.println("Enter 3 to exit");
			System.out.println("");
			
			int choice =scanner.nextInt();
			
			switch(choice) {
			case 1:
				bank.deposit();
				break;
			
			case 2:
				bank.withdraw();
				break;
				
			case 3:
				 flag = false;
				 System.out.println("Thanks for using our system");
				break;
			}
		}
		
	}

}
