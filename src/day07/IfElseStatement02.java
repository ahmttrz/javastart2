package day07;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir tam sayı iste ve onun mutlak degerini ekrana yazdırın 
		 *  mutlak sayı bir sayının kendi israti ile carpılması demektırç.
		 */
         Scanner scan = new Scanner(System.in);
         System.out.println("Bir Tam Sayi Gir.");
           int z = scan.nextInt();
           System.out.println("SAYININ MUTLAK DEGERI");
           if(z<0) {
        	   System.out.println(z*(-1));
           }else {
        	   System.out.println(z);
           }
           if(z==0) {
        	   System.out.println(0);
           }
	}

}
