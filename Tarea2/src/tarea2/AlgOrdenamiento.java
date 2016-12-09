/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class AlgOrdenamiento{
    
    public AlgOrdenamiento()
    {
        
    }
    public void InstruccionDirecta(ArrayList<Peliculas> N)
    {
        for (int i = 1; i < N.size(); i++)
        {
            Peliculas temp = N.get(i);
            int j;
            for(j = i-1; j>=0 && temp.compareTo(N.get(j))<0; j--)
                N.set(j+1, N.get(j));
            N.set(j+1, temp);   
        }
    }
    
    public void BubbleSort(ArrayList<Peliculas> N)
    {
        boolean camb = true;
        int j = 0;
        while (camb) 
        {
            camb = false;
            j++;
            for (int i = 0; i < N.size() - j; i++) 
            {                                       
                  if (N.get(i).compareTo(N.get(i+1))>0) 
                  {
                        swap (N, i, i+1);
                        camb = true;
                  }
            }
        }
        
    }
    
    private void swap(ArrayList<Peliculas> N, int s, int t)
    {
        Peliculas temp;
        temp = N.get(s);
        N.set(s, N.get(t));
        N.set(t, temp);
    }
    private int findPartition(ArrayList<Peliculas> datos, int min, int max)
    {
        int wall;
        int piv;
        wall = min;
        piv = max;
        for (int i=min; i < datos.size()-1; i++)
            if(datos.get(i).getId() < datos.get(max).getId())
            {
                swap(datos, i, wall);
                wall = wall+1;
            }
        swap(datos, wall, piv);
        return wall;
    }
    
    public void QuickSort(ArrayList<Peliculas> N)
    {
        QuickSort(N, 0, N.size()-1);
    }
    private void QuickSort(ArrayList<Peliculas> datos, int min, int max)
    {
        int part;
        if (min >= max)
            return;
        part = findPartition(datos, min, max);
        QuickSort(datos, min, part-1);
        QuickSort(datos, part+1, max);
            
    }
    
    public void MergeSort(ArrayList<Peliculas> N){
        MergeSort(N, 0, N.size()-1);
    }
    
    private void MergeSort(ArrayList<Peliculas> N, int ini, int fin){
        if(ini == fin)
            return;
        else{ 
            if (ini+1 == fin){
                merge(N, ini, fin, fin);
            }
            else{
                int mit = ini + ((fin-ini)/2);
                MergeSort(N, ini, mit);
                MergeSort(N, mit+1, fin);
                merge(N, ini, mit+1, fin);
            }
        }
    }
    private void merge(ArrayList<Peliculas> N, int p, int si, int sf){
        ArrayList<Peliculas> aux = new ArrayList();
        int ap1, ap2;
        ap1 = p;
        ap2 = si;
        while(ap1 != si && ap2 <= sf)
            if(N.get(ap1).id<N.get(ap2).id){
                aux.add(N.get(ap1));
                ap1++;
            }
            else{
                aux.add(N.get(ap2));
                ap2++;
            }
        if(ap1 == si)
            while(ap2 <= sf){
                aux.add(N.get(ap2));
                ap2++;
            }
        else
            while(ap1!=si){
                aux.add(N.get(ap1));
                ap1++;
            }
        ap1 = p;
        ap2 = 0;
        while(ap1<=sf){
            N.set(ap1, aux.get(ap2));
            ap1++;
            ap2++;
        }
        
    }
    public void ShellSort(ArrayList<Peliculas> N)
    {
        
    }
}
