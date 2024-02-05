package pagoEmpleado;

public class Employee {
    public int employeeID;
    private int baseSalary;
    public int extraHours;
    private int amountHours;
    private int discount;
    private int loanDiscount;
    private int bonus;
    private int neto;

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getAmountHours() {
        return amountHours;
    }

    public void setAmountHours(int amountHours) {
        this.amountHours = amountHours;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getLoanDiscount() {
        return loanDiscount;
    }

    public void setLoanDiscount(int loanDiscount) {
        this.loanDiscount = loanDiscount;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public int calculateExtraHoursValue(){
        return (this.extraHours * 35);
    }
    public int calculateEarn(){
        return (calculateExtraHoursValue() + getBaseSalary() + getBonus());
    }

    public int calculateDeduct(){
        return getDiscount() + getLoanDiscount();
    }

    public int calculateNeto(){
        return (calculateEarn()) - calculateDeduct();
    }

}
