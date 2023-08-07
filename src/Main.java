import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("which month would you like to print the month to?");
        int month = scanner.nextInt();
        switch (month) {
            case 2 -> System.out.println("february have 28 or 29 days in a month, depend on leap year");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("this month have 31 days");
            case 4, 6, 9, 11 -> System.out.println("this month have 30 days");
            default -> System.out.println("Not invalid!");
        }
    }
    }
