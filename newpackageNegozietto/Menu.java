package newpackageNegozietto;

import java.util.*;

public class Menu extends ArticoloCatalogo {
    
    String nome;
    double prezzo;
    String descrizione;
    String risp="";
    Scanner input = new Scanner(System.in);
  //  Articoli a = new Articoli("",0,"");
    ArticoloCatalogo art = new ArticoloCatalogo();
    LinkedList<Articoli> lista = new LinkedList<>();
    
    public Menu() throws InputMismatchException{
    
  do{ 
       
  try{
      
    System.out.println(" DIGITA 1 X INSERIRE \n DIGITA 2 X VISUALIZZARE \n DIGITA 3 X VISUALIZZARE X PREZZO \n DIGITA 4 X CANCELLARE ");
    
            if((risp.equalsIgnoreCase("y")|| risp.equalsIgnoreCase("si")));
          
        else if((risp.equals("N")|| risp.equals("no")|| risp.equals("fine")))break;
    
    int scelta=input.nextInt();
    input.nextLine();
    
    switch(scelta){
    
        case 1:
            
            Articoli a = new Articoli("",0,"");            
            System.out.println("INSERISCI NOME ARTICOLO");
            a.setNome(input.nextLine());
            System.out.println("INSERISCI PREZZO ARTICOLO");
            a.setPrezzo(input.nextDouble());
            System.out.println("INSERISCI BREVE DESCRIZIONE");
            input.nextLine();
            a.setDescrizione(input.nextLine());
            art.aggiungi(a);
            System.out.println("VUOI CONTINUARE S/N ?");
            risp=input.nextLine();
            
            break;
            
        case 2:
            
            System.out.println("ARTICOLI PRESENTI \n");
            art.mostra();
            System.out.println("VUOI CONTINUARE S/N ?");
            risp=input.nextLine();
            
            break;
            
        case 3:
            
            double prezzo2;
            System.out.println("INSERISCI UN PREZZO ");
            prezzo2=input.nextDouble();
            System.out.println("ARTICOLI SOTTOPREZZO \n "+art.prezzoMax(prezzo2));          
        //    art.prezzoMax(0);
            
            break;
            
        case 4:
            
            System.out.println("CANCELLATO \n"); 
            art.cancella();
            
            break;
            
        default:
            
            System.out.println("DEVI DIGITARE UN NUMERO DA 1 A 3");
            System.out.println("VUOI CONTINUARE S/N ?");
            input.nextLine();
            
            break;
    
    }
      }catch(Exception e){
      
          System.out.println("DEVI DIGITARE UN NUMERO \n");
        //  System.out.println("VUOI CONTINUARE S/N ?");
          risp=input.nextLine();
      }
    
  }while((risp.equalsIgnoreCase("s")||risp.equalsIgnoreCase("y")||risp.equalsIgnoreCase("si")));
    
                  System.out.println("FINE");
    }
    
}

