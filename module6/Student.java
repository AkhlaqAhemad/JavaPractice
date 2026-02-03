class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.id = 101;
        s1.name = "Aman";

        s2.id = 102;
        s2.name = "Rahul";

        s3.id = 103;
        s3.name = "Neha";

        s1.display();
        s2.display();
        s3.display();
    }
}
