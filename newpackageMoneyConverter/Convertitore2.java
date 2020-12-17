package newpackageMoneyConverter;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Convertitore2 extends JFrame {
    
    Ascoltatore action = new Ascoltatore();
    JFrame frame = new JFrame("MONEYCONVERTER");
    Container container = frame.getContentPane();
    JPanel panel = new JPanel();
    JTextField testo = new JTextField("",10);
    JTextField testo1 = new JTextField("",10);
    JTextField testo2 = new JTextField("",12);
    JLabel etichetta = new JLabel("    DOLLARO $               ");
    JLabel etichetta1 = new JLabel("          YEN                "); 
    JLabel etichetta2 = new JLabel("             RUBLO            ");     
    JButton b1 = new JButton("CONVERTI");
    JButton b2 = new JButton("CANCELLA");
    double dollaro;
 //   double yen;       //105,37 tasso cambio 
 //   double rublo;      //76,82 
    double risultato;
    
    public Convertitore2(){
    
        container.setLayout(new FlowLayout());
        frame.setBounds(200, 300, 410, 150);
        frame.setLocation(755,285);
        frame.setResizable(false);
        container.add(testo);
        testo.setBounds(200, 300, 100, 30);
        container.add(testo1);
        container.add(testo2);
        container.add(etichetta);
        container.add(etichetta1);
        container.add(etichetta2);
        container.add(b1);
        container.add(b2);
        
        container.setBackground(Color.GRAY);
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.orange);
        etichetta1.setBackground(Color.red);
        etichetta2.setBackground(Color.red);
        
        b1.addActionListener(action);
        b2.addActionListener(action);
        
        b2.addActionListener((ActionEvent action1) ->{        //X CANCELLARE
        
          testo.setText("");testo1.setText("");testo2.setText("");
        
      });
    
        b1.addActionListener((ActionEvent action1) -> {        // CONVERSIONE VALUTA 
            
          dollaro=Double.valueOf(testo.getText());
          this.risultato=dollaro*105.37;     
          testo1.setText(Double.toString(risultato));
          this.risultato=dollaro*76.82;
          testo2.setText(Double.toString(risultato));
          testo1.setForeground(Color.red);
          testo2.setForeground(Color.blue);
          System.out.println("YEN");   
          System.out.println("RUBLO");
        
      });
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(rootPaneCheckingEnabled);
    
    }
}
