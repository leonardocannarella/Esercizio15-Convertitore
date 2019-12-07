
/**
 * MyPanel
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 05/12/2019)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MyPanel extends JPanel implements ActionListener 
{
    private JTextField txtDenaro;
    private JButton btnEUR_DOL;
    private JButton btnDOL_EUR;
    private JLabel lblRisultato;
    private Convertitore convertitore;

    public MyPanel(Convertitore c) 
    {
        convertitore=c;
        txtDenaro=new JTextField("SCRIVI QUI");
        lblRisultato=new JLabel("Scrivi un valore da convertire e clicca un pulsante",SwingConstants.CENTER);
        btnEUR_DOL=new JButton("Converti Euro in Dollari");
        btnDOL_EUR=new JButton("Converti Dollari in Euro");
        GridLayout layout=new GridLayout(4, 1);
        setLayout(layout);

        this.add(txtDenaro);
        this.add(btnEUR_DOL);
        this.add(btnDOL_EUR);
        this.add(lblRisultato);
        
        btnEUR_DOL.addActionListener(this);
        btnDOL_EUR.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()== btnEUR_DOL)
        {
            try
            {
                convertitore.setDenaro(Double.parseDouble(txtDenaro.getText()));
                double ris = convertitore.convertiEUR_DOL();
                lblRisultato.setText("Dollari convertiti: $" + ris);
            }
            catch(NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Hai inserito un numero non valido!", "Errore!", JOptionPane.ERROR_MESSAGE);
            }
        }
         else
        {
            try
            {
                convertitore.setDenaro(Double.parseDouble(txtDenaro.getText()));
                double ris = convertitore.convertiDOL_EUR();
                lblRisultato.setText("Euro convertiti: €" + ris);
            }
            catch(NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Hai inserito un numero non valido!", "Errore!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

