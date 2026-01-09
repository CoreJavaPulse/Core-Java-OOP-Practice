
public class ShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShopInfo shopinfoobj = new ShopInfo();
		Customer customerobj = shopinfoobj.create();
		shopinfoobj.display(customerobj);
	}

}
