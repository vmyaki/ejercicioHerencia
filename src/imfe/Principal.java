package imfe;

public class Principal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.setNombre("Bicho1");
		animal1.setPeso(2);
		System.out.println(animal1.toString());
		System.out.println(animal1.comer());
		
		
		Mamifero panda = new Mamifero();
		panda.setNombre("Pepe");
		panda.setPeso(60);
		panda.setNumeroMamas(4);
		System.out.println(panda.toString());
		System.out.println(panda.comer());
		System.out.println(panda.comerAnimal());
		
	}

}
