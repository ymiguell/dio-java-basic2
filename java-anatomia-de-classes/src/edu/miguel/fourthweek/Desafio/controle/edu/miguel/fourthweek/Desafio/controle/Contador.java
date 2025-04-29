package edu.miguel.fourthweek.Desafio.controle.edu.miguel.fourthweek.Desafio.controle;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Insira o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
		System.out.println("Insira o segundo parametro: ");
        int parametroDois = terminal.nextInt();

		try {
            //chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            //realizar o for para imprimir os números com base na variável contagem
            System.out.println("Imprimindo o número: " + i);
        }
    }

}
