package edu.matheus.primeirasemana;

public class OperadoresUnarios1 {
    public static void main(String[] args) {
        int numero = 5;

        //x repeticao
        numero++;
       // numero = numero +2;

        

        System.out.println(numero++); //--
        System.out.println(++numero); //--

        System.out.println(numero);


        boolean variavel = true;

       //System.out.println(!variavel); //false valor em memoria
        
        variavel = !variavel;
        System.out.println(variavel); 

    }
    
}
