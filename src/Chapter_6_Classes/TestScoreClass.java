package Chapter_6_Classes;

public class TestScoreClass {
    private double testScore1, testScore2, testScore3;

    public TestScoreClass(double testScore) {
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }

    public TestScoreClass(int testScore1, int testScore2, int testScore3) {
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }


    public void setTestScore1(double testScore1) {
        this.testScore1 =testScore1;
    }

    public void setTestScore2(double testScore) {
        this.testScore2 = testScore;
    }

    public void setTestScore3(double testScore) {
        this.testScore3 = testScore;
    }

    public double getTestScore() {
        return testScore1;
    }

    public double getTestScore2() {
        return testScore2;
    }

    public double getTestScore3() {
        return testScore3;
    }

    public double averageTestScore(double testScore1,double testScore2, double testScore3){
    return (testScore1 + testScore2 + testScore3) / 3;
    }
}
