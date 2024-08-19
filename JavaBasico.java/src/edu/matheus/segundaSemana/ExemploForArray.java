package edu.matheus.segundaSemana;

public class ExemploForArray {

    public static void main(String[] args) {
        

        /**for ( int x = 0 ; x < alunos.length ; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x] );
        }*/

        String alunos [] = {"Matheus", "Joana", "Marcos", "Felipe"};

        for(String aluno : alunos) {
            System.out.println(aluno);
          } 
    }
    
}
