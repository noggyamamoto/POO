package aula09;

public class Animal {
	private String nome;
	protected String classe; 
	
	public void imprime(){
		System.out.println(nome);
		System.out.println(classe); 
	}
	
	public void falar(){
		System.out.println("Animal está falando!");
	}

	public String getNome() {
		return nome;
	}	

	
}