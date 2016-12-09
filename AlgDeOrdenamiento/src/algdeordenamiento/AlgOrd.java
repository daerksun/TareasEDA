/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algdeordenamiento;

/**
 *
 * @author hca
 */
public class AlgOrd <T> 
{
    public void seleccionDirecta(T datos[])
    {
        int min;
        T temp;
        
        for (int i = 0; i<datos.length; i++ )
        {
            min  = i;
            for (int k = i+1; k < datos.length; k++)
                if (datos[i].compareTo(datos[k])<0)
                    min = k;
            temp = datos[i];
            datos[i]=datos[min];
            datos[min]=temp;
        }
        
    }
    
    public void InstruccionDirecta(T datos[])
    {
        for(int i = 1; i< datos.length;i++)
        {
            while(j<i)
            {
                if (datos[i].compareTo(datos[j])<0)
                {
                    
                }
                    
            }
        }
    }
    
    public void bubbleSort(T datos[])
    {
        for(int i = 0; i<datos.length; i++)
            for (int j = 1; j< datos.length-i; j++)
                if (datos[j].compareTo(datos[j-1])<0)
                    swap(datos, j, j-1);
    }
}






















