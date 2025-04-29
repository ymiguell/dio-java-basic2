package edu.miguel.thirdweek;

public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >7 ? "aprovado" : nota >= 5 && nota < 7 ? "recuperacap" : "reprovado";
        System.out.println(resultado);
    }
}
