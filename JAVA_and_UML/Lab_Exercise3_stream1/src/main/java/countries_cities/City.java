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
public class City {
    String countryId,cityId,cityName;
    boolean isCapital;
    long cityPopulation;
    
        public City(String countryId, String cityId, String cityName, boolean isCapital, long cityPopulation) {
        this.countryId = countryId;
        this.cityId = cityId;
        this.cityName = cityName;
        this.isCapital = isCapital;
        this.cityPopulation = cityPopulation;
    }
    public String getCountryId() {
        return countryId;
    }
    public ArrayList<String> getAttributes() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(countryId) ;
        arr.add(cityId); 
        arr.add(cityName);
        arr.add(String.valueOf(isCapital));
        arr.add( String.valueOf(cityPopulation));
        return arr;
    }

    public String getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public boolean getIsCapital() {
        return isCapital;
    }

    public long getCityPopulation() {
        return cityPopulation;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setIsCapital(boolean isCapital) {
        this.isCapital = isCapital;
    }

    public void setCityPopulation(long cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    @Override
    public String toString() {
       return "== country id: "+ countryId+
               " , City id: "+ cityId + 
               " , City Name: " +cityName+
               " , Is Capital: " +isCapital+
               " , city population : " + cityPopulation +"\n";
    }
}
