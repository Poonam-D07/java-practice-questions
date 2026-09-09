class Product {
    int productId = 1001;
    String name = "Destop";
    double price = 47000.0;
    double discountAmount;

    public void discountCalculate(double discountParcentage) {
        System.out.println("Original Price   : " + price);

        discountAmount = (discountParcentage / 100) * price;
        System.out.println(" Discount Amount   : " + discountParcentage + "%  = " + discountAmount);
    }

    public void displayFinalPrice() {
        price = price - discountAmount;
        System.out.println("Final Price  : " + price);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.discountCalculate(20);
        p.displayFinalPrice();
    }
}
