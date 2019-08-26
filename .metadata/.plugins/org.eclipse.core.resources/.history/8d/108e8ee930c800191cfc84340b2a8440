package Lote01;

import java.util.Scanner;

public class ProgramacaoLinear {
	public static void main(String[] args) {

		System.out.println("Digite o número do exercício desejado: ");

		Scanner sc = new Scanner(System.in);
		int ex = sc.nextInt();

		switch (ex) {
		case 1:
			Ex01();
			break;
		case 2:
			Ex02();
			break;
		case 3:
			Ex03();
			break;
		case 4:
			Ex04();
			break;
		case 5:
			Ex05();
			break;
		case 6:
			Ex06();
			break;
		case 7:
			Ex07();
			break;
		case 8:
			Ex08();
			break;
		}

		sc.close();
	}

	public static void Ex01() {

		System.out.println("Digite o valor do lado do quadrado: ");

		Scanner sc = new Scanner(System.in);
		int lado = sc.nextInt();
		sc.close();

		double area = Math.pow(lado, 2);

		System.out.println("A area do quadrado é: " + area);
	}

	public static void Ex02() {

		System.out.println("Digite o salário do funcionário: ");

		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		sc.close();

		salario = salario * 1.15;

		System.out.println("Seu novo salário é: " + salario);
	}

	public static void Ex03() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a base do triângulo: ");
		int base = sc.nextInt();

		System.out.println("Digite a altura do triângulo: ");
		int altura = sc.nextInt();

		sc.close();

		float area = base * altura / 2;

		System.out.println("Sua área é: " + area);
	}

	public static void Ex04() {

		System.out.println("Digite a temperatura em graus Celsius: ");

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.close();

		float f = (9 * c + 160) / 5;

		System.out.println("Sua temperatura em fahrenheit: " + f);
	}

	public static void Ex05() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de 'a': ");
		int a = sc.nextInt();

		System.out.println("Digite o valor de 'b': ");
		int b = sc.nextInt();

		System.out.println("Digite o valor de 'c': ");
		int c = sc.nextInt();

		sc.close();

		double delta = Math.pow(b, 2) - (4 * a * c);

		if (delta < 0) {
			System.out.println("Não existem raízes reais");
		} else {
			
			double raiz1 = ((b * -1) + Math.sqrt(delta)) / 2 * a;
			double raiz2 = ((b * -1) - Math.sqrt(delta)) / 2 * a;
			
			System.out.println("As raízes da equação são: ");
			System.out.println("Raiz 1: " + raiz1);
			System.out.println("Raiz 2: " + raiz2);
		}
	}
	
	public static void Ex06() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de 'x': ");
		int x = sc.nextInt();

		System.out.println("Digite o valor de 'y': ");
		int y = sc.nextInt();

		sc.close();
		
		int aux = x;
		x = y;
		y = aux;
		
		System.out.println("Novo valor de 'x': " + x);
		System.out.println("Novo valor de 'y': " + y);
	}
	
	public static void Ex07() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do comprimento: ");
		int c = sc.nextInt();

		System.out.println("Digite o valor da largura: ");
		int l = sc.nextInt();
		
		System.out.println("Digite o valor da altura: ");
		int h = sc.nextInt();

		sc.close();
		
		int v = c * l * h;
		
		System.out.println("Seu volume é: " + v);
	}
	
	public static void Ex08() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor deposito: ");
		int deposito = sc.nextInt();

		sc.close();
		
		double valor = deposito * 1.013;
		
		System.out.println("Seu valor após 1 mês é: " + valor);
	}

}
