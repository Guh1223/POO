package view;

import model.Pessoa;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Gustavo");
		pessoa1.setProfissao("Recepcionista");
		pessoa1.setDataNascimento(25, 07, 2000);
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Profissao: " + pessoa1.getProfissao());
		System.out.println("Data de nascimento: " + pessoa1.getDataNascimento());
		
	}
	
}
