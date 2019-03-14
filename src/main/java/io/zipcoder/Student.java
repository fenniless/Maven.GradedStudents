package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable{

    String name;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String name, String lastName, Double[] examScores){
        this.name = name;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    public String getExamScores(){
        return examScores.toString();
    }

    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public String printExamScores() {
        String printScore="";
        for (int i = 0 ; i < examScores.size(); i++) {
            printScore = printScore + "Exam "+(i+1)+" -> "+examScores.get(i).toString()+"\n" ;
        }
        return printScore;

//        String scores = examScores.toString();
//        return scores;
    }

    public void addExamScore(Double examScore){
        this.examScores.add(examScore);
    }

    public void setExamScore(int i , double v) {
        this.examScores.set(i,v);
    }
    public Double getAverageExamScore(){
        double sum = 0;
        for (Double d:examScores) {
            sum+=d;
        }
        double average = sum/examScores.size();
        return average;
    }

    @Override
    public String toString(){
        String print = "Student Name: "+this.getName()+"\nAverage Score: "+this.getAverageExamScore()
                +"\nExam Scores: \n"+this.printExamScores();
        return print;
    }

    @Override
    public int compareTo(Object student) {
        Double compareGrade=((Student)student).getAverageExamScore();

        return (int) Math.round(compareGrade);

    }
}
