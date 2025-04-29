package edu.miguel.secondweek;
public class MinhaClasse {
    public static void main(String[] args) {
        String firstName = "Miguel";
        String secondName = "Melo";

        String fullName = fullName(firstName, secondName);
        System.out.println(fullName);
    }

    public static String fullName(String firstName, String secondName){
        return "Resultado do metodo: " + firstName.concat(" ").concat(secondName);
    }
}