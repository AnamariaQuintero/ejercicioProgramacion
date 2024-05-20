package com.mycompany.inheritance.people;

public class Administrative extends Person { //Se utiliza el extends para extenderse a otra clase
    private String dependency;

    public Administrative(String ID, String name, int age, String dependency) {
        super(ID, name, age);//Para llamar al constructor de la clase person que es como la super clase 
        this.dependency = dependency;
    }
    
    public void seeData(){
        System.out.println("Mostrar datos al administrativo");
    }
    
    //Notaciones para colocar que es una sobre escritura
    
    @Override //Para decir que se esta sobre escribiendo
    public void fingerPrintRegistry(){ //Se esta sobre escribiendo el metodo que se tiene en la clase persona pero con acciones diferentes
        
        System.out.println("Administrativo registrando huella");
    }
    
} 
