package model;

/**
 * Author: Remco Ketting
 * Purpose of program:
 */
public class Fruit extends Product{

    private Boolean biologisch;

    public Fruit() {;
    }
    @Override
    public String printType(){
        return "ik ben een fruit";
    }
}
