package demoMapInterface;

import java.util.*;

public class ProductInfo {

	Scanner sc = new Scanner(System.in);

	Map<Category, List<Product>> productList =
			new TreeMap<>(Comparator.comparing(Category::getCategoryName));

	Category c1 = new Category(1, "Electronics");
	Category c2 = new Category(2, "Clothing");

	public void addProduct() {

		System.out.println("\nEnter Product Id:");
		int prodId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Product Name:");
		String prodName = sc.nextLine();
 
		System.out.println("Enter Product Price:");
		double prodPrice = sc.nextDouble();

		System.out.println("Enter Product Quantity:");
		int prodQty = sc.nextInt();

		System.out.println("Select Category (1: Electronics, 2: Clothing):");
		int choice = sc.nextInt();

		Category selectedCategory = (choice == 1) ? c1 : c2;

		Product product = new Product(prodId, prodName, prodPrice, prodQty, selectedCategory);

		productList.putIfAbsent(selectedCategory, new ArrayList<>());
		productList.get(selectedCategory).add(product);

		System.out.println("Product Added Successfully!");
	}

	public void display() {

		if (productList.isEmpty()) {
			System.out.println("No products available!");
			return;
		}

		for (Map.Entry<Category, List<Product>> entry : productList.entrySet()) {
			System.out.println("\nCategory: " + entry.getKey().getCategoryName());

			for (Product p : entry.getValue()) {
				System.out.println("  Product: " + p.getProdName() +
						" | Price: " + p.getProdPrice() +
						" | Qty: " + p.getProdQty());
			}
		}
	}

	public void searchByCategory() {

		System.out.println("Enter Category Name (Electronics/Clothing):");
		String name = sc.next();

		boolean found = false;

		for (Map.Entry<Category, List<Product>> entry : productList.entrySet()) {

			if (entry.getKey().getCategoryName().equalsIgnoreCase(name)) {

				System.out.println("\nProducts in " + name + ":");

				for (Product p : entry.getValue()) {
					System.out.println("  " + p.getProdName());
				}

				found = true;
			}
		}

		if (!found) {
			System.out.println("❌ Category not found!");
		}
	}
}