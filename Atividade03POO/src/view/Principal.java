package view;

import modell.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		
		func1.setNome("Gustavo");
		func1.setCargo("Atendente");
		func1.setSalario(1415.50);
		double descontos = 75.90;
		double beneficios = 43.62;
		
		System.out.println("Nome: " + func1.getNome());
		System.out.println("Cargo: " + func1.getCargo());
		System.out.println("Salario bruto: " + func1.getSalario());
		
		double salarioLiq = func1.getSalarioLiquido(descontos, beneficios);
		
		System.out.println("Salario liquido: " + salarioLiq);
	}
}
