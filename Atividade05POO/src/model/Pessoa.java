package model;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private String profissao;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(int dia, int mes, int ano) {
		LocalDate dataNascimento1 = LocalDate.of(dia, mes, ano);
		dataNascimento = dataNascimento1;
	}
	
	
	/*public getAttribute() {
		
	}
	
	public void setAttribute(attribute) {
		
	}*/
	
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	public int getIdade() {
		return 0;
	}
	
	
}
