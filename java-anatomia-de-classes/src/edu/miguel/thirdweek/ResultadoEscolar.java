package edu.miguel.thirdweek;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 2;

        if (nota >= 7) {
            System.out.println(" APROVADO");
        } else if (nota >= 5 && nota < 7){
            System.out.println(" PROVA DE RECUPERAÇÃO");
        } else {
            System.out.println(" REPROVADO");
        }
    }
}
