package cat.itacademy.s1_02.n2.ex1;

public class Main {
    public static void main(String[] args) {

        int age = ConsoleReader.readInt("Enter your age:");
        System.out.println("Age: " + age);

        double price = ConsoleReader.readDouble("Enter a price:");
        System.out.println("Price: " + price);

        char letter = ConsoleReader.readChar("Enter a single character:");
        System.out.println("Character: " + letter);

        boolean answer = ConsoleReader.readYesNo("Do you want to continue? (y/n):");
        System.out.println("Answer: " + answer);
    }
}