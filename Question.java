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

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public String getCorrectChoice() {
        return correctChoice;
    }

    public ArrayList<String> getShuffledChoices(ArrayList<String> choices) {
        ArrayList<String> shuffledChoices = new ArrayList<>(choices);
        int index;
        String temp;
        Random random = new Random();  // Corrected typo
        for (int i = shuffledChoices.size() - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = shuffledChoices.get(index);
            shuffledChoices.set(index, shuffledChoices.get(i));
            shuffledChoices.set(i, temp);
        }
        return shuffledChoices;
    }
}
