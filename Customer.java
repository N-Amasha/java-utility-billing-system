package Q4;

public class Customer {
    private int customerId;
    private String name;
    private int unitsConsumed;

    public Customer(int customerId, String name, int unitsConsumed){
        this.customerId = customerId;
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill(){
        double billAmount = 0;
        if(unitsConsumed <= 100){
            billAmount = unitsConsumed * 20;
        }else if (unitsConsumed <= 300){
            billAmount = unitsConsumed * 30;
        }else {
            billAmount = unitsConsumed * 40;
        }
        return billAmount;
    }

    public void displayCustomerDetails(){
        System.out.println("\nCustomer Details: ");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: " + calculateBill());
    }
}
