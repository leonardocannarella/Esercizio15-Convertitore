
/**
 * Test
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 05/12/2019)
 */
import java.awt.*;
import javax.swing.*;

public class Test{
	public static void main(String[] argv){
		Convertitore c = new Convertitore();
		MyFrame f = new MyFrame("Convertitore di valuta");
		Container cont = f.getContentPane(); 
		MyPanel panel = new MyPanel(c);
		cont.add(panel);
		f.setLocation(200,100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
