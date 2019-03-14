package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void studentNameTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        String expected = "Leon";
        System.out.println(student.getName());
        Assert.assertEquals(student.getName(), expected);

    }

    @Test
    public void getExamScoresTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        student.examScores.add(45.00);

        // When
        String output = student.printExamScores();
        String expected = "Exam 1 -> 100.0\n" +
                "Exam 2 -> 95.0\n" +
                "Exam 3 -> 123.0\n" +
                "Exam 4 -> 96.0\n" +
                "Exam 5 -> 45.0\n";
        // Then
        System.out.println(output);
        Assert.assertEquals(expected,output);
    }

    @Test
    public void addExamScoreTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.printExamScores();
        String expected = "Exam 1 -> 100.0\n";
        // Then
        Assert.assertEquals(expected,output);

    }
    @Test
    public void setExamScoreTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        student.setExamScore(0,150.0);
        String output = student.printExamScores();
        String expected = "Exam 1 -> 150.0\n";
        // Then
        System.out.println(output);
        Assert.assertEquals(expected,output);
    }

    @Test
    public void getAverageExamScoreTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        Double expected = 103.5;
       //System.out.println(student.getAverageExamScore());
        Assert.assertEquals(expected, student.getAverageExamScore());
    }
    @Test
    public void toStringTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        student.examScores.add(45.00);

        // When
        String output = student.toString();
        String expected = "Student Name: Leon"+
        "\nAverage Score: 91.8"+
        "\nExam Scores:"+
        "Exam 1 -> 100.0\n"+
        "Exam 2 -> 95.0\n"+
        "Exam 3 -> 123.0\n"+
        "Exam 4 -> 96.0\n"+
        "Exam 5 -> 45.0\n";
        // Then
        System.out.println(output);
        Assert.assertEquals(expected,output);
    }
}