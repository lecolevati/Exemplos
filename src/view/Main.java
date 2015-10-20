package view;

import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
//		pessoa.nome = "Leandro";
//		pessoa.idade = 33;
//		System.out.println(pessoa.nome+"\t"+pessoa.idade);
		
		pessoa.setNome("Leandro");
		pessoa.setIdade(33);
		System.out.println(pessoa.getNome()+"\t"+pessoa.getIdade());
		System.out.println(pessoa);
		
		Pessoa[] vetorPessoas = new Pessoa[3];
		pessoa = new Pessoa();
		pessoa.setNome("Teste");
		pessoa.setIdade(53);
		vetorPessoas[0] = pessoa;
		
		pessoa = new Pessoa();
		pessoa.setNome("Fulano");
		pessoa.setIdade(15);
		vetorPessoas[1] = pessoa;
		
//		System.out.println(vetorPessoas[0]);
//		System.out.println(vetorPessoas[1]);
//		System.out.println(vetorPessoas[0]);
		
		int[] vetorInt = vetorInteiros();
		for (int i = 0 ; i < 10 ; i++){
			System.out.println(vetorInt[i]);
		}
		
		for (int i : vetorInt){
			System.out.println(i);
		}
		
		for (Pessoa p : vetorPessoas){
			System.out.println(p);
		}
	}
	
	public static int[] vetorInteiros(){
		int[] vet = new int[20];
		for (int i = 0 ; i < 20 ; i++){
			vet[i] = (int)(Math.random() * 101);
		}
		return vet;
	}
	
}
