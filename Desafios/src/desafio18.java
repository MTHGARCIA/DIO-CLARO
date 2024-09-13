import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio18{
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
                .distinct()
                .count() == 1;

        // Exiba o resultado no console
        if (todosIguais) {
            System.out.println("Todos os números da lista são iguais.");
        } else {
            System.out.println("Nem todos os números da lista são iguais.");
        }
    }
}