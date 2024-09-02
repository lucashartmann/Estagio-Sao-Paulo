import java.text.DecimalFormat;

/**
 * • SP – R$67.836,43
 * • RJ – R$36.678,66
 * • MG – R$29.229,88
 * • ES – R$27.165,48
 * • Outros – R$19.849,53
 * 
 * Escreva um programa na linguagem que desejar onde calcule o percentual de
 * representação que cada estado teve dentro do valor total mensal da
 * distribuidora.
 */

public class TarefaQuatro {

    private double valorTotal;
    private double sp = 67836.43;
    private double rj = 36678.66;
    private double mg = 29229.88;
    private double es = 27165.48;
    private double outros = 19849.53;

    public static void main(String[] args) {
        TarefaQuatro tarefaQuatro = new TarefaQuatro();
        tarefaQuatro.executar();
    }

    public void executar() {
        valorTotalFaturamento();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(
                "Percentual de representação que cada estado teve dentro do valor total mensal da distribuidora:");
        System.out.println("SP: " + df.format(percentual(sp)) + "%");
        System.out.println("RJ: " + df.format(percentual(rj)) + "%");
        System.out.println("MG: " + df.format(percentual(mg)) + "%");
        System.out.println("ES: " + df.format(percentual(es)) + "%");
        System.out.println("Outros: " + df.format(percentual(outros)) + "%");
    }

    public double valorTotalFaturamento() {
        valorTotal = sp + rj + mg + es + outros;
        return valorTotal;
    }

    public double percentual(double valorEstado) {
        double percentual = (valorEstado * 100) / valorTotal;
        return percentual;
    }
}
