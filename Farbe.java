package it.macke.autohaus.v01;

public enum Farbe 
{
    GELB,
    BLAU,
    ROT;
    
    public String getName()
    {
        return name().toLowerCase();
    }
    /* die methode getName() muss in der Klasse Auto noch als getFarbe().getName() aufgerufen werden, andernfalls bekommen wir keine Kleinbuchstaben */
}
