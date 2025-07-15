import java.util.HashMap;

public abstract class Question {
    private String question;
    private HashMap<Character, String> options;

    public Question(String question, HashMap<Character, String> options) {
        this.question = question;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Character, String> getOptions() {
        return options;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(HashMap<Character, String> options) {
        this.options = options;
    }

    public void askQuestion() {

    }

    public void giveOptions() {

    }

    public static String logAnswers() {

    }


}
