package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentsManager {
    private Set<Student> studentSet;

    public StudentsManager() {
        this.studentSet = new HashSet<>();
    }

    public void addStudent(String name, long code, double averageScore) {
        this.studentSet.add(new Student(name, code, averageScore));
    }

    public void removeStudent(long code) {
        Student studentToRemove = null;

        for (Student student : studentSet) {
            if (student.getCode() == code) studentToRemove = student;
            break;
        }

        if (studentToRemove == null) {
            System.out.println("Estudante não encontrado!");
        }

        studentSet.remove(studentToRemove);
    }

    public Set<Student> printStudentsByName() {
        Set<Student> studentsByName = new TreeSet<>(this.studentSet);
        return studentsByName;
    }

    public Set<Student> printStudentsByScore() {
        Set<Student> studentsByScore = new TreeSet<>(new AverageScoreComparator());
        studentsByScore.addAll(this.studentSet);
        return studentsByScore;
    }

    public void printAllStudents() {
        System.out.println(this.studentSet);
    }

    public static void main(String[] args) {
        StudentsManager studentsManager = new StudentsManager();
        studentsManager.addStudent("Felipe", 1234, 7.5);
        studentsManager.addStudent("Fabio", 1234, 9.5);
        studentsManager.addStudent("Carol", 1235, 9.5);
        studentsManager.addStudent("Isabela", 1236, 8.5);

        studentsManager.printAllStudents();
        System.out.println(studentsManager.printStudentsByName());
        System.out.println(studentsManager.printStudentsByScore());
        studentsManager.removeStudent(1237);
        studentsManager.removeStudent(1234);
        studentsManager.printAllStudents();
    }
}
