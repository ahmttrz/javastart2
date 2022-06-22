package day08;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*kullanıcıdan bir sayı alın
		 * bu sayı pozitif ise 9 dan buyuk mu diye kontroledın
		 * sayı 9 dan <= && 0>= ise "RAKAM" yazdır.
		 * bu sayı negatif ise ekrana "Sayı" yadır.	
		 */
      Scanner scan= new Scanner(System.in);
      System.out.println("bir sayi girin");
      int sayi= scan.nextInt();
      if(sayi>=0) {
    	  if(sayi>9) {
    		  System.out.println("sayi");
    	  }
    	  
    	  if(sayi>=0 && sayi<=9) {
    		  System.out.println("rakam");
    		  if(sayi<0) {
    			System.out.println("sayi");
    		  }else if(sayi<0) {
    			  System.out.println("sayi");
    			  
    		  }
    	  }
      }
      
	}

}
