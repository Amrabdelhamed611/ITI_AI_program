/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import countries_cities.City;
import countries_cities.Country;
import countries_cities.CountryCity;
import dao.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author amrlo
 */
public class MainClass {
    public static void main(String[] args) {
      
   
       
        Map<String, Country> countries = DAOCountry.readCountry("countries.csv",true);
        ArrayList<City> cities =  DAOCity.readCity("cities.csv",true);
        Map<String,ArrayList<CountryCity>> countriesCities = new HashMap<>();
        
        
        cities.forEach( city -> 
            { 
                String compid = city.getCountryId();
                if (!countriesCities.containsKey(compid)) {
                    ArrayList<CountryCity> listc = new ArrayList<CountryCity>();
                    listc.add(new CountryCity(city.getCountryId()+city.getCityId(),
                                            city.getCityName(),
                                            countries.get(city.getCountryId()).getCountryName(),
                                            countries.get(city.getCountryId()).getContinent(),
                                            city.getIsCapital(),
                                            city.getCityPopulation()));

                    countriesCities.put(compid, listc);
                } 
                else {
                countriesCities.get(compid).add(new CountryCity(city.getCountryId()+city.getCityId(),
                                        city.getCityName(),
                                        countries.get(city.getCountryId()).getCountryName(),
                                        countries.get(city.getCountryId()).getContinent(),
                                        city.getIsCapital(),
                                        city.getCityPopulation()));
                    }
            });
        
        System.out.println("--------------before sorting--------------------------");
        
        countriesCities.forEach((k, val) -> 
           System.out.println("key=" + k + ", value=" + val));
        System.out.println("-----------------------------------------------");
        countriesCities.forEach((k, val) -> Collections.sort(val, 
                                (obj1,obj2)->(int) (obj2.getCityPopulation()- obj1.getCityPopulation() )
                                                            )
                                );
        System.out.println("-----------------After sorting--------------------");
        countriesCities.forEach((k, v) -> 
            System.out.println("key=" + k + ", value=" + v));
            
    }
     
}
