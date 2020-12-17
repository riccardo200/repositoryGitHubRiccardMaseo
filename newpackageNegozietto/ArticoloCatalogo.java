package newpackageNegozietto;

import java.util.List;
import java.util.LinkedList;


public class ArticoloCatalogo<E extends Articoli> implements InterfacciaArticolo {
    
    LinkedList<Articoli> lista = new LinkedList<>();
    
    public boolean aggiungi(E a) {
        
        return lista.add(a);    // return lista.addAll(0, lista);  return  lista.addAll(Collection<? extends E>a):
       
    }
    
    public void mostra(){
    
        lista.forEach(lista1 -> {
            System.out.println("ARTICOLI: "+lista1);     //lista.get(0));
        });
    
    }
    
    public List prezzoMax(double pMax){
        
    LinkedList<Articoli> listaPrezzo = new LinkedList<>();
    
    lista.stream().filter(lista1 -> (pMax> lista1.getPrezzo())).forEachOrdered(lista1 -> {
        listaPrezzo.add(lista1);
        });
        return listaPrezzo;
  
    } 
    
    public void cancella(){
    
     lista.clear();
   
    }

    @Override
    public void getNome() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getPrezzo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getDescrizione() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
}
