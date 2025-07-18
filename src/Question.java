import java.util.ArrayList;
import java.util.List;

public class Question {
    final protected String questionText;
    final protected Character correctAnswer;
    final protected List<String> answers;

    public Question(String questionText, Character correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>();
    }

    public void addAnswer(String option) {
        this.answers.add(option);
    }

    public Character getCorrectAnswer() {
        return correctAnswer;
    }

    public void printQuestion() {
        System.out.println(this.questionText);
        for (String answer : this.answers) {
            System.out.println(answer);
        }
    }

}
