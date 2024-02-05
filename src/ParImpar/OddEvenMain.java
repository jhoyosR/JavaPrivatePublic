package ParImpar;

import javax.swing.*;

public class OddEvenMain {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        oddEven.number1 = Integer.parseInt(JOptionPane.showInputDialog("Insert the number you want to evaluate"));
        JOptionPane.showMessageDialog(null, oddEven.calculate());
    }
}
