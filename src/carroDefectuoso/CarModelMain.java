package carroDefectuoso;

import javax.swing.*;

public class CarModelMain {
    public static void main(String[] args) {
        CarModel carModel = new CarModel();
        carModel.setModel(Integer.parseInt(JOptionPane.showInputDialog("Introduce your car model to validate its defectiveness")));
        JOptionPane.showMessageDialog(null, carModel.carValidation());
    }
}
