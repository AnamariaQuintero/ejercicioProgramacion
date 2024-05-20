package com.mycompany.inheritance;

import com.mycompany.inheritance.people.Administrative;
import com.mycompany.inheritance.people.Person;
import com.mycompany.inheritance.people.Student;
import com.mycompany.inheritance.people.Teacher;

public class Inheritance {

    public static void main(String[] args) {
        
        Person person = new Person("192240", "Anamaria", 18);
        System.out.println("Persona: ");
        person.fingerPrintRegistry();

        Administrative admi = new Administrative("qq1", "Pedro", 35, "Divisis");
        System.out.println("Hola, lo hemos identificado como: " + admi.getName());
        System.out.println("Administrativo: ");
        admi.fingerPrintRegistry();
        
        Student student = new Student("192240", "Anamaria", 18, "Ingenieria de sistemas",3,38);
        System.out.println("El estudiantes es: " + student.getName());
        
//        Teacher teacher = new Teacher("1566a", "Julia",25,)
        
    }
}
