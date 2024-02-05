package Reclamo;

import javax.swing.*;

public class ComplaintMain {
    public static void main(String[] args) {
        Complaint complaint = new Complaint();
        complaint.complaintNumber = Integer.parseInt(JOptionPane.showInputDialog("Complaint Number:"));
        complaint.setComplainerName(JOptionPane.showInputDialog("Complainer Name:"));
        complaint.setSubject(JOptionPane.showInputDialog("Subject of your complaint"));
        complaint.complaintDescription = JOptionPane.showInputDialog("Describe your complaint");
        complaint.setComplaintStatus(JOptionPane.showInputDialog("Complaint Status:"));

        JOptionPane.showMessageDialog(null, complaint.complaintStatusValidation());
        JOptionPane.showMessageDialog(null, complaint.complaintReceived());
    }
}
