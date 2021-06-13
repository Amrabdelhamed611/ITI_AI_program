/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

/**
 *
 * @author amrlo
 */
public class Pyramid {
    
  String Pharaoh ,Modern_name ,Site;
  float Height ;
    public String getPharaoh() {
        return Pharaoh;
    }

    public String getModern_name() {
        return Modern_name;
    }

    public String getSite() {
        return Site;
    }

    public float getHeight() {
        return Height;
    }

    public void setPharaoh(String Pharaoh) {
        this.Pharaoh = Pharaoh;
    }

    public void setModern_name(String Modern_name) {
        this.Modern_name = Modern_name;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }

   

    public Pyramid(String Pharaoh, String Modern_name, String Site,float Height) {
        this.Pharaoh = Pharaoh;
        this.Modern_name = Modern_name;
        this.Site = Site;
        this.Height = Height;
    }

    @Override
    public String toString() {
       return "===== This is : "+Modern_name+ " pyramid bulit py "+Pharaoh +
               " it is located in : "+Site+" with height : "+(Height)+"=====\n";
    }
  
    
}
