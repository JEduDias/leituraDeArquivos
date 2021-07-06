package leituraDeArquivos;

public class Produto {
	String nome;
	Double preco;
	Integer quantidade;
	
	public Produto() {
	}
	
	public Produto(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double precoTotal() {
		return quantidade * preco;
	}
	
	@Override
	public String toString() {
		return nome + " " + preco + " " + quantidade;
	}
	
		
	
	

}
