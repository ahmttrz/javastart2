 package day07;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		/*Kullanıcıdan password girmesini iste
		 *Password dogru ise ekrabna "Password Dogru" yazdır.
		 *Password yanlis ise ekrana "Password Yanlıs" yazdır.  
		 *dogru password = Java2020    
		 */
     Scanner scan = new Scanner(System.in);
     System.out.println("Password Gir");
     String pass = scan.next();
// stringlerin eşitligin kontrol ederken adresleri degil degerleri control etmemiz lazım .onun 
     //icin .eqals(çççççç) yı kullanmamız lazım.
     
    if(pass.equals("Java2020")) {
    	System.out.println("Password Dogru");
    }else {
    	System.out.println("Password Yanlis");
    }
     
     
		
		
		
		
	}

}
