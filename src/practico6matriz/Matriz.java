/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6matriz;

/**
 *
 * @author Fran Gonzalez
 */
public class Matriz {
    
    public void armar(){
        int[][] mat= {{3,6,9,12},{15,18,21},{24,27,30,36},{39,42}};
        
        /* for(int i= 0 ; i<mat.length ; i++){
        System.out.print("Fila " + (i + 1) + ":" );
        for (int j=0 ; j<mat[i].length ; j++){
        if(mat[i][j] %2 == 0){
        System.out.print(" " + mat[i][j]);
        }
        }
        System.out.println("");
        }*/
        
        int i= 1;
        for (int[] arreglo : mat){
            System.out.print("Fila " + (i++) + ":" );
            for (int pos : arreglo){
                if(pos %2 == 0){
                    System.out.print(" " + pos);
                }
            }
            System.out.println("");
        }
    }
    
    
    
}
