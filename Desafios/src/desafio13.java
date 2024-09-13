import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio13 {
    public static void main(String[] args) {
        // Crie a lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int minimo = 5;
    int maximo = 10;

        List<Integer> numeroDeIntervalo = numeros.stream()
                .filter(numero -> numero >= minimo && numero <= maximo)
                .toList();

        System.out.println("O intervalo de " +minimo+ " e " + maximo + " é " +numeroDeIntervalo );


    }
}