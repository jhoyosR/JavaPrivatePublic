package photocopier;

public class Photocopier {
    private int copiesAmount;

    public int getCopiesAmount() {
        return copiesAmount;
    }

    public void setCopiesAmount(int copiesAmount) {
        this.copiesAmount = copiesAmount;
    }

    public int totalCost () {
        if (this.copiesAmount <= 499) {
            return this.copiesAmount * 120;
        } else if (this.copiesAmount >= 500 && this.copiesAmount <= 749) {
            return this.copiesAmount * 100;
        } else if (this.copiesAmount >= 750 && this.copiesAmount <= 999) {
            return this.copiesAmount * 80;
        }
        return this.copiesAmount * 50;
    }

    public String costPerCopy () {
        if (this.copiesAmount <= 499) {
            return "The price per photocopy for this amount of photocopies is $120";
        } else if (this.copiesAmount >= 500 && this.copiesAmount <= 749) {
            return "The price per photocopy for this amount of photocopies is $100";
        } else if (this.copiesAmount >= 750 && this.copiesAmount <= 999) {
            return "The price per photocopy for this amount of photocopies is $80";
        }
        return "The price per photocopy for this amount of photocopies is $50";
    }
}
