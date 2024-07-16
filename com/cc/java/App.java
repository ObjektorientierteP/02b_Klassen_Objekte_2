package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung  --> Erzeugen eines Objektes
        // System.out.println(new Cat());

        // cat --> Referenzvariable
        // Cat --> Referenztyp(Klasse)
        // Cat cat = new Cat();
        // // output("Blick von aussen: " + cat);
        // // output("Blick von innen: " + cat.getInstanceVariable());

        // cat.name = "Grizabella";
        // cat.furColor =  "White";
        // cat.age = 29;

        // //1 String Ausgabe
        // output(cat.name);
        // output(cat.furColor);
        // output(Integer.toString(cat.age));

        //2 Integer Ausgabe
        // output("age = " + cat.age);
        // output(Integer.toString(cat.age));
        // System.out.println("----------------------------");
        // output(String.valueOf(cat.age));

        // Custom-Konstraktor
        Cat cat2 = new Cat("Arian Hormozfar", "Blue", 37);

        //2 String Ausgabe
        output(cat2.name);
        output(cat2.furColor);
        output(Integer.toString(cat2.age));

        cat2.furColor = "grey";
        output(cat2.furColor);

        // output("Blick von aussen: " + cat2);
        // output("Blick von innen: " + cat2.getInstanceVariable());

    }

    // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String outputStr){
        System.out.println(outputStr);
    }
   
    // public static void outputInt(int outputStr){
    //     System.out.println(outputStr);
    // }
   
}

