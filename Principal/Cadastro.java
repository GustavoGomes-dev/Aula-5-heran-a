package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aulao6.Conta;
import aulao6.ContaCorrente;
import aulao6.ContaPoupança;

public class Cadastro {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		while(true) {
		System.out.println("Digite seu nome: ");
		String nome = scn.next();
		
		System.out.println("Digite seu saldo: ");
		double saldo = scn.nextInt();
		
		System.out.println("Digite numero da conta: ");
		int num = scn.nextInt();
		
		System.out.println("Digite o limite: ");
		double limite = scn.nextDouble();
		
		Conta x = new ContaPoupança(num, nome, saldo);	
		Conta y = new ContaCorrente(num, nome, saldo, limite);
		
		
		System.out.println("Opções:");
		System.out.println("1. Conta Corrente");
		System.out.println("2. Conta Poupança");
    	System.out.println("3. Sair");
    	System.out.print("Digite a opção desejada: ");
    	int opcao = scn.nextInt();
    	scn.nextLine();
    	
    	switch (opcao) {
        case 1:
            System.out.println("Conta Corrente Criada!!!");
            
         
            break;
        case 2:
           System.out.println("Conta Poupança!!!");
            break;
                case 4:
            System.out.println("Saindo...");
            return;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            

	} if(opcao == 1 ) {
    	List<Conta> lista = new ArrayList<>();
    	lista.add(y);
    	System.out.println(lista);
    

	}else if (opcao == 2) {
		List<Conta> lista = new ArrayList<>();
		lista.add(x);
		System.out.println(lista);
		
		
		
	}
}
}
}

