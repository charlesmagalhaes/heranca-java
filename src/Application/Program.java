package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Contribuinte;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int numeroContribuintes = sc.nextInt();
		
		for (int i=0; i<numeroContribuintes;i++) {
			
			System.out.println("Tax payer #1 data:");
			System.out.println("Individual or company (i/c)?");
			char tipo = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if (tipo == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, numeroFuncionarios));
			}
			
			
		}
			
			
			double sum = 0.0;
			System.out.println();
			System.out.println("TAXES PAID:");
			for (Contribuinte tp : list) {
				double tax = tp.calculoTaxa();
				System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
				sum += tax;
		
			}
		
		   System.out.println();
		   System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();

	}

}
