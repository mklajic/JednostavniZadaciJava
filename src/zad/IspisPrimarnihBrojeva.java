package zad;

import java.util.Scanner;

public class IspisPrimarnihBrojeva {

	private Scanner ulaz;

	public IspisPrimarnihBrojeva() {
		ulaz = new Scanner(System.in);
		odradiPosao();
		ulaz.close();

	}

	private void odradiPosao() {
		System.out.println("Unesite prvi broj");
		int a = ulaz.nextInt();
		System.out.println("Unesite drugi broj");
		int b = ulaz.nextInt();

		int pocetak, kraj;
		if (a > b) {
			pocetak = b;
			kraj = a;
		} else {
			pocetak = a;
			kraj = b;
		}

		for (int i = pocetak; i <= kraj; i++) {
			if ((i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
					|| (i == 3 || i == 5 || i==7)) {
				System.out.println(i);
			} else {

			}

		}
	}

	public static void main(String[] args) {
		new IspisPrimarnihBrojeva();
	}
}
