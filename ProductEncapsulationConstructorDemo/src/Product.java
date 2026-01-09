
public class Product {
	//Instance Variables.
	private int productId;
	private String productname;
	private double productprice;
	private int productquantity;

	//default constructor
	public Product()
	{

	}
	//parametric constructor
	public Product(int productId, String productname, double productprice, int productquantity) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.productprice = productprice;
		this.productquantity = productquantity;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
}
