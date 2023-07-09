package ATM_Interface;

public interface OperationsInterface {
	public void transHistory();
	public void debit(double debitAmount);
	public void credit(double creditAmount);
    public void transfer(int acno, double amnt);
	public void netBalance();

}
