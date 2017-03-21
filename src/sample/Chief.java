package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.*;

public class Chief {
    List<Karta> lista ;
    Scanner in;

    public Chief()
    {
        lista = new ArrayList<>();
        in = new Scanner(System.in);
    }

    public void createList()
    {
        Random generator = new Random();
        int wartosc = generator.nextInt(14);
        int kolor = generator.nextInt(4);
        while(wartosc!=0)
        {
            add(new Karta(wartosc,kolor));
            //lista.add(new Karta(wartosc,kolor));
            wartosc=generator.nextInt(14);
            kolor=generator.nextInt(4);
        }
        //Collections.sort(lista,new Comparatore());
    }


    public void add(Karta karta)
    {
        if(lista.size() != 0) {
            for (int i = 0; i < lista.size(); i++) {
                if (karta.getWartosc() < lista.get(i).getWartosc()) {
                    lista.add(i, karta);
                    return;
                }
                else if (karta.getWartosc().equals(lista.get(i).getWartosc())) {
                    if (karta.getKolor() <= lista.get(i).getKolor()) {
                        lista.add(i, karta);
                        return;
                    }
                }
            }
        }
        lista.add(karta);
    }

    public List<String> showList()
    {
        List<String> temp = new ArrayList<>();
        Iterator<Karta> it;
        it = lista.iterator();
        while(it.hasNext())
        {
            temp.add(it.next() + "");
        }
        return temp;
    }

    public String showSize()
    {
        return lista.size() + "\n";
    }

    public List<Karta> showCardofValue(String input)
    {
        List<Karta> temp = new ArrayList<>();
        for(Karta i: lista)
        {
            if(i.valueChange(i.getWartosc()).equals(input))
                temp.add(i);
        }
        return temp;
    }

    public List<Karta> showCardofColour(String input)
    {
        List<Karta> temp = new ArrayList<>();
        for(int i = 0 ; i < lista.size() ; i++)
        {
            if(lista.get(i).colourChange(lista.get(i).getKolor()).equals(input))
                temp.add(lista.get(i));
        }
        return temp;
    }
}
