package carroDefectuoso;

public class CarModel {
    private int model;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String carValidation() {
        if (this.model == 119) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 179) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 189) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 190) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 191) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 192) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 193) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 194) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 195) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 221) {
            return "Your car is defective, take to warranty department";
        } else if (this.model == 780) {
            return "Your car is defective, take to warranty department";
        }
        return "Your car is not defective";
    }
}