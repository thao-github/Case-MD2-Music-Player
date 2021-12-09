package minitest.Human.model;

public class Student extends Human {
    private double averageScore;

    public Student(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(String name, int age, double averageScore) {
        super(name, age);
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "averageScore=" + averageScore +
                '}';
    }
}
