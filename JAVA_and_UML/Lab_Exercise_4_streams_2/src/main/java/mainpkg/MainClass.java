/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import dao.PyramidCSVDao;
import java.util.List;
import java.util.function.Supplier;
import static java.util.stream.Collectors.toList;
import pyramid.Pyramid;

/**
 *
 * @author amrlo
 */
public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here
        PyramidCSVDao pyramidDao=new PyramidCSVDao();
        
        List<Pyramid> pyramids= pyramidDao.getpyramidsFromCsv("pyramids.csv");
        int idx = 1;
        for(Pyramid prmd :pyramids  ){
            System.out.println("#"+(idx++)+prmd);}
        
        //List.forEach((k, val) -> Collections.sort(val, 
         //                       (obj1,obj2)->(int) (obj2.getCityPopulation()- obj1.getCityPopulation() )
         //                                                   )
          //                      );
       
        pyramids = pyramids.stream()
                .sorted( (obj1,obj2)->(
                        int) (obj1.getHeight()- obj2.getHeight() ) )
                .collect(toList());
        pyramids.stream().forEach(prmd -> System.out.println(prmd));
        System.out.println(pyramids.size());
        
        
        int len = (pyramids.size()-2) / 2;
        float q1 = qart(pyramids.subList(0, len));
        float q2 = qart(pyramids.subList(len, len+2));
        float q3 = qart(pyramids.subList(len+2,pyramids.size()));
        float iqr =q3-q1;
        double avg = pyramids.stream().mapToDouble(a -> a.getHeight()).average().getAsDouble() ;
        
        System.out.println("charactrize pyramids on hight the avarge hight = "+
                avg +" ,median = "+ q2+" ,lower quartile = "+ q1+
                " ,upper quartile = "+ q3+" ,interquartile range = "+ iqr);
    }
    public static float  qart( List<Pyramid> pyrmds){
        int midpoint = pyrmds.size()/2 ;
        float mid =0;
        if (pyrmds.size() %2 == 0 ) {
            mid = pyrmds.get(midpoint).getHeight() + pyrmds.get(midpoint-1).getHeight();
            
        }
        else{mid = pyrmds.get(midpoint).getHeight() ;}
        return  mid;
    }
    
    
    
    
    }

