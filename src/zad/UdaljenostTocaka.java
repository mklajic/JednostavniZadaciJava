package zad;

// Napravite program koji �e za zadane dvije to�ke u pravokutnom koordinatnom 
// sustavu izra�unati i ispisati na zaslon njihovu udaljenost.

import java.util.Scanner;

public class UdaljenostTocaka {

	private Scanner ulaz;
	
	public UdaljenostTocaka(){

		ulaz= new Scanner(System.in);
		unesiKoordinate();
		ulaz.close();
	}
	
	private void unesiKoordinate() {
		System.out.println("Unesite apscisu prve to�ke:");
		double ax=ulaz.nextDouble();
		System.out.println("Unesite ordinatu prve to�ke:");
		double ay=ulaz.nextDouble();
		System.out.println("Unesite apscisu druge to�ke:");
		double bx=ulaz.nextDouble();
		System.out.println("Unesite ordinatu druge to�ke:");
		double by=ulaz.nextDouble();
		
		double udaljenost;
		
		udaljenost=Math.abs((bx-ax)) + Math.abs((by-ay));
		
		System.out.println(udaljenost);
		
	
	}


	public static void main(String[] args) {
		new UdaljenostTocaka();
	}
}
