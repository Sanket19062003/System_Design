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

}

class CartDbStorage{

}

class single_responsibility_principle {
    public static void main(String[] args) {

    }
}