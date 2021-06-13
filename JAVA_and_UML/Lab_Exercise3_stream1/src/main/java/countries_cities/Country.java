/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries_cities;

import java.util.ArrayList;

/**
 *
 * @author amrlo
 */
public class Country {
    String countryName,countryId,continent;

    public Country(String countryName, String countryId, String continent) {
        this.countryName = countryName;
        this.countryId = countryId;
        this.continent = continent;
    }
    public ArrayList<String> getAttributes() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(countryName) ;
        arr.add(countryId); 
        arr.add(continent);
        return arr;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getContinent() {
        return continent;
    }
    @Override
    public String toString() {
       return  "== country Name: "+ countryName+
               " , Continent: " +continent+
               " , country Id: " +countryId+
               "\n";
    }

    }
