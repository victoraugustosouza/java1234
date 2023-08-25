package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
	
			System.out.println("Enter account data:");
	
			System.out.print("Number: ");
			Integer number = sc.nextInt();
	
			sc.nextLine();
	
			System.out.print("Holder: ");
			String holder = sc.nextLine();
	
			System.out.print("Initial Balance: ");
			Double balance = sc.nextDouble();
	
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			Account account = new Account(number, holder, balance, limit);
			System.out.print("Enter amount for withdraw: ");
	
			Double withdrawValue = sc.nextDouble();
			sc.close();

			
				account.withdraw(withdrawValue);
		} catch (DomainException e) {
			System.out.println("DomainException");
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");

			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException");
			System.out.println(e.getMessage());
		}finally {
			System.out.print("Se chorei ou se sorri terminamos aqui");
		}


	}

}
