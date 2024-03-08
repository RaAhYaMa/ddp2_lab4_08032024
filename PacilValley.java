import java.util.ArrayList;
import java.util.Scanner;

public class PacilValley {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList<>();

    private static void printSeparator() {
        System.out.println("=".repeat(64));
    }

    public static void employeeList() {
        int totalEmployee = employees.size();

        if (totalEmployee == 0) {
            System.out.println("PacilValley belum memiliki karyawan :(\n");
            return;
        }

        printSeparator();
        System.out.println("PacilValley memiliki total " + totalEmployee + " karyawan:");
        // TODO: Cetak semua employee

        printSeparator();
    }

    public static void hireEmployee() {
        Employee newEmployee;

        System.out.print("Nama: ");
        String nama = in.nextLine();

        System.out.print("Pengalaman Kerja (tahun): ");
        int pengalamanKerja = Integer.parseInt(in.nextLine());

        System.out.print("Base Salary (IDR): ");
        double baseSalary = Integer.parseInt(in.nextLine());

        String role;
        while (true) {
            System.out.print("Role Employee: ");
            role = in.nextLine();

            if (role.equalsIgnoreCase("Engineer")) {
                // TODO: Meminta input dan instansiasi employee

                System.out.print("Project Fee (IDR): ");
                double projectFee = Double.parseDouble(in.nextLine());

                Employee engineer = new Engineer(nama, pengalamanKerja, baseSalary, 0, projectFee);

                engineer.setEmployeeID(employees.size() + 1);

                employees.add(engineer);

                System.out.println("\nEngineer dengan ID " + engineer.getEmployeeID() + " bernama " + engineer.getName() + " berhasil dihire!");

                break;
            } else if (role.equalsIgnoreCase("Salesman")) {
                // TODO: Meminta input dan instansiasi employee

                System.out.print("Commission Fee (%): ");
                double commissionFee = Double.parseDouble(in.nextLine());

                Employee salesman = new Salesman(nama, pengalamanKerja, baseSalary, 0, commissionFee);

                salesman.setEmployeeID(employees.size() + 1);

                employees.add(salesman);

                System.out.println("\nSalesman dengan ID " + salesman.getEmployeeID() + " bernama " + salesman.getName() + " berhasil dihire!");

                break;
            } else if (role.equalsIgnoreCase("Accountant")) {
                // TODO: Meminta input dan instansiasi employee

                System.out.print("Hourly Rate (IDR): ");
                double hourlyRate = Double.parseDouble(in.nextLine());

                Employee accountant = new Accountant(nama, pengalamanKerja, baseSalary, hourlyRate);

                accountant.setEmployeeID(employees.size() + 1);

                employees.add(accountant);

                System.out.println("\nAccountant dengan ID " + accountant.getEmployeeID() + " bernama " + accountant.getName() + " berhasil dihire!");

                break;
            } else {
                System.out.println("\nRole employee tidak valid, silahkan input kembali dengan nilai yang benar!\n");
            }
        }
        // TODO: Menambahkan employee

    }

    public static void logEmployeeSalary() {
        if (employees.isEmpty()) {
            System.out.println("PacilValley belum memiliki karyawan :(\n");
            return;
        }
        // TODO: Meminta ID dan validasi ID
        // TODO: Meminta input data dan hitung gaji berdasarkan tipe employee

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
                System.out.println("Employee dengan ID " + id + " tidak ditemukan! Silahkan masukkan ID yang sesuai.");
                continue;
            }

            break;

        }

        if (role.equals("Engineer")) {
            
        }

        if (role.equals("Salesman")) {
            
        }

        if (role.equals("Accountant")) {
            
        }

    }

    private static void printMenu() {
        System.out.println("Silakan pilih salah satu opsi berikut:");
        System.out.println("[1] Employee List");
        System.out.println("[2] Hire Employee");
        System.out.println("[3] Log Employee Salary");
        System.out.println("[4] Exit");
        System.out.println("=".repeat(64));
    }

    public static void main(String[] args) {
        System.out.println("Selamat datang di PacilValley!");
        while (true) {
            printMenu();
            System.out.print("Input: ");
            int pilihan = Integer.parseInt(in.nextLine());

            if (pilihan == 1) {
                employeeList();
            } else if (pilihan == 2) {
                hireEmployee();
            } else if (pilihan == 3) {
                logEmployeeSalary();
            } else {
                System.out.println("Terima kasih telah menggunakan layanan PacilValley ~ !");
                break;
            }
        }
    }
}