import java.util.Arrays;
import java.util.List;





public class desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        final int[] soma = {0};
        final int[] contador = {0};

        numeros.stream()
                .filter(numero -> numero > 5)
                .forEach(numero ->{
                    soma[0] += numero;
                    contador[0]++;
                });

        if (contador[0] >0){
            double media = (double) soma[0] / contador[0];
            System.out.println("A media dos numeros maiores que 5 é: " + media);
        }else {
            System.out.println("Não há números maiores que 5. ");
        }



    }
}
