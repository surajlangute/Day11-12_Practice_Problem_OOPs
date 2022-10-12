package day11_12OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class StockClass {
	ArrayList<StockEntity> arrayList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		StockClass sa = new StockClass();
		System.out.println("Welcome to stock management");
		while (true) {
			System.out.println("Enter the choice !!! \n1)Enter new stock \n2)Display Stock report " + "\n3)exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 -> sa.addStocks();
			case 2 -> sa.stockReport();
			case 3 -> {
				System.out.println("exiting");
				System.exit(0);
			}
			default -> System.out.println("invalid input");
			}
		}
	}

	public void addStocks() {
		StockEntity stock = new StockEntity();
		System.out.println("Enter the stock name");
		stock.setStockNames(scanner.next());

		System.out.println("Enter the number of shares present");
		stock.setNumOfShare(scanner.nextDouble());

		System.out.println("Enter the share price");
		stock.setSharePrice(scanner.nextDouble());

		arrayList.add(stock);
	}

	public void stockReport() {
		Double sum = 0.0;
		System.out.println("Roport of Stock");
		System.out.println("stock name            Number of shares         Stock price        Total price of stock ");

		for (int i = 0; i < arrayList.size(); i++) {
			StockEntity s = arrayList.get(i);
			double totalPrice = s.getNumOfShare() * s.getSharePrice();
			totalPrice = sum + totalPrice;
			System.out.println(arrayList);

		}
	}
}
