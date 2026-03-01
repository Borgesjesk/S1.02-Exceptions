package cat.itacademy.s1_02.n2.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please try again.");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please try again.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();
            try {
                if (input.length() != 1) {
                    throw new InvalidInputException(
                            "Please enter exactly one character.");
                }
                return input.charAt(0);
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();
            try {
                if (input.equals("y")) return true;
                if (input.equals("n")) return false;
                throw new InvalidInputException(
                        "Please enter 'y' or 'n'.");
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}