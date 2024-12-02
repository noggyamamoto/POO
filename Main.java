package aula09;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Ave ave = new Ave();
		Mamífero mamífero = new Mamífero();
		BemTeVi BemTeVi = new BemTeVi();
		Papagaio papagaio = new Papagaio();
		Vaca vaca = new Vaca();
		Cachorro cachorro = new Cachorro();
		
		animal.falar();
		animal.imprime();
		animal.getNome();
		
		ave.falar();
		ave.imprime();
		ave.getNome();
		ave.voar(1000);
		
		
		
		
		
	}

}
