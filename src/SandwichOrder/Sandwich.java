package SandwichOrder;

import java.util.Objects;

public class Sandwich {
    private String sandwichSize;
    private boolean jalapeno;
    private boolean bacon;
    private boolean turkey;
    private boolean cheese;

    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public void setJalapeno(boolean jalapeno) {
        this.jalapeno = jalapeno;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isTurkey() {
        return turkey;
    }

    public void setTurkey(boolean turkey) {
        this.turkey = turkey;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public int sandwichPrice() {
        if (Objects.equals(this.sandwichSize, "Small") && this.bacon
                && this.cheese && this.turkey) {
            return 14500;
        } else if (Objects.equals(this.sandwichSize, "Small") && this.bacon
                && this.cheese) {
            return 11500;
        } else if (Objects.equals(this.sandwichSize, "Small") &&
                this.cheese && this.turkey) {
            return 11500;
        } else if (Objects.equals(this.sandwichSize, "Small") && this.bacon
                && this.turkey) {
            return 12000;
        } else if (Objects.equals(this.sandwichSize, "Small") && this.bacon) {
            return 9000;
        } else if (Objects.equals(this.sandwichSize, "Small") && this.turkey) {
            return 9000;
        } else if (Objects.equals(this.sandwichSize, "Small") && this.cheese) {
            return 8500;
        } else if (Objects.equals(this.sandwichSize, "Small")) {
            return 6000;
        } else if (Objects.equals(this.sandwichSize, "Large") && this.bacon
                && this.cheese && this.turkey) {
            return 20500;
        } else if (Objects.equals(this.sandwichSize, "Large") && this.bacon
                && this.cheese) {
            return 17500;
        } else if (Objects.equals(this.sandwichSize, "Large") &&
                this.cheese && this.turkey) {
            return 17500;
        } else if (Objects.equals(this.sandwichSize, "Large") && this.bacon
                && this.turkey) {
            return 18000;
        } else if (Objects.equals(this.sandwichSize, "Large") && this.bacon) {
            return 15000;
        } else if (Objects.equals(this.sandwichSize, "Large") && this.turkey) {
            return 15000;
        } else if (Objects.equals(this.sandwichSize, "Large") && this.cheese) {
            return 14500;
        } else {
            return 12000;
        }
    }
}
