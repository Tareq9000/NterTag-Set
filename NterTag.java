package nterTag;

import java.util.Scanner;

public class NterTag {

	int[] zwoelf = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int tag = 32;
	int monat = 13;
	int jahr = 0;
	int zwjahr;
	int res;

	public static void main(String[] args) {

		NterTag p = new NterTag();
		Scanner scan = new Scanner(System.in);

		System.out.println("N-TER TAG IM JAHR");
		System.out.println("-----------------");

		while (p.monat > 12) {
			System.out.println("Geben Sie den Monat ein > ");
			p.monat = scan.nextInt();
		}
		while (p.tag > p.zwoelf[p.monat]) {
			System.out.println("Geben Sie den Tag ein > ");
			p.tag = scan.nextInt();
		}
		while (p.jahr < 19) {
			System.out.println("Geben Sie das Jahr ein > ");
			p.jahr = scan.nextInt();
		}
		
		p.tagNr();

		System.out.print(p.res+"-ter Tag des Jahres "+p.jahr);
	}

	public void tagNr() {

		zwjahr = jahr - 2020;
		
		if(zwjahr%4 == 0 && zwjahr%100 != 0 && zwjahr%400 == 0) {
			zwoelf[2] += 1;
		}
		
		monat--;
		
		for (int i = 0; i <= monat; i++) {

			res += zwoelf[i];
		}
		res += tag;
	}
}