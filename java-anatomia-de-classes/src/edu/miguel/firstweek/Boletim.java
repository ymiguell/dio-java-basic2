package edu.miguel.firstweek;
public class Boletim {
    public static void main(String[] args) {
        int finalMedia = 7;
        if (finalMedia < 6) {
            System.out.println("REPROVADO");
        } else if (finalMedia == 6) {
            System.out.println("PROVA MINERVA");
        } else {
            System.out.println("APROVADO");
        }
    }
}
