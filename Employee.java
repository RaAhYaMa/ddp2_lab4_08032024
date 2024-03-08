public class Employee {
    private int employeeID;
    private String name;
    private int yearsOfWork;
    private double baseSalary;
    private double finalSalary;

    /**
     * Konstruktor default untuk objek Employee.
     */
    public Employee() {
        
    }

    /**
     * Konstruktor untuk membuat objek Employee dengan parameter tertentu.
     *
     * @param name       Nama karyawan.
     * @param yearsOfWork Tahun bekerja.
     * @param baseSalary Gaji dasar.
     */
    public Employee(String name, int yearsOfWork, double baseSalary) {

        this.name = name;
        this.yearsOfWork = yearsOfWork;
        this.baseSalary = baseSalary;

    }

    /**
     * Metode untuk menghitung gaji karyawan berdasarkan aturan tertentu.
     *
     * @return Gaji akhir setelah perhitungan.
     */
    public double CalculateSalary() {

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
        return "";
    }

    // Getter dan setter untuk atribut karyawan

    // ...
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