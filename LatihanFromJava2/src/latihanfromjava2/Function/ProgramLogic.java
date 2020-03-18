/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfromjava2.Function;

import latihanfromjava2.Model.ModelProgram;

/**
 *
 * @author Shadam Ramadhan
 */
public class ProgramLogic  extends ModelProgram{
    ModelProgram mp = new ModelProgram();
    public String label;
    
    public String result(String name, String born_date, String mental,
            String gender){
        
        String noun = mp.returnGenderNoun(gender);
        String mental_status = mp.returnMental(mental);
        
        return "The Name is" + name + "\nwas born at" + born_date +
                ".\n" + noun + "is currently" + mental_status;
    }
    
    public String result(String name){
        return "The Name is " + name + ".";
    }
    
    public  String result(String name, String mental){
        String mental_status = mp.returnMental(mental);
        
        return "The Name Is " + name + " \nis currently " + mental_status + ".";
    }
}
