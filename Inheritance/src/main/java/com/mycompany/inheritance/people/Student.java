package com.mycompany.inheritance.people;

public class Student extends Person{
    private String carreer;
    private int semester;
    private float average;

    public Student(String ID, String name, int age,String carreer, int semester, float average) {
        super(ID, name, age);
        this.carreer = carreer;
        this.semester = semester;
        this.average = average;
    }
    
    public void seeGrandes(){
        System.out.println("Viendo la lista de notas del estudiante");
    }
    
    public void registerSubjects(){
        System.out.println("Registrar materias del estudiante");
    }
    
    public void cancelSubjects(){
        System.out.println("Cancelar materias del estudiante");
    }
    
}
