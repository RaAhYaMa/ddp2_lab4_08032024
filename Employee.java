public class Employee {
    // TODO: Lengkapi visibility modifier attribute dan methods di bawah
    private int employeeID;
    private String name;
    private int yearsOfWork;
    private double baseSalary;
    private double finalSalary;

    public Employee() {
        
    }

    
    // TODO: Tambahkan Constructor serta Setter dan Getter
    public Employee(String name, int yearsOfWork, double baseSalary) {
        this.name = name;
        this.yearsOfWork = yearsOfWork;
        this.baseSalary = baseSalary;
    }
    
    public double CalculateSalary() {
        // TODO implementasikan method CalculateSalary
        double result = baseSalary;

        if (5 < yearsOfWork && yearsOfWork <= 10) {
            result *= 1.5;
        }

        if (yearsOfWork > 10) {
            result *= 2;
        }

        return result;
    }
    
    @Override
    public String toString() {
        // TODO: implementasikan method toString yang merupakan method override dari class Object
        return "";
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfWork() {
        return yearsOfWork;
    }

    public void setYearsOfWork(int yearsOfWork) {
        this.yearsOfWork = yearsOfWork;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }
}
