public class Mobile {

    String brand;
    double price;

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        m1.brand = "Samsung";
        m1.price = 25000;

        m1.showDetails();
    }
}
