package bootcamp.model;

public class Order {

    private int orderNumber;
    private String customerName;
    private String checkoutTimeStamp;
    private String returnTimeStamp;
    private String estimatedReturnDate;
    private String equipmentID;
    private String locationID;
    private double price;

    public Order(){}

    public Order(int orderNumber, String customerName, String checkoutTimeStamp,
                 String returnTimeStamp, String estimatedReturnDate, String equipmentID, String locationID, double price) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.checkoutTimeStamp = checkoutTimeStamp;
        this.returnTimeStamp = returnTimeStamp;
        this.estimatedReturnDate = estimatedReturnDate;
        this.equipmentID = equipmentID;
        this.locationID = locationID;
        this.price = price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCheckoutTimeStamp() {
        return checkoutTimeStamp;
    }

    public String getReturnTimeStamp() {
        return returnTimeStamp;
    }

    public String getEstimatedReturnDate() {
        return estimatedReturnDate;
    }

    public String getEquipment_ID() {
        return equipmentID;
    }

    public String getLocation_ID() {
        return locationID;
    }

    public double getPrice() {
        return price;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCheckoutTimeStamp(String checkoutTimeStamp) {
        this.checkoutTimeStamp = checkoutTimeStamp;
    }

    public void setReturnTimeStamp(String returnTimeStamp) {
        this.returnTimeStamp = returnTimeStamp;
    }

    public void setEstimatedReturnDate(String estimatedReturnDate) {
        this.estimatedReturnDate = estimatedReturnDate;
    }

    public void setEquipment_ID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public void setLocation_ID(String locationID) {
        this.locationID = locationID;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


