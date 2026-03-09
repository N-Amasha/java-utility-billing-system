package Q4;

import java.util.Scanner;

public class CustomerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        Customer c1 = new Customer(id,name,units);
        c1.displayCustomerDetails();

        sc.close();
    }
}
