package set.ordenacao;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private long code;
    private double averageScore;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
    }
    public double getAverageScore() {
        return averageScore;
    }
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(String name, long code, double averageScore) {
        this.name = name;
        this.code = code;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", code=" + code + ", averageScore=" + averageScore + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (code ^ (code >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (code != other.code)
            return false;
        return true;
    }

    @Override
    public int compareTo(Student s) {
        return name.compareToIgnoreCase(s.getName());
    }    
}

class AverageScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAverageScore(), s2.getAverageScore());
    }
}
