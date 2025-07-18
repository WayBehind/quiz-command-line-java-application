import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion extends SingleChoiceQuestion {
    final private List<Character> allCorrectAnswersForThisQuestions;
    final private String tag;

    public MultipleChoiceQuestion(String questionText, Character correctAnswer) {
        super(questionText, correctAnswer);
        this.allCorrectAnswersForThisQuestions = new ArrayList<>();
        this.allCorrectAnswersForThisQuestions.add(correctAnswer);
        this.tag = "Question with multiple answers.";
    }

    public List<Character> getAllCorrectAnswersForThisQuestions() {
        return allCorrectAnswersForThisQuestions;
    }

    public void addNextCorrectAnswer(Character option) {
        this.allCorrectAnswersForThisQuestions.add(option);
    }

}
