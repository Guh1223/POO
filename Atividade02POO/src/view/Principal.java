package view;

import model.ContaBancaria;

public class Principal {
	
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.numeroConta = 77412;
		conta1.nome = "Gustavo";
		conta1.saldo = 1450.70;
		double valorDeposito = 50.90;
		double valorSaque = 100.60;		
		
		double deposito = conta1.realizarDeposito(valorDeposito);
		double saque = conta1.realizarSaque(valorSaque);
		
		System.out.println("numero da conta: " + conta1.numeroConta);
		System.out.println("nome: " + conta1.nome);
		System.out.println("saldo: " + conta1.saldo);
		System.out.println("saldo com deposito: " + deposito);
		System.out.println("saldo com saque: " + saque);
		
		
	}

}
