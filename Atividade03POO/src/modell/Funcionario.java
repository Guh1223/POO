package modell;

public class Funcionario {
	private String nome;
	private double salario = 0.0;
	private String cargo;
	
	
	public Funcionario() {
		super();
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if(salario < 1412.00) {
			System.out.println("Valor invalido");
			return;
		} else {
			this.salario = salario;
		}
	}
	
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	public double getSalarioLiquido(double descontos, double beneficios) {
		if(salario == 0) {
			System.out.println("Salario liquido invalido");
			return 0;
		} else {
			salario += beneficios;
			salario -= descontos;
		
			return salario;
		}
	}
	
}
