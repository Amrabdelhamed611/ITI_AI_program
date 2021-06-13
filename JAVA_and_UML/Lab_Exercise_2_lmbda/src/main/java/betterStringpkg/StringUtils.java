/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterStringpkg;

import java.util.function.BiPredicate;

/**
 *
 * @author amrlo
 */
 class StringUtils {
     public static  String betterString(String str1, String str2,BiPredicate<String, String> func) {
         
        if (func.test(str1,str2)) 
            return str1; 
        else
            return str2;
     
     }
    public static boolean isAlpha(String str0) {
    char[] chars = str0.toCharArray();
    for (char c : chars) {
        if(!Character.isLetter(c)) {
            return false;
        }
    }
    return true;
    
        }
    public static boolean isAlpha(String str0,String str1) {
    char[] chars = str0.toCharArray();
    for (char c : chars) {
        if(!Character.isLetter(c)) {
            return false;
        }
    }
    return true;
    
        }
    
}
