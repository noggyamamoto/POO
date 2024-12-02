package aula09;

public class Vaca extends Mamífero{
	private boolean permiteOrdenha;
	
	public void ordenhar() {
		if(permiteOrdenha) {
			System.out.println("A vaca está dando leite.");
		}else 
			System.out.println("A vaca não permite ordenha.");
	}
	
	public void falar() {
		System.out.println("A vaca está mugindo");
	}
}
