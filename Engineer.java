public class Engineer extends Employee {

    private int totalProject;
    private double projectFee;

    /**
     * Konstruktor untuk membuat objek Engineer dengan parameter tertentu.
     *
     * @param name        Nama insinyur.
     * @param yearsOfWork Tahun bekerja insinyur.
     * @param baseSalary  Gaji dasar insinyur.
     * @param totalProject Jumlah proyek yang ditangani oleh insinyur.
     * @param projectFee  Biaya per proyek yang ditetapkan.
     */
    public Engineer(String name, int yearsOfWork, double baseSalary, int totalProject, double projectFee) {

        setName(name);
        setYearsOfWork(yearsOfWork);
        setBaseSalary(baseSalary);
        this.totalProject = totalProject;
        this.projectFee = projectFee;

    }
    
    /**
     * Metode untuk menghitung gaji insinyur berdasarkan proyek yang ditangani dan aturan gaji karyawan.
     *
     * @return Gaji akhir setelah perhitungan.
     */
    @Override
    public double CalculateSalary() {

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
    
    /**
     * Metode untuk representasi string dari objek Engineer.
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

    // Getter dan setter untuk atribut Engineer

    // ...
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