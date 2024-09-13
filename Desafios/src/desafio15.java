import java.util.Arrays;
import java.util.List;



public class desafio15 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, -7, 8, 9, 10);

        boolean temAlgumNegativo = numeros.stream()
                .anyMatch(n -> n < 0);

        if(temAlgumNegativo){
            System.out.println("a lista tem um ou mais número negativo");
        }else {
            System.out.println("a lista não contem numero negativo");
       }
    }
}
