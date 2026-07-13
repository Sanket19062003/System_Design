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

}

public abstract class DBPersistence{

}

class SaveToSQLDB{

}
class SaveToMongoDB{

}

class SaveToFile{

}