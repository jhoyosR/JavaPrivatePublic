package numeroMayor;

public class BiggerNumber {
    public int n1;
    public int n2;
    public int n3;

    public String biggerCalculator(){
        if (this.n1 > this.n2 && this.n1 > this.n3){
            return this.n1 + " is the bigger number";
        } else if (this.n2 > this.n1 && this.n2 > this.n3){
            return this.n2 + " is the bigger number";
        }
        return this.n3 + " is the bigger number";
    }
}
