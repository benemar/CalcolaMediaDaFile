import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ScriviOutputStream {
    Scanner scanner;
public void scriviSuFile(String path){
    scanner = new Scanner(System.in);
    File file = new File(path)  ;

           try (FileOutputStream outputStream = new FileOutputStream(file,true)){
               // scanner per inserimento dati
               System.out.println("Inserisci dieci numeri");
               for (int i= 0 ;i<10; i++){
                   System.out.println("inserimento n° " + (i+1));
                   String carattere = scanner.next();
                   outputStream.write(carattere.getBytes());
                   if (i!=9){
                       outputStream.write(",".getBytes());
                   }

               }
        } catch (IOException e) {
               System.out.println("generata eccezione " + e.getMessage());
        }
           finally {
               System.out.println("Fine inserimento");
           }
      }

    }


