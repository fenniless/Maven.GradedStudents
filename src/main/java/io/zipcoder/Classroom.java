package io.zipcoder;

import java.util.*;

public class Classroom {
    private ArrayList<Student> students;
    private Student student;

    public Classroom(){
        this.students = new ArrayList<Student>(30);
    }
    public Classroom(int maxNumberOfStudents){
        this.students = new ArrayList<Student>(maxNumberOfStudents);
    }
    public Classroom(ArrayList<Student> students){
        this.students = students;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public Double getAverageExamScores(){
        double sum = 0;
        for (Student s:students) {
            sum+=s.getAverageExamScore();
        }
        double average = sum/students.size();
        return average;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String firstName, String lastName){
        for (Student s: students) {
            if(firstName.equals(s.name)&&lastName.equals(s.lastName)){
                students.remove(s);
            }
        }
    }
    public Student[] getStudentsByScore(){
        Collections.sort(students);
        Student[] sortedStudents = new Student[students.size()];
        sortedStudents = students.toArray(sortedStudents);
        return sortedStudents;
    }

    public Map<Student, String> getGradeBook(){
        Collections.sort(students);
        Map<Student, String> gradebook = new TreeMap<>();
        for (int i = 0; i < students.size(); i++) {
            gradebook.put(students.get(i), students.get(i).getExamScores());
        }
        return gradebook;
    }
    }

