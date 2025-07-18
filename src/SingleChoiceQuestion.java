public class SingleChoiceQuestion extends Question {
    final private String tag;

    public SingleChoiceQuestion(String questionText, Character correctAnswer) {
        super(questionText, correctAnswer);
        this.tag = "Question with single answer.";
    }

    @Override
    public void printQuestion() {
        System.out.println(super.questionText + this.tag);
        for (String answer : super.answers) {
            System.out.println(answer);
        }
    }
}
