package macke.it.kaffee.v01;

public class Kaffeeautomat 
{
    private String bezeichnung;
    private Kaffeesorte kaffeesorte;        // Kein String mehr sondern ein Enum (Enumeration)
    private Integer fuellstand;

    Kaffeeautomat(String bezeichnung, Kaffeesorte kaffeesorte, Integer fuellstand)
    {
        setBezeichnung(bezeichnung);
        setKaffeesorte(kaffeesorte);
        setFuellstand(fuellstand);
    }

    Kaffeeautomat(Kaffeesorte kaffeesorte) 
    {
        this("KVA-XXX", kaffeesorte, 75);
    }

    Kaffeeautomat(Integer fuellstand)
    {
        this("KVA-XXL", Kaffeesorte.CAPPUCCINO, fuellstand);
    }


    String getBezeichnung() {
        return bezeichnung;
    }

    Kaffeesorte getKaffeesorte() {
        return kaffeesorte;
    }

    Integer getFuellstand() {
        return fuellstand;
    }

    void setBezeichnung(String neueBezeichnung) {
        
        if (neueBezeichnung == null || neueBezeichnung.equals("")) 
        {
            throw new IllegalArgumentException("Die Bezeichnung darf nicht leer sein!");    
        }
        this.bezeichnung = neueBezeichnung;
    }

    void setKaffeesorte(Kaffeesorte neueKaffeesorte) {
        
        /*if (!neueKaffeesorte.equals("Kaffee") && !neueKaffeesorte.equals("Cappuccino") && !neueKaffeesorte.equals("Espresso")) // Prüfung wird nicht mehr benötigt da Enum
        {
            throw new IllegalArgumentException("Kaffeesorten dürfen nur sein: Kaffee, Cappuccino oder Espresso.");    
        } */
        this.kaffeesorte = neueKaffeesorte;
    }

    void setFuellstand(Integer neuerFuellstand) {
        
        if (neuerFuellstand < 0 || neuerFuellstand > 100) 
        {
            throw new IllegalArgumentException("Der Füllstand muss zwischen 0 und 100 liegen.");    
        }
        this.fuellstand = neuerFuellstand;
    }

    String getBeschreibung()
    {
        return "Kaffeeautomat " + getBezeichnung() + " mit " + getKaffeesorte().getName() + " und Füllstand " + getFuellstand() + "%.";
    }
}