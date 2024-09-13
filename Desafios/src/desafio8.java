import java.util.Arrays;
import java.util.List;

public class desafio8 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        //achei melhor formatar o numero em unicode para praticar. mas não tem nescessidade alguma.

        int somaDosDigitos = numeros.stream()
                .flatMapToInt(num ->{
                    return String.valueOf(num)
                            .chars()
                            .map(c -> c - '0');
                })
                .sum();
        System.out.println("A soma dos dígitos é: " + somaDosDigitos);
    }
}
