class product{
    double price;
    String name;
    product(double price,String name){
        this.price=price;
        this.name=name;
    }
}

class ShoppingCart{
    List<product> products=new ArrayList<product>();;
    public void addProduct(product p){
        products.add(p);
    }
    public List<product> getAllProducts(){
        return products;
    }
    public double getTotal(){
        double total=0;
        for(product p:products){
            total+=p.price;
        }
        return total;
    }

}

class CartInvoicePrinter{
    ShoppingCart shoppingCart;
    CartInvoicePrinter(ShoppingCart shoppingCart){
        this.shoppingCart=shoppingCart;
    }
    public void printInvoice(){
        for(product p:shoppingCart.getAllProducts()) {
            System.out.println(p.name + " " + p.price);
        }
    }
}

public abstract class DBPersistence{
    public void save();
}

class SaveToSQLDB implements DBPersistence{
    @Override
    public void save() {
        System.out.println("Save to SQLDB");
    }
}
class SaveToMongoDB implements DBPersistence{
    @java.lang.Override
    public void save() {
        System.out.println("Save to MongoDB");
    }
}

class SaveToFile implements DBPersistence{
    @java.lang.Override
    public void save() {
        System.out.println("Save to File");
    }
}

class open_close_principle{
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addProduct(new product(12000,"Abc"));
        shoppingCart.addProduct(new product(1000,"xyz"));

        CartInvoicePrinter cartPrinter=new CartInvoicePrinter(shoppingCart);
        cartPrinter.printInvoice();

        DBPersistence dbPersistence=new SaveToSQLDB();
        dbPersistence.save();

        DBPersistence dbPersistence1=new SaveToMongoDB();
        dbPersistence1.save();

        DBPersistence dbPersistence2 = new SaveToFile();
        dbPersistence2.save();

        System.out.println("Total Price : " + shoppingCart.getTotal());

    }
}