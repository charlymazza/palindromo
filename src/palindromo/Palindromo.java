package palindromo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

public class Palindromo{
	
	
	//funcion que dice si es palindromo o no//
	
	public static boolean esPalindromo(String palabra){
		//palabra es un elemento del vector//
		
		int i = 0;
		int j = palabra.length()-1;
		
		while(i<j/2){
			if(palabra.charAt(i)==palabra.charAt(j)){
				i++;
				j--;				
			}else{
				return false;
			}
		}
		
		
		return true;
	}
	
	

 
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
 
 
 String palabra="carlos";
 
 System.out.println(esPalindromo(palabra));

 }

}