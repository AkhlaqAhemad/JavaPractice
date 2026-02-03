class Example {

    int data = 50;

    void show() {

        int local = 20;

        System.out.println("Data member: " + data);
        System.out.println("Local variable: " + local);
    }

    public static void main(String[] args) {

        Example obj = new Example();
        obj.show();
    }
}
