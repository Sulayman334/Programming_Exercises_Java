public class UTGStudent {
    String name;
    String studentId;
    double totalGradePoints;
    int subjectCount;

    public UTGStudent(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.totalGradePoints = 0;
        this.subjectCount = 0;
    }

    private double scoreToGradePoint(double score) {
        if (score >= 89 && score <= 100) return 4.3;    // A+
        else if (score >= 80 && score < 89) return 4.0;  // A
        else if (score >= 70 && score < 79) return 3.7;  // A-
        else if (score >= 66 && score < 69) return 3.3;  // B+
        else if (score >= 63 && score < 66) return 3.0;  // B
        else if (score >= 59 && score < 63) return 2.7;  // B-
        else if (score >= 56 && score < 59) return 2.3;  // C+
        else if (score >= 53 && score < 56) return 2.0;  // C
        else if (score >= 49 && score < 53) return 1.7;  // C-
        else if (score >= 39 && score < 49.5) return 1.0; // D
        else return 0.0;                                  // F
    }

    public void addScore(double score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Score must be between 0 and 100.");
            return;
        }
        totalGradePoints += scoreToGradePoint(score);
        subjectCount++;
    }



    public double computeGpa() {
        if (subjectCount == 0) {
            return 0.0;
        } else {
            return totalGradePoints / subjectCount;

        }
    }



    public void displayGpa() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + computeGpa());
    }

    public static void main(String[] args) {
        UTGStudent std1 = new UTGStudent("Alima Manneh", "22216020");
        std1.addScore(85);
        std1.addScore(90);
        std1.addScore(78);
        std1.addScore(67);
        std1.addScore(90);
        std1.addScore(98);


        std1.displayGpa();
    }
}
