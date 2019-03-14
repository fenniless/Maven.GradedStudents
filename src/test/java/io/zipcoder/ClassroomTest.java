package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassroomTest {



        @Test
        public void getStudentsTest(){
                // : Given
                Double[] s1Scores = {100.0, 150.0};
                Double[] s2Scores = {225.0, 25.0};

                Student s1 = new Student("testStudent", "one", s1Scores);
                Student s2 = new Student("student", "two", s2Scores);


                ArrayList<Student> students = new ArrayList<Student>();
                students.add(s1);
                students.add(s2);
                Classroom classroom = new Classroom(students);
                String expected = "[Student Name: testStudent\n" +
                        "Average Score: 125.0\n" +
                        "Exam Scores: \n" +
                        "Exam 1 -> 100.0\n" +
                        "Exam 2 -> 150.0\n" +
                        ", Student Name: student\n" +
                        "Average Score: 125.0\n" +
                        "Exam Scores: \n" +
                        "Exam 1 -> 225.0\n" +
                        "Exam 2 -> 25.0\n" +
                        "]";
                // When
                System.out.println(classroom.getStudents().toString());
                Assert.assertTrue(expected.equals(classroom.getStudents().toString()));
        }
        @Test
        public void getAverageTest() {
        // : Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);


        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScores();
        double expected = 125.0;
        // Then
            System.out.println(output);
        Assert.assertTrue(expected == output);
    }

        @Test
        public void removeStudentTest() {
                Double[] s1Scores = {100.0, 150.0};
                Double[] s2Scores = {225.0, 25.0};

                Student s1 = new Student("testStudent", "one", s1Scores);
                Student s2 = new Student("student", "two", s2Scores);


                ArrayList<Student> students = new ArrayList<Student>();
                students.add(s1);
                students.add(s2);
                Classroom classroom = new Classroom(students);
                classroom.removeStudent("testStudent", "one");
                System.out.println(classroom.getStudents().size());
        }

        @Test
        public void getStudentsByScore() {
                Double[] s1Scores = {100.0, 150.0};
                Double[] s2Scores = {225.0, 125.0};
                Double[] s3Scores = {225.0, 225.0};
                Student s1 = new Student("testStudent", "one", s1Scores);
                Student s2 = new Student("student", "two", s2Scores);
                Student s3 = new Student("student3", "three", s3Scores);


                ArrayList<Student> students = new ArrayList<Student>();
                students.add(s3);
                students.add(s1);
                students.add(s2);


                Classroom classroom = new Classroom(students);
                Student[] studentsByScore = classroom.getStudentsByScore();
                System.out.println(Arrays.toString(studentsByScore));
        }

        @Test
        public void getGradeBook() {
        }
}
