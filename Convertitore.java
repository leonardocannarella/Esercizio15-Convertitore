
/**
 * Convertitore
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 05/12/2019)
 */
public class Convertitore
{
    private double denaro;
    
    public Convertitore()
    {
        setDenaro(0);
    }
    
    private void setDenaro(double d)
    {
        denaro=d;
    }
    
    //Euro in Dollaro
    public double convertiEUR_DOL(double soldi)
    {
        double conversione;
        conversione=soldi*1.11;
        return conversione;
    }
    
    //Dollaro in Euro
    public double convertiDOL_EUR(double soldi)
    {
        double conversione;
        conversione=soldi*0.9;
        return conversione;
    }
}
