package magazzinoLibri;

//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class Libri {
    public static void main(String[] args) {
    
    ArrayList<Magazzino> libreria1 = new ArrayList<>();
    
    Scanner input = new Scanner(System.in);
    
    String risp = "";
    
    Libro e ;
    
    Magazzino libreria = new Magazzino();
    
    boolean dataok = true;
    
    LocalDate date = null;
        
    Libro m1 = new Libro(" Harry Potter ", 25 ,LocalDate.of(1969, 10, 10));
    Libro m2 = new Libro(" La Spada Nella Roccia ", 20 , LocalDate.of(1950, 10, 10));    
    Libro m3 = new Libro(" Java8 ", 50 , LocalDate.of(2014, 11, 20));    
    Libro m4 = new Libro(" Il Signore Degli Anelli ", 30 , LocalDate.of(1950, 10, 10));    
     libreria.inserisci(m1);
     libreria.inserisci(m2);
     libreria.inserisci(m3);
     libreria.inserisci(m4);
   //libreria.libreria.remove(0);
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
    
    System.out.println("==================================");    
    System.out.println("BENVENUTO NELLA LIBRERIA LIBRI-APP");
    System.out.println("==================================");  
      
      do{
   try{ 
      System.out.println("DIGITA 1 X VEDERE LA DISPONIBILITA' DEL MAGAZZINO");   //mostra
      System.out.println("DIGITA 2 X INSERIRE UN TITOLO E UNA DATA DI UN LIBRO");   //inserisci
      System.out.println("DIGITA 3 X CONFRONTARE LE DATE DI PUBBLICAZIONE");   //verifica
      System.out.println("DIGITA 4 X CERCARE UN LIBRO X TITOLO");    //ricerca
      System.out.println("DIGITA 5 X CANCELLARE UN LIBRO VENDUTO");      //rimuovi
      
        if(risp.equals("Y")|| risp.equals("y")||risp.equals("si")|| risp.equals("certo")||risp.equals("SI"));
          
        else if(risp.equals("N")|| risp.equals("no")|| risp.equals("fine"))break;

      int scelta = input.nextInt();
      input.nextLine();
       
      switch(scelta){
      
        case 1:               // x controllare la disponibilità magazino
           
            e = new Libro();     
           
            System.out.println("GUARDA LA DISPONIBILITA' DEI LIBRI PRESENTI IN MAGAZZINO ");// + libreria.mostra());
            libreria.mostra();
            System.out.println("VUOI CONTINUARE SI/NO?");
            risp = input.nextLine();
            System.out.println();
            
             break;
                 
        case 2:              // x inserire nuovi arrivi
              
            e = new Libro();    
            
            System.out.println("INSERISCI NUOVI ARRIVI TITOLO");  
            e.setTitolo(input.nextLine());
            System.out.println("INSERISCI PREZZO NUOVI ARRIVI");
            e.setPrezzo(input.nextInt());
            input.nextLine();
          try{
            System.out.println("INSERISCI ANNO E GIORNO PUBBLICAZIONE NUOVI ARRIVI dd MM yyyy");
            formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
            e.setData(LocalDate.parse(risp=input.nextLine(),formatter));
          }catch(Exception g){
                   System.out.println("HAI INSERITO LA DATA IN MODO NON CORRETTO");
            }    
            libreria.inserisci(e);
            System.out.println("VUOI CONTINUARE SI/NO?");
          //  input.nextLine();
            risp = input.nextLine();
            System.out.println();

             break;
      
        case 3:                    // x confrontare date di pubblicazione
              
            System.out.println("INSERISCI DATA X VERIFICARE SE CI SONO LIBRI PRODOTTI NELLO STESSO ANNO dd MM yyyy ");
         try{   
            date = (LocalDate.parse(input.nextLine(),formatter)); 
            dataok = true;
         }catch (Exception ur){
            dataok = false;
            System.out.println("FORMATO DATA NON VALIDO!!");}
            if(date ==  null){System.out.println("DATA LIBRO NON TROVATI");}
            else {System.out.println(libreria.verifica(date));}
            System.out.println("VUOI CONTINUARE SI/NO?");
            risp = input.nextLine();
            System.out.println(); 
              
             break;  
              
        case 4:                 // ricerca libro x titolo
              
            System.out.println("RICERCA LIBRO X TITOLO");
            libreria.ricerca(input.nextLine());
            System.out.println("VUOI CONTINUARE SI/NO?");
            risp = input.nextLine();
            System.out.println();
              
             break;   
              
        case 5:                 // x rimuovere un libro venduto
             
            System.out.println("RIMUOVI UN LIBRO VENDUTO X TITOLO ");
            libreria.rimuovi(input.nextLine());
            System.out.println("VUOI CONTINUARE?");
            risp = input.nextLine(); 
            System.out.println();     
             
             break;
              
        default:
             
            System.out.println("DEVI INSERIRE UN NUMERO DA 1 A 5 ");
            System.out.println("VUOI CONTINUARE SI/NO?");
            risp = input.nextLine();
            System.out.println();
      }
      
              }catch (Exception t){
      
              System.out.println("ATTENZIONE HAI INSERITO UN CARATTERE NON VALIDO");
              System.out.println("VUOI CONTINUARE SI/NO?"); 
              input.nextLine();
              risp=input.nextLine();
              System.out.println();
             }  

      
    }while((risp.equals("Y")|| risp.equals("y")||risp.equals("si")|| risp.equals("certo")|| risp.equals("SI")));
   
       
       System.out.println(" GRAZIE PER AVER USATO LIBRI-APP LE AUGURIAMO BUONA GIORNATA "); 
    }
    
}
