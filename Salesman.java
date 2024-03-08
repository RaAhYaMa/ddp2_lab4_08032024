public class Salesman extends Employee {

    private double totalSales;
    private double commissionFee;

    /**
     * Konstruktor untuk membuat objek Salesman dengan parameter tertentu.
     *
     * @param name          Nama salesman.
     * @param yearsOfWork   Tahun bekerja salesman.
     * @param baseSalary    Gaji dasar salesman.
     * @param totalSales    Total penjualan yang dicapai oleh salesman.
     * @param commissionFee Persentase komisi per penjualan.
     */
    public Salesman(String name, int yearsOfWork, double baseSalary, int totalSales, double commissionFee) {

        setName(name);
        setYearsOfWork(yearsOfWork);
        setBaseSalary(baseSalary);
        this.totalSales = totalSales;
        this.commissionFee = commissionFee;

    }
   
    /**
     * Metode untuk menghitung gaji salesman berdasarkan total penjualan dan aturan gaji karyawan.
     *
     * @return Gaji akhir setelah perhitungan.
     */
    @Override
    public double CalculateSalary() {

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

    /**
     * Metode untuk representasi string dari objek Salesman.
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

    // Getter dan setter untuk atribut Salesman

    // ...
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