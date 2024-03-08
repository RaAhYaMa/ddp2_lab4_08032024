// TODO: Class Salesman adalah subclass dari Employee
public class Salesman extends Employee {
    // TODO: Lengkapi visibility modifier attribute dan methods di bawah
    private double totalSales;
    private double commissionFee;

    
    // TODO: Tambahkan Constructor serta Setter dan Getter
    public Salesman(String name, int yearsOfWork, double baseSalary, int totalSales, double commissionFee) {
        setName(name);
        setYearsOfWork(yearsOfWork);
        setBaseSalary(baseSalary);
        this.totalSales = totalSales;
        this.commissionFee = commissionFee;
    }
    
    public double CalculateSalary() {
        // TODO implementasikan method CalculateSalary yang merupakan method override dari class Employee
        double result = totalSales * commissionFee;

        if (5 < getYearsOfWork() && getYearsOfWork() <= 10) {
            result *= 1.5;
        }

        if (getYearsOfWork() > 10) {
            result *= 2;
        }

        result += super.CalculateSalary();

        setFinalSalary(result);

        return result;
    }

    @Override
    public String toString() {
        // TODO: implementasikan method toString yang merupakan method override dari class Object
        return "Gaji " + getName() + " bulan ini adalah " + getFinalSalary() + " IDR!";
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommissionFee() {
        return commissionFee;
    }

    public void setCommissionFee(double commissionFee) {
        this.commissionFee = commissionFee;
    }
}
