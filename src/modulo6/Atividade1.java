package modulo6;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario,abono;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salário: ");
		salario = leia.nextFloat();
		
		System.out.print("Abono: ");
		abono = leia.nextFloat();
		
		double novoSalario = salario + abono;
		
		System.out.printf("Novo Salário: %.2f",novoSalario);
		
		

	}

}
