package modulo6;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioBruto, adicionalNoturno, horasExtras, descontos, valorHoraExtra;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("descontos: ");
		descontos = leia.nextFloat();
		
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos; 
		
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);
		
	}

}
