import java.io.*;

public class QuizApp {
    static class Question {
        String questionText;
        String[] options;
        int correctOption;

        Question(String questionText, String[] options, int correctOption) {
            this.questionText = questionText;
            this.options = options;
            this.correctOption = correctOption;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Question[] questions = new Question[3];
        questions[0] = new Question("What is the capital of France?", new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"}, 3);
        questions[1] = new Question("Which language runs in a web browser?", new String[]{"1. Java", "2. C++", "3. Python", "4. JavaScript"}, 4);
        questions[2] = new Question("Who developed Java?", new String[]{"1. Microsoft", "2. Sun Microsystems", "3. Apple", "4. Google"}, 2);

        int score = 0;

        System.out.println("Welcome to the Quiz!");
        System.out.println("You have 10 seconds to answer each question.");
        System.out.println();

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];

            System.out.println("Q" + (i + 1) + ": " + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }

            long startTime = System.currentTimeMillis();
            boolean answered = false;
            int userAnswer = -1;

            while ((System.currentTimeMillis() - startTime) / 1000 < 10) {
                if (br.ready()) {
                    userAnswer = Integer.parseInt(br.readLine());
                    answered = true;
                    break;
                }
            }

            if (!answered) {
                System.out.println("Time - up , Moving to the next question.");
            } else if (userAnswer == q.correctOption) {
                System.out.println("Your answer is Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + q.correctOption + ".");
            }

            System.out.println();
        }

        System.out.println("Quiz Over!");
        System.out.println("Your Score: " + score + "/" + questions.length);
    }
}
