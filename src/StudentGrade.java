public class StudentGrade {
    private String name;
    private String discipline;
    private double grade;

    public StudentGrade(String name, String discipline, double grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public double getGrade() {
        return grade;
    }
}
