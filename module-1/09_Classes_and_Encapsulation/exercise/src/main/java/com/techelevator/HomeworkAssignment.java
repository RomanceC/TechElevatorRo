package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this. submitterName = submitterName;
    }
    public int getEarnedMarks(){
        return earnedMarks;
    }
    public int getPossibleMarks(){
    return possibleMarks;
    }
    public String getSubmitterName() {
        return submitterName;
    }
    public String getLetterGrade(){
    double percentScore = getEarnedMarks()* 100 / getPossibleMarks();

    if (percentScore >= 90) {
            letterGrade = "A";
        } else if (percentScore >= 80 && percentScore <= 89) {
            letterGrade = "B";
        } else if (percentScore >= 70 && percentScore <= 79) {
            letterGrade = "C";
        } else if (percentScore >= 60 && percentScore <= 69) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    //Setters
    public void SetEarnedMarks(int earnedMarks){
    this.earnedMarks = earnedMarks;
    }
}