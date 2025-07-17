import java.util.List;

public class Question {
    final private String questionText;
    final private Character correctAnswer;
    private List<String> answers;

    public Question(String questionText, Character correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Character getCorrectAnswer() {
        return correctAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void printQuestion() {
        System.out.println(this.questionText);
        for (String answer : this.answers) {
            System.out.println(answer);
        }
    }

}
