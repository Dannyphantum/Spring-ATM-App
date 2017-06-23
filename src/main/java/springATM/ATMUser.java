package springATM;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // This annotation instructs Hibernate to form a table out of the elements in this class.
public class ATMUser {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long IDNumber;

	@NotNull
	//@Digits(integer=4, fraction = 0)
	private int AcctNumber;
	
	private String Action;
	
	@NotNull
	private int Amount;
	
	private String Reason;
	
	private int Balance;

	public Long getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(Long iDNumber) {
		this.IDNumber = iDNumber;
	}

	public int getAcctNumber() {
		return AcctNumber;
	}

	public void setAcctNumber(int acctNumber) {
		this.AcctNumber = acctNumber;
	}

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		this.Action = action;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		this.Reason = reason;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		this.Amount = amount;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		this.Balance = balance;
	}
}
