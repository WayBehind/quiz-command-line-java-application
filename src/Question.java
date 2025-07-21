import java.util.ArrayList;
import java.util.List;

public class Question {
    private String text;
    private QuestionTypes type;
    private List<Answer> answerList;

    public Question(String text, QuestionTypes type) {
        this.text = text;
        this.type = type;
        this.answerList = new ArrayList<>();
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void printQuestion() {

    }
/*
    public String getUserAnswer(String scanner) {
        return switch (); // use Enum to decide to use one char from string or more
    }*/
}
