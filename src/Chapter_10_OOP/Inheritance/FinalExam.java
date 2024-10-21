package Chapter_10_OOP.Inheritance;

public class FinalExam extends  GradedActivity {

    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam (int numQuestions, int missed){
        double numericScores;
        this.numQuestions = numQuestions;
        this.numMissed = missed;

        pointsEach = (double) 100 / numQuestions;
        numericScores = 100 - (missed * pointsEach);

        setScore(numericScores);
    }

    public double getPointsEach(){
        return pointsEach;
    }

    public int getNumMissed(){
        return numMissed;
    }
}
