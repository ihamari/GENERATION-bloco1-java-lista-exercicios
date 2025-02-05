package modulo6;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, n4;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("número1: ");
		n1 = leia.nextFloat();
		
		System.out.print("número2: ");
		n2 = leia.nextFloat();
		
		System.out.print("número3: ");
		n3 = leia.nextFloat();
		
		System.out.print("número4: ");
		n4 = leia.nextFloat();
		
		float resultado = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: " + resultado);

	}

}
