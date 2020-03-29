import Banco.Cadastro;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cadastro pessoa;
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		char initialDeposit;
		
		do {
			System.out.print("Is there na initial deposit (y/n)? ");
			initialDeposit = sc.next().charAt(0);
		}while (initialDeposit != 'y' && initialDeposit!= 'n');
		
		double Saldo = 0;
		
		if(initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			Saldo = sc.nextDouble();
			pessoa = new Cadastro(numeroConta,nomeTitular,Saldo);
		}
		
		else {
			pessoa = new Cadastro(numeroConta,nomeTitular);
		}
		
		System.out.print(pessoa.toString());
		
		System.out.print("Enter a deposit value: ");
		pessoa.Deposito(sc.nextDouble());
		System.out.print("Update " + pessoa.toString());		
		
		System.out.print("Enter a withdraw value: ");
		pessoa.Saque(sc.nextDouble());
		System.out.print("Update" + pessoa.toString());
		
		sc.close();
	}

}
