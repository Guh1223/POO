package model;

public class ContaBancaria {
	
	public int numeroConta;
	public String nome;
	public double saldo;
	
	public ContaBancaria() {
		super();
	}
	
	public double realizarDeposito(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	
	public double realizarSaque(double valor) {
		saldo = saldo - valor;
		return saldo;
	}
	
}
