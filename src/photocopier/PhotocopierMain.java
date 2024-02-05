package photocopier;

import javax.swing.*;

public class PhotocopierMain {
    public static void main(String[] args) {
        Photocopier photocopier = new Photocopier();

        photocopier.setCopiesAmount(Integer.parseInt(JOptionPane.showInputDialog("Insert amount of photocopies you want to print")));
        JOptionPane.showMessageDialog(null, photocopier.costPerCopy());
        JOptionPane.showMessageDialog(null, "The total cost is: " + photocopier.totalCost());
    }
}
