package envio;

import javax.swing.*;

public class DeliveryMain {
    public static void main(String[] args) {
        Delivery delivery = new Delivery();

        delivery.guideNumber = Integer.parseInt(JOptionPane.showInputDialog("Insert guide number"));
        delivery.setDate(Integer.parseInt(JOptionPane.showInputDialog("Insert date of delivery")));
        delivery.setPackagingType(JOptionPane.showInputDialog("Insert Packaging Type"));
        delivery.clientID = Integer.parseInt(JOptionPane.showInputDialog("Insert client ID"));
        delivery.setWeight(Integer.parseInt(JOptionPane.showInputDialog("Insert weight")));
        delivery.setProvenanceCity(JOptionPane.showInputDialog("Insert provenance city"));
        delivery.setDestinationCity(JOptionPane.showInputDialog("Insert destination city"));
        delivery.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Insert price")));
        delivery.setDeliveryStatus(JOptionPane.showInputDialog("Insert delivery status"));

        JOptionPane.showMessageDialog(null,"The price of your packaging delivery is: " + delivery.valueXkg());
        JOptionPane.showMessageDialog(null, delivery.deliveryVerification());
    }
}
