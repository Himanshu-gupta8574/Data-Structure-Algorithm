package Oops_Concept;

public class StudentClass {
    
    public static void main(String[] args) {
        // Student s1 = new Student();     // declaration
        // s1.name = "Himanshu Gupta";     // intialisation
        // s1.rno = 53;
        // s1.percentage = 84;
        // System.out.println(s1.name);

        // Student s2 = new Student();
        // s2.name = "Adarsh";
        // s2.rno = 12;                 // **contructer create karne ke baad ayese asign nhi kar sakte hm
        // s2.percentage = 89;
        //s2.number = 67;  // yha mai number attribute ko access nhi kar pa raha hu bc, of private key word
        // System.out.println(s2.getRno());
        // System.out.println(s2.setRno(90));

        //consructor
        Student s3 = new Student("rahul",12 , 98);
        Student s4 = new Student("aditya",10, 80);
        System.out.println(s3.name);
    }
}
