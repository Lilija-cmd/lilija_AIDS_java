1)
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("Welcome to Programming.");
        System.out.println("My journey starts today.");
    }
}
2)
public class Main {
    public static void main(String[] args) {
        System.out.println("College: ABC Engineering College");
        System.out.println("Department: Computer Science");
        System.out.println("Course: Java Programming");
    }
}
3)
public class Main {
    public static void main(String[] args) {
        System.out.println("Java is simple Java is powerful");
    }
}
4)
public class Main {
    public static void main(String[] args) {
        System.out.println("Name : Arun\nCourse : Java\nLevel : Beginner");
    }
}
5)
public class Main {
    public static void main(String[] args) {
        String name = "Arun";
        int age = 21;
        char grade = 'A';
        boolean placementStatus = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Placement Status: " + placementStatus);
    }
}
6)
public class Main {
    public static void main(String[] args) {
        long population = 8000000L;
        double productPrice = 1499.95;
        char bloodGroup = 'A';
        boolean accountVerified = true;
        String employeeName = "Kavin";

        System.out.println("Population: " + population);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Account Verified: " + accountVerified);
        System.out.println("Employee Name: " + employeeName);
    }
}
7)
public class Main {
    public static void main(String[] args) {
        String productName = "Laptop";
        int productId = 101;
        double price = 45000.00;
        boolean available = true;

        System.out.println("PRODUCT INFORMATION");
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}
8)
mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String city = sc.nextLine();

        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        sc.close();
    }
}
9)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int rollNumber = sc.nextInt();
        sc.nextLine();
        String department = sc.nextLine();
        double percentage = sc.nextDouble();

        System.out.println("STUDENT REGISTRATION");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}
10)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String customer = sc.nextLine();
        String movie = sc.nextLine();
        int tickets = sc.nextInt();
        double ticketPrice = sc.nextDouble();

        System.out.println("BOOKING SUMMARY");
        System.out.println("Customer: " + customer);
        System.out.println("Movie: " + movie);
        System.out.println("Tickets: " + tickets);
        System.out.println("Ticket Price: " + ticketPrice);

        sc.close();
    }
}
11)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String address = sc.nextLine();
        String city = sc.nextLine();
        String pinCode = sc.nextLine();
        boolean deliveryPreference = sc.nextBoolean();

        System.out.println("DELIVERY DETAILS");
        System.out.println("Name: " + name);
        System.out.println("Street Address: " + address);
        System.out.println("City: " + city);
        System.out.println("PIN Code: " + pinCode);
        System.out.println("Delivery Preference: " + deliveryPreference);

        sc.close();
    }
}
12)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patientName = sc.nextLine();
        int patientId = sc.nextInt();
        int age = sc.nextInt();
        double temperature = sc.nextDouble();
        boolean admitted = sc.nextBoolean();

        System.out.println("PATIENT RECORD");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        System.out.println("Admitted: " + admitted);

        sc.close();
    }
}
