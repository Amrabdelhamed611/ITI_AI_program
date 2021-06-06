/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import dao.PyramidCSVDao;
import java.util.List;
import pyramid.Pyramid;

/**
 *
 * @author amrlo
 */
public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here
        PyramidCSVDao pyramidDao=new PyramidCSVDao();
        
        List<Pyramid> pyramids=    pyramidDao.getpyramidsFromCsv("pyramids.csv");
        int idx = 1;
        for(Pyramid prmd :pyramids  ){
            System.out.println("#"+(idx++)+prmd);}
    }
    
}
