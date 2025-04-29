package edu.miguel.thirdweek;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        double valorDefinido = 20.0;
        
        while (mesada > 0) {
            Double valorDoce = valorDefinido;
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valord: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada:" + mesada);
        System.out.println("Juan gastou toda sua mesada em doces");
    }
}
