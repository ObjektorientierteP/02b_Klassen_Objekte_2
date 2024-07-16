package com.cc.java;

public class Cat 
{

    //Eigenschaft (Properties) / Felder (attributes)
    public String name;
    public String furColor;
    
    //primitives
    public int age;
    
    double dezimal = 1.2;
    float  ganzeZahl =  1;
    boolean wahrheit = true;
    
    // Ein Konstruktur hat (keinen Rückgabetyp)
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }


    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
