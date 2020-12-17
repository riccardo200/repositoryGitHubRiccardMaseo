package newpackageMoneyConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JTextField;

public class Ascoltatore implements ActionListener ,ItemListener {
    
    JTextField testo = new JTextField();
    
    double euro;      
    double dollaro;
    double sterlina;
    double risultato;
    
    public void setTesto(JTextField testo){
    
    this.testo=testo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}  







    /*    switch (e.getActionCommand()){
        
            case "DOLLARO $":
          testo.setForeground(Color.red);
       //     testo.setText(Double.toString(this.euro));
            testo.setText(String.valueOf(euro));
            euro=Double.valueOf(testo.getText());
            this.risultato=euro*1.18;  
            
        //    testo.setText("$ "+Double.toString(risultato)); 
            System.out.println("DOLLARO");   
            
                break;
                
            case "STERLINA":
             
            testo.setText(Double.toString(this.euro)); 
            Double.parseDouble(testo.getText()); 
            this.risultato = euro*0.92;  
            testo.setText(Double.toString(risultato));
            System.out.println("STERLINA"); 
            
                break;
             
            case "C":
                testo.setText("");
                System.out.println("CANCEL");
                
                break;
                
            default:
                break;
                
        }
        
         testo.setText(Double.toString(risultato));*/
        
    

          //  a.setForeground(Color.red);  

