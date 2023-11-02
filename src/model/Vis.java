package model;

import java.time.LocalDate;

/**
 * Author: Remco Ketting
 * Purpose of program:
 */
public class Vis extends Product {
    private LocalDate houdbaarheidDatum;
    @Override
    public String printType(){
        return "ik ben een visje";
    }
}
