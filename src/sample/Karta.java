package sample;

/**
 * Created by Karol on 2017-03-18.
 */
public class Karta {
    public Integer getWartosc() {
        return wartosc;
    }

    public Integer getKolor() {
        return kolor;
    }

    public Karta(int wartosc, int kolor) {
        this.wartosc = new Integer(wartosc);
        this.kolor = new Integer(kolor);
    }

    @Override
    public String toString() {
        return "Karta{" +
                "wartosc=" + valueChange(wartosc) +
                ", kolor=" + colourChange(kolor) +
                '}';
    }

    public String valueChange(int value)
    {
        switch (value)
        {
            case 1: return "as" ;
            case 2: return "2" ;
            case 3: return "3" ;
            case 4: return "4" ;
            case 5: return "5" ;
            case 6: return "6" ;
            case 7: return "7" ;
            case 8: return "8" ;
            case 9: return "9" ;
            case 10: return "10" ;
            case 11: return "walet" ;
            case 12: return "dama" ;
            case 13: return "krol" ;
            default: System.out.print("Podales zla wartosc karty!\n"); return "";
        }
    }
    public String colourChange(int value)
    {
        switch (value)
        {
            case 0: return "kier" ;
            case 1: return "karo" ;
            case 2: return "trefl" ;
            case 3: return "pik" ;
            default: System.out.print("Podales zly kolor karty!\n"); return "";
        }
    }



    private Integer wartosc ;
    private Integer kolor ;



}
