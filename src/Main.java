import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greet();

        Question question1 = new Question("What?", 'a');
        List<String> q1 = new ArrayList<>();
        q1.add("sure");
        question1.setAnswers(q1);
        question1.printQuestion();

    }

    public static void greet() {
        System.out.println("________________");
        System.out.println("    Welcome!    ");
        System.out.println("Time for a QUIZ!");
        System.out.println("________________");
        System.out.println("The quiz has 3 question.");
        System.out.println("Answer with the letter of an option.");
        System.out.println("Such as: 'a', 'b' or 'c'.");
        System.out.println("________________");
    }

    public static Character getSafeChar(Scanner scanner) {
        String s;
        do {
            System.out.print("Your answer: ");
            s = scanner.nextLine();
        } while (!Character.isAlphabetic((s.charAt(0))) || Character.isDigit(s.charAt(0)) || s.length() != 1);
        return Character.toLowerCase(s.charAt(0));
    }
}