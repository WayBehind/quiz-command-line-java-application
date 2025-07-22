import java.util.ArrayList;
import java.util.List;

public class Question {
    final private String text;
    final private QuestionTypes type;
    final private List<Answer> answerList;

    public Question(String text, QuestionTypes type) {
        this.text = text;
        this.type = type;
        this.answerList = new ArrayList<>();
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public QuestionTypes getType() {
        return type;
    }

    public void printQuestion() {
        System.out.println(this.text + " (" + this.type.getDescription() + ")");
        for (Answer answer : this.answerList) {
            System.out.println(answer.getOptionChar() + ". " + answer.getText());
        }

    }
}
