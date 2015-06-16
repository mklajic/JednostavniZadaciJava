package zad;

import java.util.Scanner;

public class IspisParnih {

	private Scanner ulaz;
	
	
	public IspisParnih(){
	
		ulaz=new Scanner(System.in);
		odradiPosao();
		ulaz.close();
	}
	
	private void odradiPosao() {
		System.out.println("Upišite broj" );
		int x=ulaz.nextInt();
				
		for(int i=0;i<=x;i++){
			if(i%2==0){
				System.out.println(i);
			}
			else{
				continue;
			}
		}
		
	}

	public static void main(String[] args) {
		new IspisParnih();
	}
}
