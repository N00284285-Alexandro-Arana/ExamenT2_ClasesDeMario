/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Piero354
 */
public class ClaseAlgebra {
    
     private Alumno alumno;
     private List<AlumnosAlgebra> alumnosAlgebra; 
    private final ArrayList<Object> alumnosDeAlgebra;

    public ClaseAlgebra(Alumno alumno, AlumnosAlgebra alumnosDeAlgebra) {
        this.alumno = alumno;
        this.alumnosDeAlgebra = new ArrayList<>();
        this.alumnosAlgebra. add(alumnosDeAlgebra);
        
    }   
    
}
