import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class desafio12 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long produto = numeros.stream()
                .mapToLong(Integer::longValue)
                .reduce(1,(a,b) -> a * b);

        System.out.println("a soma dos produtos é: " + produto );


    }
}