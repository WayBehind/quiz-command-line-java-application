import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private List<Question> questionList;
    private String userAnswer;

    public Quiz() {
        this.questionList = new ArrayList<>();
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public String getUserAnswer() {
        return userAnswer; // MIGHT DELETE OR MOVE
    }

}
