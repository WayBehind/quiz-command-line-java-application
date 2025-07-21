public class Answer {
    private String optionChar;
    private String text;
    private boolean correct;

    public Answer(String optionChar, String text, boolean correct) {
        this.optionChar = optionChar;
        this.text = text;
        this.correct = correct;
    }

    public String getOptionChar() {
        return optionChar;
    }

    public boolean isCorrect() {
        return correct;
    }

}



