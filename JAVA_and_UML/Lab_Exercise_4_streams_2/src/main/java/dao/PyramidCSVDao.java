/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyramid.Pyramid;

/**
 *
 * @author amrlo
 */
public class PyramidCSVDao {
    public List<Pyramid> getpyramidsFromCsv(String path) {
        return getpyramidsFromCsv(path, true );
    }
        
    public List<Pyramid> getpyramidsFromCsv(String path, boolean Header  ) {
       List<Pyramid> Pyramids=new  ArrayList<>();
        try {
            Scanner sc=new Scanner(new File(path));
            if(sc.hasNextLine() & Header ) sc.nextLine();
            while( sc.hasNextLine()){
                String line=sc.nextLine().replace(",,", ", ,");
                if(line.endsWith(",")) // for lines with no comments
                    line += " ,";
                String [] elemnts=line.split(",");
                //System.out.println(elemnts.length);
                Pyramid prmd=new Pyramid(elemnts[0],elemnts[2],elemnts[4],parser.strToFloat(elemnts[7]));
                Pyramids.add(prmd);
           }
        }   catch (FileNotFoundException ex) {
                Logger.getLogger(Pyramid.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Pyramids;
    }
    
}






   
    
