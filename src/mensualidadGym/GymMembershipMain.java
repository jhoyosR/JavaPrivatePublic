package mensualidadGym;

import javax.swing.*;

public class GymMembershipMain {
    public static void main(String[] args) {
        GymMembership gymMembership = new GymMembership();

        gymMembership.client = JOptionPane.showInputDialog("Client's name:");
        gymMembership.plan = Integer.parseInt(JOptionPane.showInputDialog(gymMembership.client + ", choose a membership according to your needs: " + "Introduce " +
                "15) if you want a fifteen days membership. "  + "30) if you want a thirty days membership. " + "3) if you want a three months membership"));

        JOptionPane.showMessageDialog(null,  "You have chosen the " + gymMembership.plan + " membership plan and " + gymMembership.calculateMembershipPrice());
    }

}
