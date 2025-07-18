
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greet();

        UserAnswers userAnswers = new UserAnswers();
        List<Character> correctAnswersFromAllQuestions = new ArrayList<>();

        SingleChoiceQuestion question1 = new SingleChoiceQuestion("Which one of these animals is a mammal?", 'b');
        correctAnswersFromAllQuestions.add(question1.getCorrectAnswer());
        question1.addAnswer("a. Owl");
        question1.addAnswer("b. Bear");
        question1.addAnswer("c. Platypus");
        question1.printQuestion();
        userAnswers.addUserAnswer(scanner);

        SingleChoiceQuestion question2 = new SingleChoiceQuestion("What is the airspeed velocity of an unladen swallow?", 'c');
        correctAnswersFromAllQuestions.add(question2.getCorrectAnswer());
        question2.addAnswer("a. Enough to carry a coconut.");
        question2.addAnswer("b. African or European swallow?");
        question2.addAnswer("c. Around 20.1 miles per hour.");
        question2.printQuestion();
        userAnswers.addUserAnswer(scanner);

        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("When crossing a road, which of your sides should you check?", 'a');
        question3.addNextCorrectAnswer('b');
        correctAnswersFromAllQuestions.addAll(question3.getAllCorrectAnswersForThisQuestions());
        question3.addAnswer("a. Right side");
        question3.addAnswer("b. Left side");
        question3.printQuestion();
        userAnswers.addUserAnswerRepeat(scanner);

        userAnswers.printUserAnswers(correctAnswersFromAllQuestions);

    }

    public static void greet() {
        System.out.println("----------------");
        System.out.println("    Welcome!    ");
        System.out.println("Time for a QUIZ!");
        System.out.println("----------------");
        System.out.println("The quiz has 3 question.");
        System.out.println("Answer with the letter of an option.");
        System.out.println("Such as: 'a', 'b' or 'c'.");
        System.out.println("----------------");
    }
}