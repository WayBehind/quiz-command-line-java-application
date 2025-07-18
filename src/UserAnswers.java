import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAnswers {

    final private List<Character> userAnswers;

    public UserAnswers() {
    this.userAnswers = new ArrayList<>();
    }

    public void addUserAnswer(Scanner scanner) {
        this.userAnswers.add(getSafeChar(scanner));
    }

    public Character getSafeChar(Scanner scanner) {
        String s;
        do {
            System.out.print("Your answer: ");
            s = scanner.nextLine();
        } while (!Character.isAlphabetic((s.charAt(0))) || Character.isDigit(s.charAt(0)) || s.length() != 1);
        return Character.toLowerCase(s.charAt(0));
    }

    public void addUserAnswerRepeat(Scanner scanner) {
        while (true){
            addUserAnswer(scanner);
            System.out.println("Do you want to add another answer? (y / n) : ");
            if (getSafeChar(scanner) == 'n' || getSafeChar(scanner) != 'y') {
                break;
            }
        }
    }

    public void printUserAnswers(List<Character> charList) {
        int n = 0;
        for (Character c : charList) {
            if (this.userAnswers.contains(c)) {
                n++;
            }
        }
        System.out.println("Your answers: " + this.userAnswers + " Correct answers: " + charList);
        System.out.println("You had " + n + " correct answers.");
    }
}
