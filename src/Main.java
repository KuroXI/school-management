import attendance.AttendanceSystem;
import attendance.AttendanceSystemAdapter;
import grading.GradingSystem;
import grading.GradingSystemAdapter;
import library.LibrarySystem;
import library.LibrarySystemAdapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        AttendanceSystemAdapter attendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        GradingSystemAdapter gradingSystemAdapter = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        LibrarySystemAdapter librarySystemAdapter = new LibrarySystemAdapter(librarySystem);

        do {
            System.out.println("\n1 - Attendance");
            System.out.println("2 - Grades");
            System.out.println("3 - Library");
            System.out.println("4 - Exit\n");

            System.out.print("Enter your choice: ");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    attendanceSystemAdapter.integrateSystem();
                    break;
                case 2:
                    gradingSystemAdapter.integrateSystem();
                    break;
                case 3:
                    librarySystemAdapter.integrateSystem();
                    break;
                case 4:
                    System.out.println("Exit - John Victor Gonzales");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (true);
    }
}