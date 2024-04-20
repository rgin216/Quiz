package Quiz;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizCreator {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        String question = "";
        String correctChoice = "";
        ArrayList<String> choices = new ArrayList<>();

        while (true) {
            System.out.println("Type CREATE to create a question, EXECUTE to execute the quiz.");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("CREATE")) {
                while (true) {
                    System.out.println("Enter the question:");
                    question = scanner.nextLine();
                    System.out.println("Enter the correct choice:");
                    correctChoice = scanner.nextLine();
                    choices.add(correctChoice);

                    while (choices.size() < 9) {
                        System.out.println("Enter a choice or type NEXT to create a new question or FINISH to finish creating:");
                        input = scanner.nextLine();
                        if (input.equalsIgnoreCase("NEXT") || input.equalsIgnoreCase("FINISH")) {
                            break;
                        }
                        choices.add(input);
                    }

                    questions.add(new Question(question, correctChoice, choices));
                    choices.clear();

                    if (input.equalsIgnoreCase("FINISH")) {
                        break;
                    }
                }
            }
        }
    }
}

