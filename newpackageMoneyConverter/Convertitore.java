package newpackageMoneyConverter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Convertitore extends JFrame {
    
    Ascoltatore action = new Ascoltatore();
    JFrame frame = new JFrame("MONEYCONVERTER");
    Container container = frame.getContentPane();
    JTextField testo = new JTextField();    
    JPanel panel = new JPanel();
    JLabel etichetta = new JLabel("  €   ");
    JButton b1 = new JButton("DOLLARO $");         //1€ = 1.18 $
    JButton b2 = new JButton("STERLINA £");          //1€ = 0.92 STERLINA
    JButton b3 = new JButton("C");
    double euro;                                   //VALUTA CORRENTE
  //  double dollaro;
 //   double sterlina;
    double risultato;

    public Convertitore() {
        
        container.setLayout(new BorderLayout());
        frame.setSize(400,150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);                       //(rootPaneCheckingEnabled);
        testo.setBounds(40,40,250,30);
        container.add("Center",testo);
        container.add("North",b1);
        container.add("South",b2);
        container.add("East",b3);
        container.add("West",etichetta);
        
        b1.addActionListener(action);
        b2.addActionListener(action);
        b3.addActionListener(action);
        b3.setBackground(Color.CYAN);
        testo.setFont(new Font("Bold",Font.ITALIC,20));
    //    testo.setBackground(Color.lightGray);
        
        b3.addActionListener((ActionEvent action1) -> {              //CANCELLA TUTTO IL DISPLAY
             testo.setText("");
             testo.setForeground(Color.black);
    });       

        b1.addActionListener((ActionEvent action1) -> {                //ESPRESSIONI LAMBDA          
      //  if(euro == risultato) {
          euro=Double.valueOf(testo.getText());
          this.risultato=euro*1.18;     
          testo.setText("  "+euro+"       $: "+Double.toString(risultato));
          testo.setForeground(Color.blue);
     //   }else dollaro=risultato*0.79;
      //    testo.setText(euro+"                         $: "+Double.toString(risultato));
          testo.setForeground(Color.blue);
          System.out.println("DOLLARO");   
             
    });  

        b2.addActionListener((ActionEvent action1) -> {        
          euro=Double.parseDouble(testo.getText());
          this.risultato = euro*0.92;
          testo.setText(euro+"           £: "+Double.toString(risultato));
          testo.setForeground(Color.BLUE);
          System.out.println("STERLINA");
           //  testo.setText(testo.getText()+euro);
           //   Double.parseDouble(testo.getText());                      
    });  
         
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
}
}