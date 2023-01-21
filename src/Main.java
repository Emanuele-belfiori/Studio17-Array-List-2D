import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("ArrayList 2D");

        /* ARRAYLIST 2D PROCEDIMENTO A STEP: */

        /* 3 PUNTO-) Creazione ArrayList 2D */
        ArrayList<ArrayList<String>> spese =new ArrayList();

        /* 1 PUNTO-) Prima array creata */
        ArrayList<String> speseCasa = new ArrayList();
        speseCasa.add("Luce");
        speseCasa.add("Gas");
        speseCasa.add("Acqua");
        speseCasa.add("Riscaldamento");
        speseCasa.add("Condominio");

        /* 2 PUNTO-) Seconda classe creata */
        ArrayList<String> speseExtra = new ArrayList();
        speseExtra.add("Assicurazioni");
        speseExtra.add("Internet");
        speseExtra.add("Telefoni");
        speseExtra.add("Garage");

        /* 4 PUNTO-) Inseriamo gli ArrayList singoli nell'ArrayList 2D */
        spese.add(speseCasa);
        spese.add(speseExtra);

        // 5 Punto-) Facciamo ciclare per vedere il risultato
       for (int i=0; i<spese.size(); i++){ // size equivalente di length= lunghezza array
           System.out.println();
           for (int j=0; j<spese.get(i).size(); j++){
               System.out.println(spese.get(i).get(j) + " ");
           }
       }// Fine programma
    }
}