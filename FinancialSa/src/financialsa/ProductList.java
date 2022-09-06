package financialsa;

public class ProductList {
    public String product;
    public float price;
    public int quantity;
    public int id;
    
    public float getPrice(){
        return this.price;
    }
    
    public void setPrice(float p){
        this.price = p;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setQuantity(int q){
        this.quantity = q;
    }
    
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
