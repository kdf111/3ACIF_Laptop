public class Laptop
{
    private String hersteller;
    private int kosten;
    private boolean neu;
    
    public void setHersteller(String neuHersteller)
    {
        hersteller = neuHersteller;
    }
    
    public void setKosten(int neuKosten)
    {
        kosten = neuKosten;
    }
    
    public void setNeu(boolean neuNeu)
    {
        neu = neuNeu;
    }
    
    public String getHersteller()
    {
        return hersteller;
    }
    
    public int getKosten()
    {
        return kosten;
    }
    
    public boolean getNeu()
    {
        return neu;
    }
}