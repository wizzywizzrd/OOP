package it.macke.autohaus.v01;

public class Auto 
{
    private String marke;
    private Farbe farbe;
    private Integer kilometerstand = 0;

    Auto(String marke, Farbe farbe, Integer kilometerstand)
    {
        setMarke(marke);
        setFarbe(farbe);
        setKilometerstand(kilometerstand);
    }

    Auto(Farbe farbe)
    {
        this("Ford", farbe, 100);
    }
    
    String getMarke() {
        return marke;
    }

    void setMarke(String neueMarke) {
        
        if (neueMarke == null || neueMarke.equals("")) 
        {
            throw new IllegalArgumentException("Neuer Hersteller darf nicht leer sein!");    
        }
        this.marke = neueMarke;
    }

    Farbe getFarbe() {
        return farbe;
    }

    void setFarbe(Farbe neueFarbe) {
        
        /* Prüfung wird nicht mehr benötigt, da bereits im Enum Farbe die gültigen Werte festgelegt wurden
         * Es können also nur noch die Farben Gelb, Blau und Rot aus dem Enum eingefügt werden ohne das ich in der Methode setFarbe eine Prüfung einbauen muss */
        
        //if (!"gelb".equals(neueFarbe) && !"blau".equals(neueFarbe) && !"rot".equals(neueFarbe))                  
        //{
        //    throw new IllegalArgumentException("Neue Farbe darf nur folgende Werte haben: gelb, blau, rot"); 
        //}                                                                                                      
        this.farbe = neueFarbe;
    }

    Integer getKilometerstand() {
        return kilometerstand;
    }

    void setKilometerstand(Integer neuerKilometerstand) {
        
        if (neuerKilometerstand < kilometerstand) 
        {
            throw new IllegalArgumentException("Neuer Kilometerstand darf nicht kleiner sein als der alte Kilometerstand");    
        }
        this.kilometerstand = neuerKilometerstand;
    }

    String getBeschreibung()
    {
        return getFarbe().getName() + "er " + getMarke() + " mit Kilometerstand " + getKilometerstand();
    }
}
