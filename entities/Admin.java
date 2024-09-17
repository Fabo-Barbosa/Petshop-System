package entities;

public class Admin extends User{
	// variáveis de instancia
	private int priority; // controla o poder de um administrador
	
	public Admin() {
		this.priority = 0;
	}
	
	// metodo get
	public int getPriority() {
		return this.priority;
	}
	
	// metodo set
	public void setPriority(int priority) {
		this.priority = priority;
	}

}
