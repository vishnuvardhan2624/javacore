
package LogicalStatements;

import java.util.Scanner;

public class RestaurantPoc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("========== RESTAURANT MENU ==========");

		System.out.println("========== VEG ITEMS ==========");
		System.out.println("1 - Paneer Curry       - Rs.250");
		System.out.println("2 - Veg Pulao          - Rs.180");
		System.out.println("3 - Mushroom Curry     - Rs.220");
		System.out.println("4 - Veg Dum Biryani    - Rs.200");
		System.out.println("5 - Palak Paneer       - Rs.230");

		System.out.println("========== NON-VEG ITEMS ==========");
		System.out.println("1 - Chicken Biryani    - Rs.280");
		System.out.println("2 - Mutton Curry       - Rs.350");
		System.out.println("3 - Chicken Curry      - Rs.250");
		System.out.println("4 - Fish Curry         - Rs.300");
		System.out.println("5 - Egg Pulao          - Rs.180");

		System.out.println("========== STARTERS ==========");
		System.out.println("1 - Paneer 65           - Rs.180");
		System.out.println("2 - Chicken 65          - Rs.220");
		System.out.println("3 - Chilli Chicken      - Rs.240");
		System.out.println("4 - Pepper Chicken      - Rs.250");
		System.out.println("5 - Fish Fry            - Rs.200");
		System.out.println("6 - Chicken Pakoda      - Rs.180");

		System.out.println("========== COOL DRINKS ==========");
		System.out.println("1 - Coca-Cola           - Rs.40");
		System.out.println("2 - Pepsi               - Rs.40");
		System.out.println("3 - Sprite              - Rs.40");
		System.out.println("4 - Thums Up            - Rs.40");
		System.out.println("5 - Maaza               - Rs.35");

		System.out.println("====================================");

		double total_price = 0;
		String yn;

		do {
			System.out.println("Select an Option: Veg / Non-veg / starters / cooldrinks");

			String option = sc.next();

			switch (option.toLowerCase()) {

			case "veg" -> {
				double veg_total_price = 0;
				String vyn;

				do {
					System.out.println("Enter veg item number (1-5):");
					int veg_item = sc.nextInt();

					if (veg_item < 1 || veg_item > 5) {
						System.out.println("This item is not available");
					} else {
						System.out.println("Enter quantity:");
						int quantity = sc.nextInt();

						if (quantity <= 0) {
							System.out.println("Quantity must be greater than zero");
						} else {
							
							
							
							switch (veg_item) {
							case 1 -> {
								System.out.println("Paneer Curry - Rs.250");
								veg_total_price += 250 * quantity;
							}
							case 2 -> {
								System.out.println("Veg Pulao - Rs.180");
								veg_total_price += 180 * quantity;
							}
							case 3 -> {
								System.out.println("Mushroom Curry - Rs.220");
								veg_total_price += 220 * quantity;
							}
							case 4 -> {
								System.out.println("Veg Dum Biryani - Rs.200");
								veg_total_price += 200 * quantity;
							}
							case 5 -> {
								System.out.println("Palak Paneer - Rs.230");
								veg_total_price += 230 * quantity;
							}
							}
							System.out.println("Item quantity: " + quantity);
						}
					}

					System.out.println("Continue with more veg items? Enter Y or N:");
					vyn = sc.next();

				} while (vyn.equalsIgnoreCase("y"));

				System.out.println("Veg Total Price: Rs." + veg_total_price);
				total_price += veg_total_price;
			}

			case "non-veg" -> {
				double non_veg_total_price = 0;
				String nvyn;

				do {
					System.out.println("Enter non-veg item number (1-5):");
					int item = sc.nextInt();

					if (item < 1 || item > 5) {
						System.out.println("This item is not available");
					} else {
						System.out.println("Enter quantity:");
						int quantity = sc.nextInt();

						if (quantity <= 0) {
							System.out.println("Quantity must be greater than zero");
						} else {
							switch (item) {
							case 1 -> {
								System.out.println("Chicken Biryani - Rs.280");
								non_veg_total_price += 280 * quantity;
							}
							case 2 -> {
								System.out.println("Mutton Curry - Rs.350");
								non_veg_total_price += 350 * quantity;
							}
							case 3 -> {
								System.out.println("Chicken Curry - Rs.250");
								non_veg_total_price += 250 * quantity;
							}
							case 4 -> {
								System.out.println("Fish Curry - Rs.300");
								non_veg_total_price += 300 * quantity;
							}
							case 5 -> {
								System.out.println("Egg Pulao - Rs.180");
								non_veg_total_price += 180 * quantity;
							}
							}
							System.out.println("Item quantity: " + quantity);
						}
					}

					System.out.println("Continue with more non-veg items? Enter Y or N:");
					nvyn = sc.next();

				} while (nvyn.equalsIgnoreCase("y"));

				System.out.println("Non-Veg Total Price: Rs." + non_veg_total_price);
				total_price += non_veg_total_price;
			}

			case "starters" -> {
				double starter_total_price = 0;
				String syn;

				do {
					System.out.println("Enter starter item number (1-6):");
					int item = sc.nextInt();

					if (item < 1 || item > 6) {
						System.out.println("This item is not available");
					} else {
						System.out.println("Enter quantity:");
						int quantity = sc.nextInt();

						if (quantity <= 0) {
							System.out.println("Quantity must be greater than zero");
						} else {
							switch (item) {
							case 1 -> {
								System.out.println("Paneer 65 - Rs.180");
								starter_total_price += 180 * quantity;
							}
							case 2 -> {
								System.out.println("Chicken 65 - Rs.220");
								starter_total_price += 220 * quantity;
							}
							case 3 -> {
								System.out.println("Chilli Chicken - Rs.240");
								starter_total_price += 240 * quantity;
							}
							case 4 -> {
								System.out.println("Pepper Chicken - Rs.250");
								starter_total_price += 250 * quantity;
							}
							case 5 -> {
								System.out.println("Fish Fry - Rs.200");
								starter_total_price += 200 * quantity;
							}
							case 6 -> {
								System.out.println("Chicken Pakoda - Rs.180");
								starter_total_price += 180 * quantity;
							}
							}
							System.out.println("Item quantity: " + quantity);
						}
					}

					System.out.println("Continue with more starters? Enter Y or N:");
					syn = sc.next();

				} while (syn.equalsIgnoreCase("y"));

				System.out.println("Starters Total Price: Rs." + starter_total_price);
				total_price += starter_total_price;
			}

			case "cooldrinks" -> {
				double drinks_total_price = 0;
				String cyn;

				do {
					System.out.println("Enter cool drink item number (1-5):");
					int item = sc.nextInt();

					if (item < 1 || item > 5) {
						System.out.println("This item is not available");
					} else {
						System.out.println("Enter quantity:");
						int quantity = sc.nextInt();

						if (quantity <= 0) {
							System.out.println("Quantity must be greater than zero");
						} else {
							switch (item) {
							case 1 -> {
								System.out.println("Coca-Cola - Rs.40");
								drinks_total_price += 40 * quantity;
							}
							case 2 -> {
								System.out.println("Pepsi - Rs.40");
								drinks_total_price += 40 * quantity;
							}
							case 3 -> {
								System.out.println("Sprite - Rs.40");
								drinks_total_price += 40 * quantity;
							}
							case 4 -> {
								System.out.println("Thums Up - Rs.40");
								drinks_total_price += 40 * quantity;
							}
							case 5 -> {
								System.out.println("Maaza - Rs.35");
								drinks_total_price += 35 * quantity;
							}
							}
							System.out.println("Item quantity: " + quantity);
						}
					}

					System.out.println("Continue with more cool drinks? Enter Y or N:");
					cyn = sc.next();

				} while (cyn.equalsIgnoreCase("y"));

				System.out.println("Cool Drinks Total Price: Rs." + drinks_total_price);
				total_price += drinks_total_price;
			}

			default -> System.out.println("Invalid category! Enter Veg, Non-veg, starters, or cooldrinks.");
			}

			System.out.println("Do you want to order from another category? Enter Y or N:");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("========== FINAL BILL ==========");
		System.out.println("Total Price: Rs." + total_price);
		System.out.println("Thank you for visiting our restaurant!");

		sc.close();
	}
}

	

    
      
 
	

