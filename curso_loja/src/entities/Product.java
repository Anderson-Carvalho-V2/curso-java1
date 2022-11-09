package entities;

public class Product {
	
	//Atributos----------------------------------------
	private String name;
	private double price;
	private int quantity;
	
	//Construtor Padrão-------------------------------
	public Product() {}
	
	//Construtor---------------------------------------
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Construtor2(Sobrecarga)---------------------------
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Métodos de Get e Set
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity () {
		return quantity;
	}
	
	//Métodos adicionais---------------------------------
	public double totalValueInStock(){
		return price * quantity;
	}
	
	public void addProductus(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", R$ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " unidades, total: R$ "
			+ String.format("%.2f", totalValueInStock());
	}
}
