package pagoEmpleado;

import javax.swing.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeID = Integer.parseInt(JOptionPane.showInputDialog("Insert employee ID: "));
        employee.setBaseSalary(Integer.parseInt(JOptionPane.showInputDialog("Insert base salary: ")));
        employee.extraHours = Integer.parseInt(JOptionPane.showInputDialog("Insert extra hours: "));
        employee.setAmountHours(Integer.parseInt(JOptionPane.showInputDialog("Insert amount of hours: ")));
        employee.setDiscount(Integer.parseInt(JOptionPane.showInputDialog("Insert discount: ")));
        employee.setLoanDiscount(Integer.parseInt(JOptionPane.showInputDialog("Insert loan Discount ")));
        employee.setBonus(Integer.parseInt(JOptionPane.showInputDialog("Insert bonus: ")));
        JOptionPane.showMessageDialog(null, "The employee payment is: $" + employee.calculateNeto());
    }
}
