class product{
    private double price;
    private String name;
    public product(double price, String name){
        this.price = price;
        this.name = String name;
    }
}

class ShoppingCart{
    List<product> products = new ArrayList<>();
    public void addProduct(product p){
        products.add(p);
    }
    public List<product> getProducts(){
        return products;
    }
    public double CalculateTotal(){
        double sum = 0;
        for(product p:products){
            sum += p.price();
        }
        return sum;
    }
}

class CartInvoicePrinter{
    ShoppingCart shoppingCart;
    CartInvoicePrinter(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }
    public void printInvoice(){
        for(product p:shoppingCart.getProducts()) {
            System.out.println(p.name + " : " + p.price);
        }
    }
}

class CartDbStorage{
    public void SaveToDB(){
        System.out.println("Save to DB");
    }
}

class single_responsibility_principle {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(new product(10000,"abc"));
        sc.addProduct(new product(20000,"def"));

        CartInvoicePrinter ci = new CartInvoicePrinter(sc);
        ci.printInvoice();

        CartDbStorage cdb = new CartDbStorage();
        cdb.SaveToDB();

        System.out.println("Total Price : "+sc.CalculateTotal());

    }
}