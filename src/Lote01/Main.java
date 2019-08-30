package Lote01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Digite o número do exercício desejado: ");

		Scanner sc = new Scanner(System.in);
		int ex = sc.nextInt();
		
		ProgramacaoLinear programacaoLinear = new ProgramacaoLinear();

		switch (ex) {
		case 1:
			programacaoLinear.Ex01();
			break;
		case 2:
			programacaoLinear.Ex02();
			break;
		case 3:
			programacaoLinear.Ex03();
			break;
		case 4:
			programacaoLinear.Ex04();
			break;
		case 5:
			programacaoLinear.Ex05();
			break;
		case 6:
			programacaoLinear.Ex06();
			break;
		case 7:
			programacaoLinear.Ex07();
			break;
		case 8:
			programacaoLinear.Ex08();
			break;
		case 11:
			programacaoLinear.Ex11();
			break;
		case 12:
			programacaoLinear.Ex12();
			break;
		case 13:
			programacaoLinear.Ex13();
			break;
		case 14:
			programacaoLinear.Ex14();
			break;
		case 15:
			programacaoLinear.Ex15();
			break;
		}

		sc.close();
	}
}
