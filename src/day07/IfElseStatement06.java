package day07;

import java.util.Scanner;

public class IfElseStatement06 {

	public static void main(String[] args) {
		/*Kullanıcıdan "6 basamaklı bir sayı girin "
		 * Kazanma ihtimali %20 ,amorti ihtimal %30, kaybetme ihtimali % 50 olan bir
		 * jackpot oyunu için program yazınız
		 * 
		 */
 Scanner scan = new Scanner(System.in);
 System.out.println("6 basamaklı bir sayı girin ");
 int s = scan.nextInt();
  if(s<=199999){
	  System.out.println("Kazandın!");
  }else if(s>=200000 & s<=49999) {
	  System.out.println("AMORTI KAZANDINIZ!");
  }else if (s>=50000 && s<=999999) {
	  System.out.println("KAYBETTINIZ");
  }
 
 

 
 
 
 
	}

}
