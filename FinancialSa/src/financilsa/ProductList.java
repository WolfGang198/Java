package financilsa;

public class ProductList {
    public String product;
    public float price;
    public int quantity;
    public int id;
    
    void status(){
        System.out.println("====================");
        System.out.println("==Sout Supermarket==");
        System.out.println("====================");
        System.out.println("Product: " + this.product);
        System.out.println("Price: " + this.price + " U$");
        System.out.println("Quantity: " + this.quantity);
        System.out.println("SKU: " + this.id);
        System.out.println("====================");
    }
     
}
