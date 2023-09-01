package org.example;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Membuat map untuk menyimpan data mahasiswa dan nilai
        Map<String, Integer> department1 = new TreeMap<>();
        department1.put("S1", 35);
        department1.put("S2", 70);
        department1.put("S3", 60);
        department1.put("S4", 90);

        Map<String, Integer> department2 = new TreeMap<>();
        department2.put("S5", 30);

        Map<String, Integer> department3 = new TreeMap<>();
        department3.put("S6", 32);
        department3.put("S7", 70);
        department3.put("S8", 20);

        // Menampilkan data
        displayDepartment("Dep 1", department1);
        displayDepartment("Dep 2", department2);
        displayDepartment("Dep 3", department3);
    }

    // Metode untuk menampilkan data departemen
    private static void displayDepartment(String departmentName, Map<String, Integer> department) {
        System.out.println(departmentName + ":");
        for (Map.Entry<String, Integer> entry : department.entrySet()) {
            String studentId = entry.getKey();
            int marks = entry.getValue();
            double passPercentage = calculatePassPercentage(marks);
            System.out.println("- Student " + studentId + ": Marks = " + marks + ", Pass Percentage = " + passPercentage + "%");
        }
        System.out.println();
    }

    // Metode untuk menghitung persentase kelulusan
    private static double calculatePassPercentage(int marks) {
        return (marks >= 40) ? 100.0 : 0.0;
    }
}
