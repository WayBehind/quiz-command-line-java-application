import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        greet();

        Question question1 = new Question("Which one of these animals is a mammal?", QuestionTypes.SINGEL_CHOICE);
        Answer q1a1 = new Answer("a.", "Owl", false);
        Answer q1a2 = new Answer("b.", "Bear", true);
        Answer q1a3 = new Answer("c.", "Platypus", false);
        question1.getAnswerList().addAll(List.of(q1a1, q1a2, q1a3));

        Question question2 = new Question("What is the airspeed velocity of an unladen swallow?", QuestionTypes.SINGEL_CHOICE);
        Answer q2a1 = new Answer("a.", "Enough to carry a coconut.", false);
        Answer q2a2 = new Answer("b.", "African or European swallow?", false);
        Answer q2a3 = new Answer("c.", "Around 20.1 miles per hour.", true);
        question2.getAnswerList().addAll(List.of(q2a1, q2a2, q2a3));

        Question question3 = new Question("When crossing a road, which of your sides should you check?", QuestionTypes.MULTIPLE_CHOICE);
        Answer q3a1 = new Answer("a.", "Right side", true);
        Answer q3a2 = new Answer("b.", "Left side", true);
        question3.getAnswerList().addAll(List.of(q3a1, q3a2));

        Quiz quiz = new Quiz();
        quiz.getQuestionList().addAll(List.of(question1, question2));

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