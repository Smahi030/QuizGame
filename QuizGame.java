import java.util.Scanner;

public class QuizGame {
    private static final String[] questions = {
            "What is the capital of France?",
            "Who wrote 'To Kill a Mockingbird'?",
            "What is the chemical symbol for water?",
            "Who painted the Mona Lisa?"
    };

    private static final String[] options = {
            "A. Paris\nB. London\nC. Berlin\nD. Rome",
            "A. Ernest Hemingway\nB. Harper Lee\nC. Mark Twain\nD. Charles Dickens",
            "A. H2O\nB. CO2\nC. NaCl\nD. O2",
            "A. Vincent van Gogh\nB. Pablo Picasso\nC. Leonardo da Vinci\nD. Michelangelo"
    };

    private static final char[] answers = {'A', 'B', 'A', 'C'};

    private static int score = 0;
    private static int questionIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (questionIndex < questions.length) {
            System.out.println(questions[questionIndex]);
            System.out.println(options[questionIndex]);
            System.out.print("Enter your choice (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));
            if (userAnswer == answers[questionIndex]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
            questionIndex++;
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}
