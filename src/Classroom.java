import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<StudentGrade> studentGrades;

    public Classroom(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public List<Double> getGradesForDiscipline(String discipline) {
        List<Double> grades = new ArrayList<>();
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                grades.add(studentGrade.getGrade());
            }
        }
        return grades;
    }

    public List<Double> getGradesForStudent(String student) {
        List<Double> grades = new ArrayList<>();
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getName().equals(student)) {
                grades.add(studentGrade.getGrade());
            }
        }
        return grades;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxGradeStudent = null;
        double maxGrade = 0d;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline) && studentGrade.getGrade() > maxGrade) {
                maxGrade = studentGrade.getGrade();
                maxGradeStudent = studentGrade;
            }
        }
        return maxGradeStudent;
    }

    public StudentGrade getMaxGrade() {
        StudentGrade maxGradeStudent = null;
        double maxGrade = 0d;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade() > maxGrade) {
                maxGrade = studentGrade.getGrade();
                maxGradeStudent = studentGrade;
            }
        }
        return maxGradeStudent;
    }

    public double getAverageGrade(String discipline) {
        double count = 0;
        double sum = 0;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                sum += studentGrade.getGrade();
                count++;
            }
        }
        return sum / count;
    }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade worstgradeStudent = null;
        double worstGrade = 11d;
        for (StudentGrade studentGrade :studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline) && studentGrade.getGrade() < worstGrade) {
                worstGrade = studentGrade.getGrade();
                worstgradeStudent = studentGrade;
            }
        }
        return worstgradeStudent;
    }
    public StudentGrade getWorstGrade () {
        StudentGrade worstGradeStudent = null;
        double worstGrade = 11d;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade() < worstGrade) {
                worstGrade = studentGrade.getGrade();
                worstGradeStudent = studentGrade;
            }
        }
        return worstGradeStudent;
    }
}
