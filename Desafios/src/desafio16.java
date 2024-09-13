import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class desafio16 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Map<String , List<Integer>> numerosAgrupados = numeros.stream()
            .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Pares" : "Impares"));
    /* esse metodo utilizado foi achado no Stack Overflow, não foi copiado eu li o cometario sobre o goupinBy
     e a formatação do Map para String e resolvi testar e deu certo.*/

        System.out.println("Numeros pares: " + numerosAgrupados.get("Pares"));
        System.out.println("Numeros impares: " + numerosAgrupados.get("Impares"));

    }
}