package Quiz;
import java.util.ArrayList;
import java.util.Random;

//Question class stores the question, choices, and correct choice
public class Question {
    String question;
    ArrayList<String> choices;
    String correctChoice;

    Question(String question, String correctChoice, ArrayList<String> choices) {
        this.question = question;
        this.correctChoice = correctChoice;
        this.choices = getShuffledChoices(choices);
    }

    public ArrayList<String> getShuffledChoices(ArrayList<String> choices) {
        return choices;
    }
}
