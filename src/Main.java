//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
import Scanner;

class ShippingCalculator {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: $");

        double itemPrice = scanner.nextDouble();

        double shippingCost;

        if (itemPrice >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = itemPrice * 0.02;
        }

        double totalPrice = itemPrice + shippingCost;

        System.out.printf("Shipping cost: $%.2f%n", shippingCost);
        System.out.printf("Total price: $%.2f%n", totalPrice);

        // Close the scanner to release system resource
        scanner.close();
    }
}


