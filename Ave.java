package aula09;

public class Ave extends Animal{
	

	public void voar(int altitude) {
		System.out.println("Esse método é destinado ao voo: " + altitude);
	}
	@Override
	public void falar() {
		System.out.println("Ave está piando");
	}
}

