package newpackageNegozietto;



public class Articoli{
    
    private String nome;
    private double prezzo;
    private String descrizione;
    
    
    public Articoli(String nome, double prezzo, String descrizione){
    
    this.nome=nome;
    this.prezzo=prezzo;
    this.descrizione=descrizione;
    
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }
    public void setDescrizione(String descrizione){
        this.descrizione=descrizione;
    }
    
    public String getNome(){
    
    return this.nome;
    }
    
    public double getPrezzo(){
    
    return this.prezzo;
    }
    
    public String getDescrizione(){
    
    return this.descrizione;
    } 
    
    @Override
    public String toString(){
    
        return "NOME "+nome+" PREZZO "+prezzo+" DESCRIZIONE "+descrizione;
    }
    
    
}
