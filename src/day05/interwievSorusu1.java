package day05;

import java.util.Scanner;

public class interwievSorusu1 {

	public static void main(String[] args) {
	
		// atanan iki sayıyı depistırme 
		
		
		
Scanner  scan = new Scanner(System.in);
      
       System.out.println("yer degistirecek iki sayi gir");
       
                      double sayı1 = scan.nextDouble();
                      double sayı2 = scan.nextDouble();
                      double sayı3 = 0.0;
      
       System .out.println("yerdegistirmeden onceki sira");
             System.out.println(sayı1);
             System.out.println(sayı2);
		                       sayı3 = sayı1;
		 
	                           sayı1 = sayı2;
		
                               sayı2 = sayı3;
		 
        System.out.println("yer degıştırdıkten sonra");
        
		System.out.println(sayı1);
		
		System.out.println(sayı2);
		
	
		
		
		
	}

}
