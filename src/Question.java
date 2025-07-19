import java.util.ArrayList;
import java.util.List;

public class Question {
    private String text;
    private QuestionTypes type;
    private List<Answer> answerList;

    public Question(String text, QuestionTypes type, List<Answer> answerList) {
        this.text = text;
        this.type = type;
        this.answerList = new ArrayList<>();
    }

    public void addToAnswerList(Answer answer) {
        answerList.add(answer);
    }


}
