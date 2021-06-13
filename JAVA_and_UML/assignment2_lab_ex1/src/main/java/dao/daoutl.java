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
public interface daoutl {
    public static int strToInt(String number){
        if( number.equals("")| number.equals(" "))
            return 0;
        return Integer.parseInt(number);
    }
    public static long strToLong(String number){
        if( number.equals("")| number.equals(" "))
            return 0;
        return Long.parseLong(number);
    }
    public static double strToDouble(String number){
        if( number.equals("")| number.equals(" "))
            return 0;
        return Double.parseDouble(number);
    }

    public static float strToFloat(String number) {
        if(number.equals("")|  number.equals(" "))
            return 0;
        
        return Float.parseFloat(number);
    }
    public static boolean strToBoolean(String bool) {
        if(bool.equals("")|  bool.equals(" "))
            return false;
        
        return Boolean.parseBoolean(bool);
    }
    public static String [] lineprocessor(String line){
        line=line.replace(",,", ", ,");
            if(line.endsWith(",")) // for lines with no comments
                line += " ,";
        return line.split(",");
    }
}
