/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.io.*;
import java.util.*;

/**
 *
 * @author enrique
 */

public class Tarea2 {

    public static void leeInfo(ArrayList T){
        File datos;
        Scanner lee;
        int clave, año;
        String titulo;
        datos = new File ("movie_titles2.txt");
        try
        {
            lee = new Scanner (datos);
        }
        catch (Exception e)
        {
            lee = null;
        }
        if (lee != null)
        {
            while (lee.hasNextLine())
            {
                lee.useDelimiter(",");
                clave = lee.nextInt();
                año = lee.nextInt();
                titulo = lee.nextLine();
                T.add(new Peliculas(clave, año, titulo));
            }
            lee.close();
        }
        
    }
    public static void main(String[] args) {
        ArrayList<Peliculas> Catalogo = new ArrayList();
        AlgOrdenamiento ordena = new AlgOrdenamiento();
        leeInfo(Catalogo);
        ordena.MergeSort(Catalogo);
        System.out.println(Catalogo);
    }
}
