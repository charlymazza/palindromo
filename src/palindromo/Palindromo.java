package palindromo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

public class Palindromo{

 
 public static void main(String[] args) throws FileNotFoundException {
 
 String miPath = "/media/alumno/PEN AZ-BCO/PROGRAMACION III/workspace/Problema_1/src/";
 Scanner sc = new Scanner(new File(miPath+"palin.in"));
 sc.useLocale(Locale.ENGLISH);
 String [] vec = new String[sc.nextInt()]; //   leo 1er numero y creo vector para almacenar la lectura
 
 for (int i = 0; i < vec.length ; i++) {
 vec[i] =sc.next() ;
 System.out.println( vec[i]);
 }
 
 sc.close();

 }

}