package com.cc.java;

public class Cat 
{

    //Eigenschaft (Properties) / Felder (attributes)
    private String name;
    private String furColor;
    //primitives
    private int age;
    
    
    // Ein Konstruktur hat (keinen Rückgabetyp
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    // Getter
    public String getName() {
        if (getPermission()) {
            return name;
        } else {
            return "Sorry, no permission!";
        }
        
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean getPermission(){
        // return true;
        return false;
    }

    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
