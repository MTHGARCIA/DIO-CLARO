import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //usei o set porque ele não permite numeros repetidos.
        Set<Integer> numerosUnicos = new HashSet<>(numeros);

        boolean distintos = numeros.size() == numerosUnicos.size();

        if (distintos) {
            System.out.println("Não tem numero repetido na lista.");
        } else {
            System.out.println("A lista tem números repetidos.");
        }
    }
}