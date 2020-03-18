/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfromjava2.Model;

/**
 *
 * @author Shadam Ramadhan
 */
public class ModelProgram{
    
    public String label = "please put your information to get reuslt";
    
    public String returnGenderNoun(String gender){
        String noun = "He";
        
        if(gender.toLowerCase().equals("Female")){
            noun = "She";
        }
        
        return noun;
    }
    
    public String returnMental(String mental){
        switch(mental){
            case ":)":
                 return "Smilling";
            case ":) ":
                 return "Sad";
            case ":D":
                 return "Happy";
            case ":'( ":
                 return "Crying";
            default:
                  return "In love";
        }
    }
}
