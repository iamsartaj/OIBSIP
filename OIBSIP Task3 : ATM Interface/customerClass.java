/** Sartaj Ahmad
 * Java program that allows user to perform the ATM operations,
 * Deposit, withdraw, transfer, etc.
 * @author @imsirtaj
 */

package ATM_Interface;
import java.util.Scanner;

public class customerClass {

	public static void main(String[] args) {
		OperationsInterface at = new OperationsClass();
		int userid = 123456;
		int userpin = 1010;
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tWelcome to the Indian ATM");
		System.out.println();
		System.out.print("Please enter your user ID : ");
		int userId = sc.nextInt();
		System.out.print("Enter your 4 digit ATM PIN : ");
		int userPin = sc.nextInt();
		boolean flag = true;
		if (userid == userId && userpin == userPin) {
			while (flag) {
				System.out.println();
				System.out.println("_______________________________________________________");
				System.out.println(
						"1) TRANSACTIONS HISTORY \t\t2) DEPOSIT \n3) CASH WITHDRAWAL \t\t\t4) TRANSFER \n5) BALANCE INQUIRY \t\t\t6) QUIT");
				System.out.print("\t\tSelect any operation : ");
				int choice = sc.nextInt();
				if (choice == 1) {
					at.transHistory();
					at.netBalance();
				} 
				else if (choice == 2) {
					System.out.print("Enter the amount you wish to deposit : ");
					double cramnt = sc.nextDouble();
					at.credit(cramnt);
					at.netBalance();
				} 
				else if (choice == 3) {
					System.out.print("Enter the amount you wish to withdraw : ");
					double dbamnt = sc.nextDouble();
					at.debit(dbamnt);
				} 
				else if (choice == 4) {
					System.out.print("Enter an account number : ");
					int acntno = sc.nextInt();
					System.out.print("Confirm account number to proceed : ");
					int acno = sc.nextInt();
					if (acntno == acno) {
						System.out.print("Enter the amount you wish to transfer : ");
						double amnt = sc.nextDouble();
						at.transfer(acntno, amnt);
					} 
					else {
						System.out.println("--> Your account number is incorrect");
					}
				} 
				else if (choice == 5) {
					at.netBalance();
				} 
				else if (choice == 6) {
					System.out.println("--> Take your card, Thank you for choosing us");
					System.exit(0);
				} 
				else {
					System.out.println("--> Kindly enter valid choice from 1-6");
				}
			}
		} 
		else {
			System.out.println("--> Sorry, your details are mismatching");
			System.exit(0);
		}
	}

}
