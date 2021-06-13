/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
/**
 *
 * @author amrlo
 */
public class parser {
    public static int strToInt(String number){
        if( number.equals("")| number.equals(" "))
            return 0;
        return Integer.parseInt(number);
    }

    public static float strToFloat(String number) {
        if(number.equals("")|  number.equals(" "))
            return 0;
        
        return Float.parseFloat(number);
    }
    
}
