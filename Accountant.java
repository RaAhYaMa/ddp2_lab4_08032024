public class Accountant extends Employee {

    private int totalHoursWorked;
    private double hourlyRate;

    /**
     * Konstruktor untuk membuat objek Accountant dengan parameter tertentu.
     *
     * @param name         Nama akuntan.
     * @param yearsOfWork  Tahun bekerja akuntan.
     * @param baseSalary   Gaji dasar akuntan.
     * @param hourlyRate   Tarif per jam akuntan.
     */
    public Accountant(String name, int yearsOfWork, double baseSalary, double hourlyRate) {

        setName(name);
        setYearsOfWork(yearsOfWork);
        setBaseSalary(baseSalary);
        this.hourlyRate = hourlyRate;

    }

    /**
     * Metode untuk menghitung gaji akuntan berdasarkan total jam kerja dan aturan gaji karyawan.
     *
     * @return Gaji akhir setelah perhitungan.
     */
    @Override
    public double CalculateSalary() {

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
    
    /**
     * Metode untuk representasi string dari objek Accountant.
     *
     * @return String yang menyatakan gaji bulan ini.
     */
    @Override
    public String toString() {

        String out = "";
        
        out += "Gaji ";
        out += getName();
        out += " bulan ini adalah ";
        out += String.format("%.1f", getFinalSalary());
        out += " IDR!\n";

        return out;

    }

    // Getter dan setter untuk atribut Accountant

    // ...
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