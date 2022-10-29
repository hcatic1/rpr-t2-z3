package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class App {

    public static void main( String[] args ) {
        Lista l = new Lista();
        try{
        System.out.println("Najveci uneseni broj je: " + l.max());
        System.out.println("Najmanji unesni broj je " + l.min());
        System.out.println("Srednja vrijednost unesnih brojeva je " + l.mean());
        System.out.println("Standardna devijacija unesnih brojeva je " + l.standardnaDevijacija());
        }catch(DataFormatException e){
            System.out.println(e);
        }

    }
}
