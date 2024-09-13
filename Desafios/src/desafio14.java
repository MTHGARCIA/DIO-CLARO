import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

//fiz um teste para entender melhor o .filter usando a classe. pegando o numero dels sem expecificar a variavel ou lista

class Desafio14 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        OptionalInt maiorNumeroPrimo = numeros.stream()
                .filter(Desafio14::isPrimo)
                .mapToInt(Integer::intValue)
                .max();


        if (maiorNumeroPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorNumeroPrimo.getAsInt());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    // Método para verificar se um número é primo
    private static boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
