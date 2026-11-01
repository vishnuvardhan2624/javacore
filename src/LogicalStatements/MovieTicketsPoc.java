
package LogicalStatements;

import java.util.Scanner;

public class MovieTicketsPoc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn = "";
        double price = 0;
        double totalPrice = 0;

        System.out.println("============Available movies===================");
        System.out.println("1.SALAAR");
        System.out.println("2.PUSHPA");
        System.out.println("3.RRR");
        System.out.println("4.PARADISE");

        do {

            System.out.println("Select a Movie that You want to book tickets:");
            int movie = sc.nextInt();

            switch (movie) {

                case 1 -> {
                    System.out.println("Your selected Movie is SALAAR");
                }

                case 2 -> {
                    System.out.println("Your selected Movie is PUSHPA");
                }

                case 3 -> {
                    System.out.println("Your selected Movie is RRR");
                }

                case 4 -> {
                    System.out.println("Your selected Movie is PARADISE");
                }

                default -> {
                    System.out.println("Enter valid movie");
                }
            }

            if (movie >= 1 && movie <= 4) {

                System.out.println("========== SHOW TIMINGS ==========");
                System.out.println("1. Morning Show  - 10:00 AM");
                System.out.println("2. Matinee Show  - 1:30 PM");
                System.out.println("3. Evening Show  - 6:00 PM");
                System.out.println("4. Night Show    - 9:30 PM");

                System.out.println("Select Show Timing:");
                int time = sc.nextInt();

                switch (time) {

                    case 1 -> {
                        System.out.println("Morning Show - 10:00 AM");
                    }

                    case 2 -> {
                        System.out.println("Matinee Show - 1:30 PM");
                    }

                    case 3 -> {
                        System.out.println("Evening Show - 6:00 PM");
                    }

                    case 4 -> {
                        System.out.println("Night Show - 9:30 PM");
                    }

                    default -> {
                        System.out.println("This show timing is not available");
                    }
                }

                if (time >= 1 && time <= 4) {

                    System.out.println("========== TICKET CATEGORIES ==========");
                    System.out.println("1. Silver    - Rs.150");
                    System.out.println("2. Gold      - Rs.250");
                    System.out.println("3. Platinum  - Rs.350");
                    System.out.println("4. Recliner  - Rs.500");

                    System.out.println("Select the Ticket You want to Book:");
                    int ticket = sc.nextInt();

                    if (ticket >= 1 && ticket <= 4) {

                        System.out.println("Enter the quantity of the tickets you want:");
                        int quantity = sc.nextInt();

                        if (quantity <= 0) {

                            System.out.println("Enter valid Quantity");

                        } else {

                            switch (ticket) {

                                case 1 -> {
                                    System.out.println("Your selected ticket is Silver of Price 150/-");
                                    price = 150 * quantity;
                                }

                                case 2 -> {
                                    System.out.println("Your selected ticket is Gold of Price 250/-");
                                    price = 250 * quantity;
                                }

                                case 3 -> {
                                    System.out.println("Your selected ticket is Platinum of Price 350/-");
                                    price = 350 * quantity;
                                }

                                case 4 -> {
                                    System.out.println("Your selected ticket is Recliner of Price 500/-");
                                    price = 500 * quantity;
                                }
                            }

                            totalPrice = totalPrice + price;

                            System.out.println("Your Booking Price is: Rs." + price);
                        }

                    } else {

                        System.out.println("The selected tickets are not available");

                    }
                }

            }

            System.out.println("Do you want to Continue booking tickets for another movie?");
            System.out.println("Enter Y for Continue N for Exit");

            yn = sc.next();

        } while (yn.equalsIgnoreCase("Y"));

        System.out.println("-----------------------------------------------------");
        System.out.println("The total tickets price is: Rs." + totalPrice);
        System.out.println("-----------------------------------------------------");

        sc.close();

    }
}
