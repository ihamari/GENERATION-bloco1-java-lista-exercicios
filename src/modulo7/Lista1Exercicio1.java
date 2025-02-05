package modulo7;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.print("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.print("Digite o número C: ");
		c = leia.nextInt();
		
		int soma = a + b;
		
		if(soma > c ) {
			System.out.println(b + " + " + a + " = " + soma + " > " + c);
			System.out.println("A Soma de A + B é Maior do que C");
		}else if(soma < c){
			System.out.println(b + " + " + a + " = " + soma + " < " + c);
			System.out.println("A Soma de A + B é Menor do que C");
		}else {
			System.out.println(b + " + " + a + " = " + soma + " = " + c);
			System.out.println("A Soma de A + B é Igual a C");
		}

	}

}
