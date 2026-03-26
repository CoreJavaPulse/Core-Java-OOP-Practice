package demoMapInterface;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductInfo info = new ProductInfo();

        int choice;

        do {
            System.out.println("\n===== PRODUCT MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search by Category");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    info.addProduct();
                    break;

                case 2:
                    info.display();
                    break;

                case 3:
                    info.searchByCategory();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}