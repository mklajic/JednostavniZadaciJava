package zad;

//Napravite program koji �e za zadane stranice pravokutnika izra�unati njegov opseg i povr�inu.

import java.util.Scanner;

public class OpsegPovrsinaPravokut {

	private Scanner ulaz;

	public OpsegPovrsinaPravokut() {
		ulaz = new Scanner(System.in);
		zadatak();
		ulaz.close();

	}

	private void zadatak() {
		System.out.println("Unesite stranicu a:");
		double a=ulaz.nextDouble();
		System.out.println("Unesite stranicu b:");
		double b=ulaz.nextDouble();
		double O,P;
		
		O=2*(a+b);
		P=a*b;
		
		System.out.println("Opseg pravokutnika je: " + O + " m");
		System.out.println("Povr�ina pravokutnika je: " + P + " m2");
	}

	public static void main(String[] args) {
		new OpsegPovrsinaPravokut();
	}
}
