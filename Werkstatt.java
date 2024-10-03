package it.macke.autohaus.v01;

public class Werkstatt 
{
    public static void main(String[] args) 
    {
        Auto a = new Auto("Dodge", Farbe.BLAU, 124577);
        
        //a.setMarke("Dodge");
        //a.setFarbe("rot");
        //a.setKilometerstand(124577);
        
        
        System.out.println(a.getBeschreibung() + " wird repariert.");

        Auto b =  new Auto("VW", Farbe.GELB, 12345);
        //b.setMarke("VW");
        //b.setFarbe("gelb");
        //b.setKilometerstand(12345);
        
        

        System.out.println(b.getBeschreibung() + " wird repariert.");
    }    
}
