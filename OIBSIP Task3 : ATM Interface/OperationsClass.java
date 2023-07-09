package ATM_Interface;
import java.util.HashMap;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OperationsClass implements OperationsInterface {
	Atm at = new Atm();
	HashMap<Double, String> map = new HashMap<Double, String>();
	LocalDateTime date = LocalDateTime.now();
	DateTimeFormatter myfrmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

	@Override
	public void transHistory() {
		for (HashMap.Entry th : map.entrySet()) {
			System.out.println("--> INR " + th.getKey() + th.getValue());
		}

	}

	@Override
	public void debit(double debitAmount) {
		if (at.getNetbalance() < debitAmount) {
			System.out.println("--> You do not have sufficient balance in account");
		} else if (debitAmount % 100 != 0) {
			System.out.println("--> Sorry! We have notes in multiples of 100");
		} else {
			String temp = date.format(myfrmt);
			map.put(debitAmount, " Debited successfully on " + temp);
			System.out.println("--> Your account has been debited for INR " + debitAmount);
			System.out.println("--> Kindle collect your cash");
			at.setNetbalance(at.getNetbalance() - debitAmount);
		}
	}

	@Override
	public void credit(double creditAmount) {
		if (creditAmount % 100 != 0) {
			System.out.println("--> Sorry! We accept notes in multiple of 100");
		} else {
			String temp = date.format(myfrmt);
			map.put(creditAmount, " Credited successfully on " + temp);
			System.out.println("--> INR " + creditAmount + " deposited successfully");
			at.setNetbalance(creditAmount + at.getNetbalance());
		}
	}

	@Override
	public void transfer(int acno, double amnt) {
		if (at.getNetbalance() < amnt) {
			System.out.println("--> You do not have sufficient balance");
			System.out.println("--> The available balance is : INR " + at.getNetbalance());
		} else {
			String temp = date.format(myfrmt);
			map.put(amnt, " Transferred to account " + acno + " successfully on \n    " + temp);
			System.out.println(
					"--> Amount INR " + amnt + " is transferred successfully to the \n    account number " + acno);
			at.setNetbalance(at.getNetbalance() - amnt);
		}
	}

	@Override
	public void netBalance() {
		System.out.println("--> Your net balance is : INR " + at.getNetbalance());

	}

}
