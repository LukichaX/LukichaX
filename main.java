public class Main {
    public static void main(String[] args) {
        try {
            Order order1 = new Order("ORD001", "Laptop", 1, 1200.50);
            Order order2 = new Order("ORD002", "Smartphone", 2, 800.00);
            Order order3 = new Order("ORD003", "Tablet", 3, -150.00); // This will throw an exception
            System.out.println(order1);
            System.out.println(order2);
            System.out.println(order3);
        } catch (OrderException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
