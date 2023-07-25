import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File students = new File("files/grades.txt");
        Scanner scanner = new Scanner(students);

        List<String> fromFile = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String liniaCurenta = scanner.nextLine();
            fromFile.add(liniaCurenta);
        }

        List<StudentGrade> studentsFromFile = transformLinesIntoFiles(fromFile);
        System.out.println();


//      Test cod
        Classroom colegiu = new Classroom(transformLinesIntoFiles(fromFile));
        System.out.println(colegiu.getGradesForDiscipline("Mathematics"));
        System.out.println(colegiu.getGradesForStudent("Marina Alimjan"));
        System.out.println(colegiu.getMaxGrade("History").getName());
        System.out.println(colegiu.getMaxGrade().getName());
        System.out.println(colegiu.getAverageGrade("Physics"));
        System.out.println(colegiu.getWorstGrade("Computer Science").getName());
        System.out.println(colegiu.getWorstGrade().getName());
    }

    public static List<StudentGrade> transformLinesIntoFiles(List<String> linesFromFile) {
        List<StudentGrade> students = new ArrayList<>();

        for (String current : linesFromFile) {
            students.add(parseLineIntoStudent(current));

        }
        return students;

    }

    public static StudentGrade parseLineIntoStudent(String line) {
        String[] parts = line.split("\\|");
        StudentGrade currentStudent = new StudentGrade(parts[0], parts[1], Integer.parseInt(parts[2]));
        return currentStudent;
    }

    public static double calculateValue(List<StudentGrade> students) {
        double sum = 0;
        for (StudentGrade curent : students) {
            sum += curent.getGrade();
        }
        return sum;
    }


}