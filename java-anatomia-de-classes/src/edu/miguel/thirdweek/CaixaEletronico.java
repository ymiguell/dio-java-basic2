package edu.miguel.thirdweek;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
            
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(" NOVO SALDO: " + saldo);
        } else {
            System.out.println(" saldo insuficiente");
        }

        
    }
}
