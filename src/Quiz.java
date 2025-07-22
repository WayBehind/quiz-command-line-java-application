import java.util.ArrayList;
import java.util.List;

public class Quiz {

    final private List<Question> questionList;
    final private List<String> allUserAnswers;

    public Quiz() {
        this.questionList = new ArrayList<>();
        this.allUserAnswers = new ArrayList<>();
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public List<String> getAllUserAnswers() {
        return allUserAnswers;
    }

    public void addUserAnswer(String scanner) {
        this.allUserAnswers.add(scanner);
    }

    public List<String> getAllCorrectAnswers() {
        List<String> allCorrectAnswers = new ArrayList<>();
        for (Question question : this.questionList) {
            for (Answer answer : question.getAnswerList()) {
                if (answer.isCorrect()) {
                    allCorrectAnswers.add(answer.getOptionChar());
                }
            }
        }
        return allCorrectAnswers;
    }

    public int getScore() {
        int i = 0;
        for (int n = 0; n < this.allUserAnswers.size(); n++) {
            if (this.allUserAnswers.get(n).equals(getAllCorrectAnswers().get(n))) {
                i++;
            }
        }
        return i;
    }
}
