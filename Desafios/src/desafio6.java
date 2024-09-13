
import java.util.Arrays;
import java.util.List;

public class desafio6 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maioresQueDez = numeros.stream()
                .filter(numero -> numero > 10)
                .toList();

        System.out.println("Números maiores que 10:");
        for (Integer numero : maioresQueDez) {
            System.out.println(numero);
        }
    }
}