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
public class CountryCity {
    String Id,cityName, countryName,continent;
    boolean isCapital;
    long cityPopulation;

    public CountryCity(String Id, String cityName, String countryName,
            String continent, boolean isCapital, long cityPopulation) {
        this.Id = Id;
        this.cityName = cityName;
        this.countryName = countryName;
        this.continent = continent;
        this.isCapital = isCapital;
        this.cityPopulation = cityPopulation;
    }
    public ArrayList<String> getAttributes() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(Id) ;
        arr.add(cityName); 
        arr.add(countryName);
        arr.add(continent);
        arr.add(String.valueOf(isCapital));
        arr.add( String.valueOf(cityPopulation));
        return arr;
    }
    
    
    public String getId() {
        return Id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getContinent() {
        return continent;
    }

    public boolean getisIsCapital() {
        return isCapital;
    }

    public long getCityPopulation() {
        return cityPopulation;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setIsCapital(boolean isCapital) {
        this.isCapital = isCapital;
    }

    public void setCityPopulation(long cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    @Override
    public String toString() {
       return  "== country Name: "+ countryName+
               " , City Name: " +cityName+
               " , continent: " +continent+
               " , Is Capital: " +isCapital+
               " , city population : " + cityPopulation +"\n";
    }
    
}
