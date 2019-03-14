package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassroomTest {


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
        //Assert.assertEquals(expected,output);
    }

}
