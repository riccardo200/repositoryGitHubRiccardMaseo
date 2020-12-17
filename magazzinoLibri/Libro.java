package magazzinoLibri;

import java.time.LocalDate;

public class Libro extends Magazzino {
    
    
    private String titolo;
    
    private int prezzo;
    
    private LocalDate data;
    
    
    public Libro(){}     //costruttore vuoto
    
    public Libro(String titolo,int prezzo,LocalDate data){
    
        this.titolo=titolo; this.prezzo=prezzo; this.data=data;
    }
    
    public void setTitolo(String titolo){
    
        this.titolo=titolo;
    }
    
    public void setPrezzo(int prezzo){
    
        this.prezzo=prezzo;
    }
    
    public void setData(LocalDate data){
    
        this.data=data;
    } 
    
    public String getTitolo(){
    
        return this.titolo;
    }
    
    public int getPrezzo(){
    
        return this.prezzo;
    }
    
    public LocalDate getData(){
        
     //  this.data.getYear();                       //x estrarre solo l anno
    
        return this.data;
            
    }
    
    @Override
    public String toString(){
    
    return " TITOLO LIBRO: " + titolo + " PREZZO: " + prezzo + " DATA PUBBLICAZIONE: " + data;
    }   
}
