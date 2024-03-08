import java.util.ArrayList;
import java.util.Scanner;

public class PacilValley {

    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList<>();

    // Metode untuk mencetak garis pemisah.
    private static void printSeparator() {
        System.out.println("=".repeat(64));
    }

    // Metode untuk menentukan jabatan berdasarkan tahun pengalaman.
    public static void jabatan(int yearsOfWork) {

        if (yearsOfWork <= 5) {
            System.out.println("Jabatan: Junior");
        }

        else if (5 < yearsOfWork && yearsOfWork <= 10) {
            System.out.println("Jabatan: Senior");
        }

        else if (10 < yearsOfWork) {
            System.out.println("Jabatan: Expert");
        }

    }

    // Metode untuk mencetak informasi seorang Engineer.
    public static void printEngineer(Engineer engineer) {

        System.out.println("Nama: " + engineer.getName());
        System.out.println("Pengalaman Kerja: " + engineer.getYearsOfWork() + " tahun");
        jabatan(engineer.getYearsOfWork());
        System.out.println("Role: Engineer");
        System.out.println("Banyak Project: " + engineer.getTotalProject());
        System.out.println(String.format("Final Salary: %.1f IDR", engineer.getFinalSalary()));
        
    }

    // Metode untuk mencetak informasi seorang Salesman.
    public static void printSalesman(Salesman salesman) {

        System.out.println("Nama: " + salesman.getName());
        System.out.println("Pengalaman Kerja: " + salesman.getYearsOfWork() + " tahun");
        jabatan(salesman.getYearsOfWork());
        System.out.println("Role: Salesman");
        System.out.println(String.format("Banyak Sales: %.1f IDR", salesman.getTotalSales()));
        System.out.println(String.format("Final Salary: %.1f IDR", salesman.getFinalSalary()));

    }

    // Metode untuk mencetak informasi seorang Accountant.
    public static void printAccountant(Accountant accountant) {

        System.out.println("Nama: " + accountant.getName());
        System.out.println("Pengalaman Kerja: " + accountant.getYearsOfWork() + " tahun");
        jabatan(accountant.getYearsOfWork());
        System.out.println("Role: Accountant");
        System.out.println("Total Jam Kerja: " + accountant.getTotalHoursWorked());
        System.out.println(String.format("Final Salary: %.1f IDR", accountant.getFinalSalary()));

    }

    // Metode untuk mencetak daftar karyawan.
    public static void employeeList() {

        int totalEmployee = employees.size();

        if (totalEmployee == 0) {
            System.out.println("PacilValley belum memiliki karyawan :(\n");
            return;
        }

        printSeparator();
        System.out.println("PacilValley memiliki total " + totalEmployee + " karyawan:");
        for (int i=0 ; i < totalEmployee ; ++i) {

            Employee e = employees.get(i);

            String role = e.getClass().getSimpleName();

            if (i != 0) {
                System.out.println();
            }

            if (role.equals("Engineer")) {
                Engineer engineer = (Engineer)e;
                printEngineer(engineer);
            }

            else if (role.equals("Salesman")) {
                Salesman salesman = (Salesman)e;
                printSalesman(salesman);
            }

            else if (role.equals("Accountant")) {
                Accountant accountant = (Accountant)e;
                printAccountant(accountant);
            }

        }

        printSeparator();
        System.out.println();

    }

    // Metode untuk merekrut karyawan baru.
    public static void hireEmployee() {

        Employee newEmployee;

        System.out.print("Nama: ");
        String nama = in.nextLine();

        System.out.print("Pengalaman Kerja (tahun): ");
        int pengalamanKerja = Integer.parseInt(in.nextLine());

        System.out.print("Base Salary (IDR): ");
        double baseSalary = Integer.parseInt(in.nextLine());

        String role = "";

        while (true) {

            System.out.print("Role Employee: ");
            role = in.nextLine();

            if (role.equalsIgnoreCase("Engineer")) {

                System.out.print("Project Fee (IDR): ");
                double projectFee = Double.parseDouble(in.nextLine());

                newEmployee = new Engineer(nama, pengalamanKerja, baseSalary, 0, projectFee);

                newEmployee.setEmployeeID(employees.size() + 1);
                employees.add(newEmployee);

                System.out.println("\nEngineer dengan ID " + newEmployee.getEmployeeID() + " bernama " + newEmployee.getName() + " berhasil dihire!\n");

                break;

            } 
            
            else if (role.equalsIgnoreCase("Salesman")) {

                System.out.print("Commission Fee (%): ");
                double commissionFee = Double.parseDouble(in.nextLine());

                newEmployee = new Salesman(nama, pengalamanKerja, baseSalary, 0, commissionFee * 0.01);

                newEmployee.setEmployeeID(employees.size() + 1);
                employees.add(newEmployee);

                System.out.println("\nSalesman dengan ID " + newEmployee.getEmployeeID() + " bernama " + newEmployee.getName() + " berhasil dihire!\n");

                break;

            } 
            
            else if (role.equalsIgnoreCase("Accountant")) {

                System.out.print("Hourly Rate (IDR): ");
                double hourlyRate = Double.parseDouble(in.nextLine());

                newEmployee = new Accountant(nama, pengalamanKerja, baseSalary, hourlyRate);

                newEmployee.setEmployeeID(employees.size() + 1);
                employees.add(newEmployee);

                System.out.println("\nAccountant dengan ID " + newEmployee.getEmployeeID() + " bernama " + newEmployee.getName() + " berhasil dihire!\n");

                break;
            } 
            
            else {
                System.out.println("\nRole employee tidak valid, silahkan input kembali dengan nilai yang benar!\n");
            }

        }

    }

    // Metode untuk mencatat gaji karyawan.
    public static void logEmployeeSalary() {

        if (employees.isEmpty()) {
            System.out.println("PacilValley belum memiliki karyawan :(\n");
            return;
        }

        Employee employee = null;
        String role = "";

        while (true) {
            
            System.out.print("Masukkan employee ID: ");
            int id = Integer.parseInt(in.nextLine());
    
    
            for (Employee e : employees) {

                if (e.getEmployeeID() == id) {
                    employee = e;
                    role = e.getClass().getSimpleName();
                    System.out.println("Employee bernama " + e.getName() + " dengan role " + role + " berhasil dipilih!");
                    break;
                }
            
            }
    
            if (employee == null) {
                System.out.println("\nEmployee dengan ID " + id + " tidak ditemukan! Silahkan masukkan ID yang sesuai.\n");
                continue;
            }

            break;

        }

        if (role.equals("Engineer")) {
            Engineer engineer = (Engineer)employee;

            System.out.print("Jumlah assigned project: ");

            engineer.setTotalProject(Integer.parseInt(in.nextLine()));
            engineer.CalculateSalary();

            System.out.println(engineer.toString());
        }

        if (role.equals("Salesman")) {
            Salesman salesman = (Salesman)employee;

            System.out.print("Jumlah sales (IDR): ");

            salesman.setTotalSales(Double.parseDouble(in.nextLine()));
            salesman.CalculateSalary();

            System.out.println(salesman.toString());
        }

        if (role.equals("Accountant")) {
            Accountant accountant = (Accountant)employee;

            System.out.print("Jumlah jam bekerja: ");

            accountant.setTotalHoursWorked(Integer.parseInt(in.nextLine()));
            accountant.CalculateSalary();

            System.out.println(accountant.toString());
        }

    }

    // Metode untuk mencetak menu pilihan.
    private static void printMenu() {

        System.out.println("Silakan pilih salah satu opsi berikut:");
        System.out.println("[1] Employee List");
        System.out.println("[2] Hire Employee");
        System.out.println("[3] Log Employee Salary");
        System.out.println("[4] Exit");
        System.out.println("=".repeat(64));

    }

    // Metode utama program.
    public static void main(String[] args) {

        System.out.println("Selamat datang di PacilValley!");

        while (true) {

            printMenu();
            System.out.print("Input: ");
            int pilihan = Integer.parseInt(in.nextLine());

            if (pilihan == 1) {
                employeeList();
            } 
            
            else if (pilihan == 2) {
                hireEmployee();
            } 
            
            else if (pilihan == 3) {
                logEmployeeSalary();
            } 
            
            else {
                System.out.println("Terima kasih telah menggunakan layanan PacilValley ~ !");
                break;
            }

        }

    }

}