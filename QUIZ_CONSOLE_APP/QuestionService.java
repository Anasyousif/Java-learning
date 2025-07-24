package QUIZ_CONSOLE_APP;

public class QuestionService {
    Question[]  questions = new Question[5];

    public void displayQuestions(){
        questions[0] = new Question();
        System.out.println(questions[0]);
    }
}
