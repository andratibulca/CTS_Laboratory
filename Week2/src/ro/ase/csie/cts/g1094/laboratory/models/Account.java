package ro.ase.csie.cts.g1094.laboratory.models;

public abstract class Account {
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount);
	public abstract void Object getBalance();
	public abstract void transfer(Account destination, Double amount);

}
