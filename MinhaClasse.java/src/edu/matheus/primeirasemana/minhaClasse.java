package edu.matheus.primeirasemana;
public class minhaClasse {
    public static void main(String[] args) throws Exception {
        
        String primeiroNome = "Matheus";
        String segundoNome = "Garcia";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);        
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do Método " +primeiroNome.concat(" ").concat(segundoNome);
    }
}
