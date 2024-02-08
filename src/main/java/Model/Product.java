
package Model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private Category category;
    
    public Product(){}
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }  
     public int getQty() {
        return quantity;
    }

    public void setQty(int quantity) {
        this.quantity = quantity;
    }  
    
    
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
