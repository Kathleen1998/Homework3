package com.homework.homework3;

public class GameQuestions {

    private final String questions[] = {
            "What color is the sky?",
            "What is 2 * 2 equal to?",
            "What year is it?",
            "When is Halloween",
            "Red and blue mixed together makes what color?",
            "Who sings the song Rocket Man?",
            "What is my favorite color?"
    };

    private final String options[][] = {
            {"Blue", "Red", "Orange", "Green"},
            {"1", "2", "3", "4"},
            {"2020", "2021", "2022", "1995"},
            {"October 15th", "October 1st", "October 31st", "October 30th"},
            {"Purple", "Red", "Orange", "Green"},
            {"Billy Joel", "Elton Jon", "Billy Crystal", "Billy Mayes"},
            {"Green", "Pink", "Black", "Blue"}
    };

    private final String answers7[] = {"Blue", "4", "2021", "October 31st", "Purple", "Elton Jon", "Green"};

    public String getquestion(int ques) {
        String question = questions[ques];
        return question;
    }

    public String getOptions1(int a) {
        String option1 = options[a][0];
        return option1;
    }

    public String getOptions2(int a) {
        String option2 = options[a][1];
        return option2;
    }

    public String getOptions3(int a) {
        String option3 = options[a][2];
        return option3;
    }
    public String getOptions4(int a){
        String option4 = options[a][3];
        return option4;
    }
   public String theRightAnswers (int a)
   {
       String answer = answers7[a];
       return answer;
   }
}
