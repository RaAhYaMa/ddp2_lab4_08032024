// TODO: Class Engineer adalah subclass dari Employee
public class Engineer extends Employee {
    // TODO: Lengkapi visibility modifier attribute dan methods di bawah
    private int totalProject;
    private double projectFee;

    
    // TODO: Tambahkan Constructor serta Setter dan Getter
    public Engineer(String name, int yearsOfWork, double baseSalary, int totalProject, double projectFee) {
        setName(name);
        setYearsOfWork(yearsOfWork);
        setBaseSalary(baseSalary);
        this.totalProject = totalProject;
        this.projectFee = projectFee;
    }
    
    public double CalculateSalary() {
        // TODO implementasikan method CalculateSalary yang merupakan method override dari class Employee
        double result = totalProject * projectFee;

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

    public int getTotalProject() {
        return totalProject;
    }

    public void setTotalProject(int totalProject) {
        this.totalProject = totalProject;
    }

    public double getProjectFee() {
        return projectFee;
    }

    public void setProjectFee(double projectFee) {
        this.projectFee = projectFee;
    }
}
