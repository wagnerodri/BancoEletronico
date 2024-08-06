package entities;

public class SavingsAccount extends Account{
	//FINAL por que eu não quero que essa classe seja herdada.
	
	private double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance () {
		balance += balance * interestRate;
		
	}
	//indicar que isso e uma sobreposicao de metodo
	@Override
	public void withdraw(double amount) {
		//PUBLIC FINAL VOID . nao quero que o metodo seja sobreposto.
		balance -= amount;
	}
	
	
	

}
