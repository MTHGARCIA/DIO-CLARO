package edu.matheus.primeiraSemana;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Matheus";
        String nomeDois = "Matheus";

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));




        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = numero1 == numero2;

    if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2 " + simNao);
        
            //simNao = numero1 > numero2;

    if(numero1 < numero2)
            System.out.println("Numero 1° menor que numero 2 " + simNao);
        
            //simNao = numero1 < numero2;
            
    if(numero1 >= numero2)
            System.out.println("Numero 1° maior ou igual que numero 2 " + simNao);

            //simNao = numero1 <= numero2;

    if(numero1 <= numero2)
            System.out.println("Numero 1° menor ou igual que numero 2° " + simNao);
        
            //simNao = numero1 != numero2;

    if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2° " + simNao);


    }
    
}
