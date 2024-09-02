import java.util.Scanner;

public class TarefaCinco {
    public static void main(String[] args) {
        TarefaCinco tarefaCinco = new TarefaCinco();
        tarefaCinco.executar();
    }

    public void executar() {
        System.out.println("Digite uma palavra:");
        Scanner sc = new Scanner(System.in);
        String palavra = sc.next();
        sc.close();
        System.out.println("String: " + palavra);
        System.out.println("String invertida: " + inverteString(palavra));
    }

    public String inverteString(String palavra) {
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        return invertida.toLowerCase();
    }
}
