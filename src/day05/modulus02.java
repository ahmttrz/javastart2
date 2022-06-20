package day05;

import java.util.Scanner;

public class modulus02 {

	public static void main(String[] args) {
		// kullanıcın gırdıgı yasıısn ilk ve son rakamlarının toplamını yapan bır program yazınız.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("BIR SAYI GIRIN");
		
        
	int sayı = scan.nextInt();
	
	int sonRakam = sayı%10;
	
	int ilkRakam = sayı/1000; // sayımın birinci basamagı
	
	System.out.println(sonRakam + ilkRakam);
	
	
	

	}

}
