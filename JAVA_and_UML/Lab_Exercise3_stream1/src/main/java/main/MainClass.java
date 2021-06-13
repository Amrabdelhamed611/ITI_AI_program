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
import static java.util.Collections.max;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toList;


/**
 *
 * @author amrlo
 */
public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here

        Map<String, Country> countries = DAOCountry.readCountry("countries.csv",true);
        List<City> cities =  DAOCity.readCity("cities.csv",true);
        List<CountryCity> countriesCities = new ArrayList<>();

        cities.forEach( city -> 
            { countriesCities.add(new CountryCity(city.getCountryId()+city.getCityId(),
                                            city.getCityName(),
                                            countries.get(city.getCountryId()).getCountryName(),
                                            countries.get(city.getCountryId()).getContinent(),
                                            city.getIsCapital(),
                                            city.getCityPopulation()));
            }           );
        
        //countriesCities.forEach( val -> System.out.println(val)) ;
        System.out.println("'----------------------------Highest population city of each country--------------------------------------- '");
        Map<String, Optional<CountryCity>> populatedCities =countriesCities.stream().
                collect(groupingBy
                        (CountryCity::getCountryName,maxBy(Comparator.comparingLong(CountryCity::getCityPopulation )) ));
        
        populatedCities.forEach( (cntry,city) -> 
                System.out.println( city.get().getCityName()+
                            " has the Highest population in " + cntry +
                        " with population approximate to "+city.get().getCityPopulation()  )) ;
        System.out.println("'----------------------------Highest population city of each continent--------------------------------------- '");
        populatedCities =countriesCities.stream().
                collect(groupingBy
                        (CountryCity::getContinent,maxBy(Comparator.comparingLong(CountryCity::getCityPopulation ))));

        populatedCities.forEach( (content,city) -> 
                System.out.println( city.get().getCityName()+
                            " has the Highest population in the continent " + content +
                        " with population approximate to "+city.get().getCityPopulation()  )) ;
        
        System.out.println("'----------------------------Highest populated capital--------------------------------------- '");
        populatedCities =countriesCities.stream().filter(cty ->cty.isIsCapital() == true).
                collect(groupingBy
                        (CountryCity::getIsIsCapital ,maxBy(Comparator.comparingLong(CountryCity::getCityPopulation ))));

        populatedCities.forEach( (content,city) -> 
                System.out.println( city.get().getCityName()+
                            " is the populated most captial"  +
                        " with population approximate to "+city.get().getCityPopulation()  )) ;
    }
     
}
