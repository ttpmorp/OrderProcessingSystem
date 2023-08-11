package entities;

public class OderItem {
	private Integer quantity;
	private Double price;
	
	private Product1 product;
	
	public OderItem() {
	}

	public OderItem(Integer quantity, Double price, Product1 product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product1 getProduct() {
		return product;
	}

	public void setProduct(Product1 product) {
		this.product = product;
	}
	
	public double subTotal() {
		return price * quantity;
	}
	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f ", price)
				+ "Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f ", subTotal());
	}

}