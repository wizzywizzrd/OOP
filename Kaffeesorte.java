package macke.it.kaffee.v01;

public enum Kaffeesorte 
{
    KAFFEE,
    CAPPUCCINO,
    ESPRESSO,
    ICECOFFEE;
    
    public String getName()
    {
      return Character.toUpperCase(name().charAt(0)) + name().substring(1).toLowerCase();  // Character.toUpperCase(name().charAt(0)) - wandelt den ersten Buchstaben in einen Großbuchstaben
    }                                                                                                       // name().substring(1).toLowerCase() - wandelt alle nachfolgenden Buchstaben in Kleinbuchstaben {1 entspricht dem Index 1 bei Kaffee also dem a}
}
