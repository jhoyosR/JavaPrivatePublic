package ParImpar;

public class OddEven {
    public int number1;
    public String calculate(){
        if (this.number1 % 2 == 0){
            return this.number1 + " is an even number";
        }
        return this.number1 + " is an odd number";
    }
}
