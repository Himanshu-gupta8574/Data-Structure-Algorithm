package Oops_Concept;

public class Student{
    String name;
    int rno;
    double percentage;
    private int number;

    public int getRno(){
        return number;
    }
    public int setRno(int x){
        return number = x;
    }

    public Student(String name, int rno, double percentage){
        this.name = name;
        this.rno = rno;
        this.percentage = percentage;
    }
}

