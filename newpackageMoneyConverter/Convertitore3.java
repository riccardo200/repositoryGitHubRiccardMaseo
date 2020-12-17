package newpackageMoneyConverter;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Convertitore3 extends JFrame {
    
      Ascoltatore action = new Ascoltatore(); 
      JFrame frame = new JFrame("BITCOIN CONVERTER");
      Container container = frame.getContentPane();
      JComboBox box = new JComboBox();
      JTextField testo = new JTextField("",10);
      JTextField testo1 = new JTextField("",10);
      JLabel etichetta = new JLabel("BITCOIN");
      JButton b1 = new JButton();
      JButton b2 = new JButton("CANCELLA");
      double coin ;         //BITCOIN TASSO CAMBIO
  //    double euro;        //9.158,08
   //   double dollaro;       //10.690,00
  //    double sterlina;      //8.334,81
      double risultato;
       
     public Convertitore3(){
     
     frame.setBounds(350, 350, 410, 150);
     frame.setLayout(new FlowLayout());
     frame.setLocation(755,600);
   //  frame.setLocationRelativeTo(null);
     frame.setResizable(false);
     container.add(etichetta);
     container.add(testo);
     container.add(testo1);
     container.add(box);
     container.add(b2);
     
     testo.setBounds(200, 300, 100, 30);
     box.setBounds(200,200, 200, 30);
     b2.setLocation(200, 300);
    // box.setSelectedItem(null);
     box.addItem("SCELTA...");
     box.addItem("EURO");
     box.addItem("DOLLARO");
     box.addItem("STERLINA");
     
     container.setBackground(Color.black);
     b2.setBackground(Color.red);
     etichetta.setForeground(Color.white);
     
     b2.addActionListener((ActionEvent action1) ->{
     
          testo.setText("");testo1.setText("");
     });
     
     box.addActionListener((ActionEvent e) ->{        //box.addItemListener((ItemEvent e) ->
     box.getSelectedItem();
     
     switch (e.getActionCommand()){                 
     
         case "EURO":
             
             coin=Double.valueOf(testo.getText());
             this.risultato= coin*9.158;
             testo1.setText(Double.toString(risultato));
             System.out.println("EURO");
             break;
             
         case "DOLLARO":
             
             coin=Double.valueOf(testo.getText());
             this.risultato= coin*10.690;
             testo1.setText(Double.toString(risultato));
             System.out.println("DOLLARO");
             break;
             
         case "STERLINA":
             
             coin=Double.parseDouble(testo.getText());
             this.risultato=coin*8.335;
             testo1.setText(Double.toString(risultato));
             System.out.println("STERLINA");
             break;
             
         default:
             
             break;
     
     }
     
     });
     
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     frame.setVisible(true);
     } 
             
}
