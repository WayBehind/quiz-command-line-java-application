public enum QuestionTypes {
    SINGEL_CHOICE("One correct answer."),
    MULTIPLE_CHOICE("Multiple correct answers.");
    private final String description;

    QuestionTypes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // TODO: Use this Enum to set weather getting user input repeats
}
