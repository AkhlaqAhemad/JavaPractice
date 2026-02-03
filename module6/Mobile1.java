public class Mobile1 {

    String brand;
    double price;

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Mobile1 m1 = new Mobile1();
        Mobile1 m2 = new Mobile1();

        m1.brand = "Samsung";
        m1.price = 25000;

        m2.brand = "Apple";
        m2.price = 75000;

        m1.showDetails();
        m2.showDetails();
    }
}
