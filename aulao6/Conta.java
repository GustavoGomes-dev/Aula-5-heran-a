package aulao6;

public class Conta {
	private int numero;
	
	private String nome ;
	
	private double saldo;
	
	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}



	public int getNumero() {
		return numero;
	}

	
	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double saque (double saque) {
		return saldo -= saque;
		
	}
	
	public double depositar(double deposito) {
		return saldo += deposito;
	}

	public String mostrar() {
		return "  nome :" + nome + "\nO saldo é: " + saldo + "\nNumero da Conta: " + numero;
	}
	
	
}
