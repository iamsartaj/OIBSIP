package ATM_Interface;

public class Atm {
	private double netbalance = 15000;
	private double creditMoney;
	private double debitMoney;
	
	// Default constructor
	public Atm() {
	}

	// Getters and Setters
	public double getNetbalance() {
		return netbalance;
	}

	public void setNetbalance(double netbalance) {
		this.netbalance = netbalance;
	}

	public double getCreditMoney() {
		return creditMoney;
	}

	public void setCreditMoney(double creditMoney) {
		this.creditMoney = creditMoney;
	}

	public double getDebitMoney() {
		return debitMoney;
	}

	public void setDebitMoney(double debitMoney) {
		this.debitMoney = debitMoney;
	}	
}
