// TODO: Class Accountant adalah subclass dari Employee
public class Accountant extends Employee {
    // TODO: Lengkapi visibility modifier attribute dan methods di bawah
    private int totalHoursWorked;
    private double hourlyRate;

    
    // TODO: Tambahkan Constructor serta Setter dan Getter
    public Accountant(String name, int yearsOfWork, double baseSalary, double hourlyRate) {
        setName(name);
        setYearsOfWork(yearsOfWork);
        setBaseSalary(baseSalary);
        this.hourlyRate = hourlyRate;
    }

    public double CalculateSalary() {
        // TODO implementasikan method CalculateSalary yang merupakan method override dari class Employee
        double result = totalHoursWorked * hourlyRate;

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

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
