public class Answer {
    final private String optionChar;
    final private String text;
    final private boolean correct;

    public Answer(String optionChar, String text, boolean correct) {
        this.optionChar = optionChar;
        this.text = text;
        this.correct = correct;
    }

    public String getOptionChar() {
        return optionChar;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return correct;
    }

}



