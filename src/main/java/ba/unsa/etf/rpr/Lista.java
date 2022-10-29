package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Lista {
    private ArrayList<Double> lista;
    public Lista(){
        lista = new ArrayList<Double>();
        System.out.println("Unesite niz brojeva. Za kraj napisite stop: ");
        Scanner ulaz = new Scanner(System.in);
        String uneseni = new String(ulaz.nextLine());
        while(!uneseni.equals("stop")){
            try{
                Double novi = Double.parseDouble(uneseni);
                lista.add(novi);
            }catch(NumberFormatException e){
                System.out.println("Niste unijeli broj niti ključnu riječ. Ponovite unos. ");
            }
            uneseni = ulaz.nextLine();
        }
    }
    public Double min() throws DataFormatException {
        if(lista.isEmpty()) throw new DataFormatException("Lista je prazna");
        Double najmanji = lista.get(0);
        for(Double d: lista){
            if(najmanji > d) {
                najmanji = d;
            }
        }
        return najmanji;
    }
    public Double max() throws DataFormatException {
        if(lista.isEmpty()) throw new DataFormatException("Lista je prazna");
        Double najveci = lista.get(0);
        for(Double d: lista){
            if(d > najveci){
                najveci = d;
            }
        }
        return najveci;
    }
    public Double mean() throws DataFormatException {
        if(lista.isEmpty()) throw new DataFormatException("Lista je prazna");
        Double suma = 0.;
        for(Double d: lista){
            suma += d;
        }
        return suma/lista.size();
    }
    public Double standardnaDevijacija() throws DataFormatException {
        if(lista.isEmpty()) throw new DataFormatException("Lista je prazna");
        Double srednjaVrijednost = mean();
        Double sigma = 0.;
        for(Double d: lista){
            sigma += (d - srednjaVrijednost)*(d-srednjaVrijednost);
        }
        sigma /= lista.size();
        sigma = Math.sqrt(sigma);
        return sigma;
    }
}
