package onlinepurchase;


public class Orders {
    
    private int id;
    private int userId;
    private int medId;
    private String medName;
    private int qty;
    private double price;

    public Orders(int id, int userId, int medId, String medName, int qty, double price) {
        this.id = id;
        this.userId = userId;
        this.medId = medId;
        this.medName = medName;
        this.qty = qty;
        this.price = price;
    }
    
    public Orders(){}
    
    public Orders(Orders a){
        this(a.getId(),a.getUserId(),a.getMedId(),a.getMedName(),a.getQty(),a.getPrice());
    
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getMedId() {
        return medId;
    }

    public String getMedName() {
        return medName;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
    
    

    
}
