package QUIZ_CONSOLE_APP;

public class QuestionService {
    Question[]  questions = new Question[5];

    public void displayQuestions(){
        questions[0] = new Question(1,"What","Java","Python","C","C++","Java");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
        System.out.println(questions[0]);
    }
}
