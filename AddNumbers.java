public class AddNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Sum = " + (a + b));
    }
}

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a >= b && a >= c)
            System.out.println(a);
        else if (b >= a && b >= c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 29;
        boolean prime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234, rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println(rev);
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}


public class Armstrong {
    public static void main(String[] args) {
        int num = 153, temp = num, sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}

public class CountDigits {
    public static void main(String[] args) {
        int num = 12345, count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println(count);
    }
}

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Add = " + (a + b));
        System.out.println("Sub = " + (a - b));
        System.out.println("Mul = " + (a * b));
        System.out.println("Div = " + (a / b));
    }
}

public class AreaCircle {
    public static void main(String[] args) {
        double radius = 7;
        double area = Math.PI * radius * radius;

        System.out.println(area);
    }
}

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}

public class ASCIIValue {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch;

        System.out.println(ascii);
    }
}

public class VowelCheck {
    public static void main(String[] args) {
        char ch = 'e';

        if ("aeiouAEIOU".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}

public class GCD {
    public static void main(String[] args) {
        int a = 24, b = 36;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}

public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int max = (a > b) ? a : b;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println(max);
                break;
            }
            max++;
        }
    }
}

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : arr)
            sum += num;

        System.out.println(sum);
    }
}

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 80, 30};
        int max = arr[0];

        for (int num : arr) {
            if (num > max)
                max = num;
        }

        System.out.println(max);
    }
}

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        int min = arr[0];

        for (int num : arr) {
            if (num < min)
                min = num;
        }

        System.out.println(min);
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int key = 30;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = Arrays.binarySearch(arr, 30);

        System.out.println(index);
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}import java.io.*;
import java.util.*;

class Student {
    private int id;
    private String name;
    private String course;
    private double marks;

    // Constructor
    public Student(int id, String name, String course, double marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String toString() {
        return id + "," + name + "," + course + "," + marks;
    }

    public static Student fromString(String data) {
        String[] parts = data.split(",");
        return new Student(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2],
                Double.parseDouble(parts[3])
        );
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

class CollegeManagementSystem {

    static final String FILE_NAME = "students.txt";

    // Add student
    public static void addStudent(Student s) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(s.toString() + "\n");
            fw.close();

            System.out.println("Student Added Successfully!");

        } catch (IOException e) {
            System.out.println("Error Writing File");
        }
    }

    // View all students
    public static void viewStudents() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            while ((line = br.readLine()) != null) {
                Student s = Student.fromString(line);
                s.display();
            }

            br.close();

        } catch (IOException e) {
            System.out.println("No Records Found!");
        }
    }

    // Search student
    public static void searchStudent(int id) {
        boolean found = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            while ((line = br.readLine()) != null) {
                Student s = Student.fromString(line);

                if (s.getId() == id) {
                    s.display();
                    found = true;
                }
            }

            br.close();

            if (!found) {
                System.out.println("Student Not Found!");
            }

        } catch (IOException e) {
            System.out.println("Error Reading File");
        }
    }

    // Delete student
    public static void deleteStudent(int id) {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        boolean found = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter fw = new FileWriter(tempFile);

            String line;

            while ((line = br.readLine()) != null) {
                Student s = Student.fromString(line);

                if (s.getId() != id) {
                    fw.write(line + "\n");
                } else {
                    found = true;
                }
            }

            br.close();
            fw.close();

            inputFile.delete();
            tempFile.renameTo(inputFile);

            if (found) {
                System.out.println("Student Deleted Successfully!");
            } else {
                System.out.println("Student Not Found!");
            }

        } catch (IOException e) {
            System.out.println("Error Processing File");
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== COLLEGE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, course, marks);

                    addStudent(s);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    searchStudent(searchId);
                    break;

                case 4:
                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}