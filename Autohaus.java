package it.macke.autohaus.v01;

public class Autohaus 
{
    public static void main(String[] args) 
    {
        //enum Enumeration ist eine Liste erlaubter Werte (vorab definierte Werte)
        
        Auto a = new Auto("BMW", Farbe.BLAU, 100);
        //a.setMarke("BMW");
        //a.setFarbe("blau");
        //a.setKilometerstand(100);
      
        System.out.println(a.getBeschreibung() + " wird verkauft.");
        
        Auto b = new Auto("Toyota", Farbe.ROT, 1245);
        //b.setMarke("Toyota");
        //b.setFarbe("rot");
        //b.setKilometerstand(1245);
        
        System.out.println(b.getBeschreibung() + " wird verkauft.");

        Auto c = new Auto(Farbe.GELB);

        System.out.println(c.getBeschreibung() + " wird verkauft.");

    }


}
