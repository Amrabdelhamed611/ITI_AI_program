/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import countries_cities.Country;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author amrlo
 */
public class DAOCountry {
   
    public static Map<String, Country> readCountry(String countryPath, boolean countryHeader ) {
        Map<String, Country> countries = new HashMap<>();
        try {
            Scanner sc=new Scanner(new File(countryPath));
            if(sc.hasNextLine() & countryHeader ) sc.nextLine();
            while( sc.hasNextLine()){
                String [] elemnts = daoutl.lineprocessor(sc.nextLine());
                countries.put(elemnts[1], new Country( elemnts[0],  elemnts[1], elemnts[2]));
                                    }
            }   
        catch (FileNotFoundException ex) {
                Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
            } 
        return countries;
    }     
}
