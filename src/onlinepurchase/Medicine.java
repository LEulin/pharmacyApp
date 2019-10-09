package onlinepurchase;

public class Medicine {
    private int ID;
    private String brandname;
    private String genericname;
    private String type;
    private double price;
    private int quantity;

    public Medicine() {
    }
    
    public Medicine(Medicine e){
        this(e.getID(),e.getBrandname(),e.getGenericname(),e.getType(),e.getPrice(),e.getQuantity());
    
    }

    public Medicine(int ID, String brandname, String genericname, String type, double price, int quantity) {
        this.ID = ID;
        this.brandname = brandname;
        this.genericname = genericname;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public Medicine(int ID, String brandname, String genericname, double price, int quantity) {
        this.ID = ID;
        this.brandname = brandname;
        this.genericname = genericname;
        this.price = price;
        this.quantity = quantity;
    }

    public Medicine(String brandname, String genericname, String type, double price, int quantity) {
        this.brandname = brandname;
        this.genericname = genericname;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }
    

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public void setGenericname(String genericname) {
        this.genericname = genericname;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getID() {
        return ID;
    }

    public String getBrandname() {
        return brandname;
    }

    public String getGenericname() {
        return genericname;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public String toString() {
        return String.format("ID: %d \nBrandname name: %s \nGenericname Name: %s\nMedicine Type: %s\nPrice: %.2f\nQuantity: %d",ID, brandname,genericname,type,price,quantity);
    }
    
    
}
