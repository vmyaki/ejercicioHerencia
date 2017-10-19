package imfe;

public class Mamifero extends Animal {
	//Atributos
	private int numeroMamas;
	
	//Constructores
	public Mamifero(String nombre, int peso, int numeroMamas) {
		this.setNombre(nombre); //Hacemos setter ya que los atributos son private
		this.setPeso(peso);
		this.numeroMamas = numeroMamas;
	}
	
	public Mamifero() {
		this.setNombre("");
		this.setPeso(0);
		this.numeroMamas = 2;
	}
	
	//M�todos
	@Override
	public String toString() {
		return "Mamifero [Nombre=" + this.getNombre() + ", Peso=" + this.getPeso() + ", N� Mamas=" + this.getNumeroMamas() + "]";
	}


	public int getNumeroMamas() {
		return this.numeroMamas;
	}

	public void setNumeroMamas(int numeroMamas) {
		this.numeroMamas = numeroMamas;
	}
	
	public String comer() {
		return "Estoy comiendo como un mam�fero";
	}
	
	public String comerAnimal() {
		return super.comer();
	}
	
	

	
	
	
	
	
	
	

}
