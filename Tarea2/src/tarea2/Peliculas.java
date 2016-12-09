/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author enrique
 */
public class Peliculas{
    int id, año;
    String titulo;
    Object compareTo;
    public Peliculas(int id, int año, String titulo)
    {
        this.id = id;
        this.año = año;
        this.titulo = titulo;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String toStringCompleto()
    {
        return "Tiutlo : "+titulo+"\n"+"Id : "+id+"\n"+"Año :"+año+"\n";
    }
    
    public String toString()
    {
        return id+"\n";
    }
    
    public int compareTo(Peliculas N)
    {
        return this.id-N.id;
    }
    
}
