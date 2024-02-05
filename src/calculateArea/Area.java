package calculateArea;

public class Area {
    public int base;
    public int height;

    public int calculateArea(){
        return this.base * this.height;
    }

    public String validateData(){
        return "The base chosen is: " + this.base + ". " + "The height chosen is: " + this.height;
        }
    }

