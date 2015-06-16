package zad;

// Napravite program koji æe za zadane dvije toèke u pravokutnom koordinatnom 
// sustavu izraèunati i ispisati na zaslon njihovu udaljenost.

import java.util.Scanner;

public class UdaljenostTocaka {

	private Scanner ulaz;
	
	public UdaljenostTocaka(){

		ulaz= new Scanner(System.in);
		unesiKoordinate();
		ulaz.close();
	}
	
	private void unesiKoordinate() {
		System.out.println("Unesite apscisu prve toèke:");
		double ax=ulaz.nextDouble();
		System.out.println("Unesite ordinatu prve toèke:");
		double ay=ulaz.nextDouble();
		System.out.println("Unesite apscisu druge toèke:");
		double bx=ulaz.nextDouble();
		System.out.println("Unesite ordinatu druge toèke:");
		double by=ulaz.nextDouble();
		
		double udaljenost;
		
		udaljenost=Math.abs((bx-ax)) + Math.abs((by-ay));
		
		System.out.println(udaljenost);
		
	
	}


	public static void main(String[] args) {
		new UdaljenostTocaka();
	}
}
