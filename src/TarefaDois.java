import java.util.Scanner;

public class TarefaDois {
    public static void main(String[] args) throws Exception {
        calcularFibonacci();
    }

    public static void calcularFibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numeroUsuario = sc.nextInt();
        sc.close();

        int numero = 0;
        int cont = 1;
        boolean encontrado = false;

        System.out.println("\nSequência de Fibonacci:");
        while (numero <= numeroUsuario) {
            System.out.println(numero);
            if (numero == numeroUsuario) {
                encontrado = true;
                break;
            }
            int soma = cont + numero;
            numero = cont;
            cont = soma;
        }

        if (encontrado) {
            System.out.println("Número digitado presente no Fibonacci!");
        } else {
            System.out.println("Número digitado NÃO está presente no Fibonacci.");
        }
    }
}
