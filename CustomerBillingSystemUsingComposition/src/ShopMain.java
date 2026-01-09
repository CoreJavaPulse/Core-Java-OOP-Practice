
public class ShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShopInfo shopinfoobj = new ShopInfo();
		Customer customerobj = shopinfoobj.create();
		Bill billobj = shopinfoobj.calculateBill(customerobj);
		shopinfoobj.display(customerobj,billobj);
	}

}
