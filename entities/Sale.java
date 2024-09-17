package entities;

public class Sale {
	// variáveis de iinstância
	private static long countSales;
	// variável lista de itens
	private double total;
	private int id;
	// variável tipo Pay com o tipo de pagamento
	
	public Sale() {
		Sale.countSales++;
	}
	
	// metodos gets
	public static long getQuantSales() {
		return Sale.countSales;
	}
	
	public double getTotal() {
		return this.total;
	}
	
	public int getId() {
		return this.id;
	}
	
	//metodos sets
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
