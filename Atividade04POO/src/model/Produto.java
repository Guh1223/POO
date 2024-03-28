package model;

public class Produto {

	private String nome;
	private float preco = 0;
	private int qtdEstoque = 0;
	
	
	public Produto() {
		super();
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		if(preco < 0.0) {
			System.out.println("Preco invalido");
			return;
		} else {
			this.preco = preco;
		}
	}
	
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setQtdEstoque(int qtdEstoque) {
		if(qtdEstoque <= 0) {
			System.out.println("Estoque invalido");
			return;
		} else {
			this.qtdEstoque = qtdEstoque;
		}
	}
	
	
	public boolean verificarProdutoDisponivel(String nome) {
		if(qtdEstoque == 0) {
			System.out.println("Estoque invalido");
			return false;
		} else {
			return true;
		}
	}
	
	
	public float totalValorEstoque() {
		if(qtdEstoque == 0) {
			System.out.println("Estoque invalido");
			return 0;
		} else {
			float valor;
		
			valor = qtdEstoque * preco;
		
			return valor;
		}
	}
	
	
}
