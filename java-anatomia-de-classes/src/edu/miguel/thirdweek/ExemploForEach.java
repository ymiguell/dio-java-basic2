package edu.miguel.thirdweek;

public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "MIGUEL", "NEGAO", "JUNQUEIRA"};
        for(String aluno : alunos){
            System.out.println("Nome do aluno é : " + aluno);
        }
    }
}
