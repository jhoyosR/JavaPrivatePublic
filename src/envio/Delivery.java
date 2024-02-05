package envio;

public class Delivery {
    public int guideNumber;
    private int date;
    private String packagingType;
    public int clientID;
    private int weight;
    private String provenanceCity;
    private String destinationCity;
    private int price;
    private String deliveryStatus;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getProvenanceCity() {
        return provenanceCity;
    }

    public void setProvenanceCity(String provenanceCity) {
        this.provenanceCity = provenanceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public int valueXkg (){
        return this.weight * this.price;
    }

    public String deliveryVerification(){
        return "Your package is on the way, it's status is: " + this.deliveryStatus;
    }
    
}
