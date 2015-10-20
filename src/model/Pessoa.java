package model;

public class Pessoa {

	private String nome;
	private int idade;
	
	public String getNome() {
		return nome.substring(0,2);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString(){
		return this.nome.substring(0, 2) + "\t"+ this.idade;
	}
	
}
