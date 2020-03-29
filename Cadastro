package Banco;

public class Cadastro {
	private int numeroConta;
	private String nomeTitular;
	private double Saldo;
	
	public Cadastro(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public Cadastro(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		Deposito(depositoInicial) ;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void Deposito(double deposito) {
		Saldo +=deposito;
	}
	public void Saque(double saque) {
		Saldo -=(saque+5);
	}
	public String toString() {
		return "Account data:\n" + "Account " + getNumeroConta() + ", Holder:" + getNomeTitular() + ", Balance: $ " + String.format("%.2f", getSaldo()) + "\n"; 
	}
}
