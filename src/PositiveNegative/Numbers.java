package PositiveNegative;

public class Numbers {
    public int n1;
    public String calculator(){
        if (this.n1 <= -1){
            return this.n1 + " is negative";
        } else if (this.n1 == 0){
            return this.n1 + " is neutral";
        }
        return this.n1 + " is positive";
    }
}
