package entities;

public class Seller extends User{
	
	// variáveis de instância
	private long sales;
	//private Sale nowSale;

	public Seller() {
		// TODO Auto-generated constructor stub
	}
	
	//metodos get
	public long getSales() {
		return this.sales;
	}
	
	// metodo set
	public void setSales(int sales) {
		this.sales = sales;
	}

}
