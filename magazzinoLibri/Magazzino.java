package magazzinoLibri;

import java.time.LocalDate;
import java.util.*;

public class Magazzino implements Deagostino {
   
    ArrayList <Libro> libreria = new ArrayList<>();
    
    
    public boolean inserisci(Libro m){    
    
    return libreria.add(m);
    
    }
    
    
   
  //  public ArrayList <?> mostra(){
    @Override
    public void mostra(){
  //  ArrayList<Libro> m = new ArrayList<>();
    
    for(int i = 0;i<libreria.size();i++){
       
       System.out.println(" IL LIBRO E': " + libreria.get(i));
    }
   
    }
    
  
    public Libro ricerca(String titolo){
    
    // for (Libro i : libreria) {
       for(int i = 0;i<libreria.size();i++) { 
       if(libreria.get(i).getTitolo().contains(titolo)){
           
       System.out.println("IL LIBRO E' PRESENTE IN MAGAZZINO"+ libreria.get(i));}
       
      // return libreria.get(i);
        // return null;
        }
       return null;
       
       
    }
    
 /*  public boolean ricerca1(String titolo){
   
   for(Libro i : libreria)
       
     System.out.println(i);
   
     if(libreria.get(0).getTitolo().equals(titolo))
    
     return true;
   
     return false;
   }*/
    
    
    public Libro rimuovi(String titolo){
        
        for(int i = 0;i<libreria.size();i++){
        
        if(libreria.get(i).getTitolo().trim().equals(titolo.trim())){   //metodo trim serve x nn contare gli spazzi tra un carattere e l altro
        
        return libreria.remove(i);}
       
    }
    
    return null;
    
}  
   
    
    public ArrayList <?> verifica (LocalDate date){  
     
      ArrayList <Libro> m = new ArrayList<>(); 
        
       for(int i = 0;i<libreria.size();i++){
        
       if(libreria.get(i).getData().compareTo(date)==0)
        
        m.add(libreria.get(i));
        
        } 
        
     return m;   
    
    }

    @Override
    public boolean inserisci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ricerca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rimuovi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<?> verifica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}