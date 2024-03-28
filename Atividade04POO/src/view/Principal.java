package view;

import model.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto prod1 = new Produto();
		
		prod1.setNome("Livro");
		prod1.setPreco(35);
		prod1.setQtdEstoque(12);
		boolean disponibilidade;
		
		System.out.println("Nome: " + prod1.getNome());
		System.out.println("Preco: " + prod1.getPreco());
		System.out.println("Quantidade em estoque: " + prod1.getQtdEstoque());
		
		
		disponibilidade = prod1.verificarProdutoDisponivel(prod1.getNome());
		
		if(disponibilidade == true) {
			System.out.println("Produto disponivel");
		} else {
			System.out.println("Produto indisponivel");
		}
		
		
		System.out.println("Preco total do estoque: " + prod1.totalValorEstoque());
		
	}
	
}
