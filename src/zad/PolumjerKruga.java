package zad;

import java.util.Scanner;

/*
 *  Napravite program koji �e za zadani polumjer kruga ispisati njegov opseg i povr�inu.
 */
public class PolumjerKruga {

	private Scanner ulaz;

	public PolumjerKruga() {
		ulaz=new Scanner(System.in);
		zadatak();
		ulaz.close();

	}

	private void zadatak() {
		System.out.println("Unesite polumjer kruga");
		double r=ulaz.nextDouble();
		double pi=3.14;
		double O, P;
		O=2*r*pi;
		P=r*r*pi;
		
		System.out.println("Opseg je: " + O + " m");
		System.out.println("Povr�ina je: " + P + " m2");
		
		
	}

	public static void main(String[] args) {
		new PolumjerKruga();
	}
}
