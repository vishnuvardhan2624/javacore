
package LogicalStatements;

import java.util.Scanner;

public class ElectricityBillSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------");
        System.out.println("WELCOME TO ELECTRICITY BILL APPLICATION");
        System.out.println("--------------------------------------------------------------");

        System.out.println("THE CONNECTION TYPES ARE:");
        System.out.println("1. DOMESTIC");
        System.out.println("2. COMMERCIAL");

        System.out.println("--------------------------------------------------------------");

        int Bill = 0;

        System.out.println("Enter the connection type (1/2):");
        int connection = sc.nextInt();

        System.out.println("Enter the units of electricity consumed:");
        int units = sc.nextInt();

        if (units <= 0) {

            System.out.println("Enter valid electricity consumption");

        } else {

            switch (connection) {

                case 1 -> {

                    System.out.println("Your connection is Domestic");

                    if (units <= 100) {

                        System.out.println("Your electricity consumption is less than or equal to 100 units");
                        Bill = units * 2;

                    } else if (units <= 300) {

                        System.out.println("Your electricity consumption is between 101 and 300 units");
                        Bill = units * 3;

                    } else {

                        System.out.println("Your electricity consumption is above 300 units");
                        Bill = units * 5;

                    }

                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Your electricity Bill is: Rs." + Bill);
                    System.out.println("--------------------------------------------------------------");

                }

                case 2 -> {

                    System.out.println("Your connection is Commercial");

                    if (units <= 100) {

                        System.out.println("Your electricity consumption is less than or equal to 100 units");
                        Bill = units * 4;

                    } else if (units <= 300) {

                        System.out.println("Your electricity consumption is between 101 and 300 units");
                        Bill = units * 6;

                    } else {

                        System.out.println("Your electricity consumption is above 300 units");
                        Bill = units * 8;

                    }

                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Your electricity Bill is: Rs." + Bill);
                    System.out.println("--------------------------------------------------------------");

                }

                default -> {

                    System.out.println("Enter valid connection type");

                }

            }

        }

        sc.close();

    }

}
