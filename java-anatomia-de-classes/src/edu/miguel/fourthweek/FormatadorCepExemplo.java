package edu.miguel.fourthweek;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237650642    ");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep n corresponde com as regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "23.765-064";
    }

}
