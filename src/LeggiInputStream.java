import java.io.*;

/**
 * Classe per lettura dati da file
 * Classe ereditata InputStream
 */

public class LeggiInputStream {
/*
try {
value = Integer.parseInt(String.valueOf(((char) i)));
}
catch (Exception e) {
value = -1;
}
 */

    public void leggiInputStream(String nomefile) {
        StringBuilder stringBuilder = null;
        try (FileInputStream fileInputStream = new FileInputStream(nomefile)) {
            stringBuilder = new StringBuilder();
            // creo un array
            int i = 0;
            do {
                i = fileInputStream.read(); // se -1 finefile
                stringBuilder.append((char) i);
            }

            while (fileInputStream.available() != 0);

            // inserisco gli elementi in un array
            String mydata = String.valueOf(stringBuilder);
            String[] datiTmp = mydata.split(",");

            float somma = 0;
            int numeroMassimo = 0;
            int numeroMinimo = 0;
            // creo un array di int e lo inizializzo con il num elementi di datiTmp[]
            int[] dati = new int[datiTmp.length];
            for (int indice = 0; indice < dati.length; indice++) {
                dati[indice] = Integer.parseInt(datiTmp[indice]);
                somma += dati[indice]; // 55
                numeroMinimo = dati[0];
                if (numeroMassimo <= dati[indice]) {
                    numeroMassimo = dati[indice];
                }
                // 0 confronto con 1
                if (numeroMinimo <= dati[indice]) {
                    numeroMinimo = dati[indice];
                }

            }
            System.out.println("Il numero massimo è: " + numeroMassimo);
            System.out.println("Il numero minimo è: " + numeroMinimo);
            float media = somma / dati.length;  // elementi 10
            System.out.println("La media è " + media);
            /*
            media = n*(n+1)/2
            10*(10+1)/2 = 5.5
             */

            // determino il minimo

        } catch (IOException ex) {
            System.out.println("Eccezione tipo " + ex.getMessage() + "|" + ex.getCause());
        }
    }

    //USIAMO UN WHILE INFINITO PER LA LETTURA
    /*public void leggiInputStreamConEccezione(String nomefile) {

        try (FileInputStream fileInputStream = new FileInputStream(nomefile)) {
            //vedere se il file contiene dei dati
            // -1   OPPURE ECCEZIONE  CHE SCATURISCE DALLA LETTURA DI UN FILE VUOTO
            // UTILIZZO DELLA LETTURA DEL VALORE RITORNATO:  -1 FINE FILE
            int i= 0;

                while (true) {
                    if ( i==-1){
                        break;
                    }
                    else {
                        i = fileInputStream.read();
                        if ( i==-1){
                            break;
                        }
                        System.out.print((char) i); //  0 - 256

                    }
                }

        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
}



