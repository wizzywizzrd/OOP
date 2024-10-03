package macke.it.kaffee.v01;

public class Kantine {

    public static void main(String[] args) {
        
        Kaffeeautomat a = new Kaffeeautomat("KVA-0234", Kaffeesorte.KAFFEE, 100);
        //a.setBezeichnung("KVA-0234");
        //a.setKaffeesorte("Kaffee");
        //a.setFuellstand(100);
        System.out.println(a.getBeschreibung());
        
        Kaffeeautomat b = new Kaffeeautomat("KVA-007", Kaffeesorte.ICECOFFEE, 40);
        //b.setBezeichnung("KVA-007");
        //b.setKaffeesorte("Cappuccino");
        //b.setFuellstand(40);
        System.out.println(b.getBeschreibung());

        Kaffeeautomat c = new Kaffeeautomat(Kaffeesorte.ESPRESSO);
        //c.setBezeichnung("KVA-XXB");
        //c.setKaffeesorte("Espresso");
        //c.setFuellstand(75);
        System.out.println(c.getBeschreibung());

        Kaffeeautomat d = new Kaffeeautomat(80);
        //d.setBezeichnung("KVA-XXL");
        //d.setKaffeesorte("Kaffee");
        //d.setFuellstand(80);
        System.out.println(d.getBeschreibung());
    }
}