package aula09;

public class Cachorro extends Mamífero{
	private boolean tipoLatido;
	
	public void setLateAlto() {
		
	}
	
	public void setLateBaixo() {
		
	}
	
	public void falar() {
		System.out.println("Cachorro está latindo " + (tipoLatido ? "alto" : "baixo"));
	}
}
