package SilviBasith;

public class Student {
    String name;
    int id;
    String universityName;


    Student(){
        universityName = "Leading University";
    }

    Student( String name){
        this.name = name;
        System.out.println("Student's name :"+name);;
    }
    Student(String name, int id){

        this.name = name;
        this.id = id;
        System.out.println("Student's ID: " +id + "\nStudent's Name :"+name);
    }
    void display(){
        System.out.println("University Name:"+universityName );
    }



}
/*
 Name = Silvi Basith
 ID = 2012020291
 Section: F
 mail: cse_2012020291@lus.ac.bd
 Date: 01-12-2021
 */