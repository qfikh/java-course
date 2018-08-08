package gz.itcast.entity;

public class Product {

	private String id;
	private String proName;
	private String proType;
	private double price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String id, String proName, String proType, double price) {
		super();
		this.id = id;
		this.proName = proName;
		this.proType = proType;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", proName="
				+ proName + ", proType=" + proType + "]";
	}
	
}
