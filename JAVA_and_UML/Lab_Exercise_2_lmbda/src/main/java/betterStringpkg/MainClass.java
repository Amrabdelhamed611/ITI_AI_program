/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterStringpkg;
import java.util.stream.*;

/**
 *
 * @author amrlo
 */
public class MainClass {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String st0 = "AmR";
        String st1 ="AmR61";
        String st2 ="A61";
        System.out.println(StringUtils.betterString(st0,st1 ,(s0,s1) -> true ));
        System.out.println(StringUtils.betterString(st2,st1 ,(s0,s1) -> s0.length() > s1.length() ));
        
        System.out.println(StringUtils.betterString(st0,st1 ,(s0,s1) -> StringUtils.isAlpha(s0,s1)  ));
        System.out.println(StringUtils.betterString(st2,st1 ,(s0,s1) -> StringUtils.isAlpha(s0,s1) ));

        System.out.println(StringUtils.betterString(st2,st1 , StringUtils::isAlpha ));
        
    }
     
}
