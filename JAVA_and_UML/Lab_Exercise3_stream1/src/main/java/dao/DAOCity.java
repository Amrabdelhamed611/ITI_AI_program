/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import countries_cities.City;
import countries_cities.CountryCity;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amrlo
 */
public class DAOCity {
   
    public static ArrayList<City> readCity(String cityPath, boolean cityHeader ) {
        ArrayList<City> cities = new ArrayList<>();
        
        try {
            Scanner sc=new Scanner(new File(cityPath));
            if(sc.hasNextLine() & cityHeader ) sc.nextLine();
            
            while( sc.hasNextLine()){
                String [] elemnts = daoutl.lineprocessor(sc.nextLine());
                cities.add( new City(elemnts[0],elemnts[1],elemnts[2],
                        daoutl.strToBoolean(elemnts[3]),daoutl.strToLong(elemnts[4]) ));        
            }
        }
        
        catch (FileNotFoundException ex) {
                Logger.getLogger(CountryCity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cities;
    } 
}
