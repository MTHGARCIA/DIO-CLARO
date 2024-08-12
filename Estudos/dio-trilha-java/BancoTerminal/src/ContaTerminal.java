
import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException; //biblioteca de confiramção usada para verificar a digitação correta do usuario.

public class ContaTerminal {


    public static void main(String[] args){ 
       Scanner scan = new Scanner(System.in).useLocale(Locale.US);

       double saldo = 2500;

      /*  System.out.println("Deseja abrir uma conta? (Digite SIM ou S para confirmar) ");
        String conta = scan.next().toUpperCase();
    
        if (conta.equals("SIM") || conta.equals("S")){
            System.out.println("Digite seu email: ");
            String email = scan.next().toLowerCase();
        }else {
            System.out.println("Digite apenas seu email. ");
        }

        System.out.println("Digite sua senha em numeros: ");
        int senha = scan.nextInt();

                                                                            usando if para o algoritimo
       System.out.println("Seu saldo é de: " + saldo);

       System.out.println("Deseja retirar qual valor?: ");
       double saque = scan.nextDouble();

       if (saque > saldo){
        System.out.println("Você não possui saldo o suficiente.");
       } else {
        System.out.println("Saque realizado com Sucesso");
        
        saldo -= saque;
        System.out.println("Saldo atual de: " + saldo  );
        
       }*/
       

       while (true) {
        System.out.println("Deseja abrir uma conta? (Digite SIM ou S para confirmar)");
        String account = scan.next().toUpperCase();
        if (account.equals("SIM") || account.equals("S")) {
            break;
        } else if (account.equals("N") || account.equals("NAO")) {
            System.out.println("Fechando o programa.");
            scan.close();
            return;
        } else {
            System.out.println("Entrada inválida. Por favor, digite 'SIM' ou 'S' para abrir a conta ou 'NÃO' ou 'N' para encerrar o programa.");
            break;
        }
    }
    
    System.out.println("Digite seu e-mail: ");
    String email = scan.next().toLowerCase();
    
    int password = 0;
    
    while (true) {
        System.out.println("Digite sua senha em números inteiros: ");
        try {
            password = scan.nextInt();
            break;
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            scan.next(); // Limpar o buffer de entrada
        }
    }
    
    System.out.println("Seu saldo é de: " + saldo);
    
    double withdrawal = 0;
    
    while (true) {
        System.out.println("Qual o valor desejado de saque?: ");
        try {
            withdrawal = scan.nextDouble();
            if (withdrawal > saldo) {
                System.out.println("Você não possui saldo suficiente. Tente novamente.");
            } else {
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            scan.next(); // Limpar o buffer de entrada
        }
    }
    
    saldo -= withdrawal;
    System.out.println("Saque realizado com sucesso.");
    System.out.println("Saldo atual de: " + saldo);

}
}
