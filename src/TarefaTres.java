// Não achei nenhum json ou xml como estava descrito no enunciado. Então acabei inventando dados de faturamento.
// Evitei usar static no código

public class TarefaTres {

    private double[] faturamento = new double[11];
    private double mediaMensal;

    public static void main(String[] args) {
        TarefaTres tarefaTres = new TarefaTres();
        tarefaTres.executar();
    }

    public void executar() {
        faturamento[0] = 1220;
        faturamento[1] = 10000;
        faturamento[2] = 0;
        faturamento[3] = 900;
        faturamento[4] = 8000;
        faturamento[5] = 100;
        faturamento[6] = 0;
        faturamento[7] = 1550;
        faturamento[8] = 1234.9;
        faturamento[9] = 1222.99;
        faturamento[10] = 850.50;
        // São apenas 11 dias só como um exemplo

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: " + menorFaturamento());
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + maiorFaturamento());
        mediaFaturamento();
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: "
                + numeroDias());
    }

    public double menorFaturamento() {
        double menorValor = faturamento[0];
        for (double valor : faturamento) {
            if (valor < menorValor) {
                menorValor = valor;
            }
        }
        return menorValor;
    }

    public double maiorFaturamento() {
        double maiorValor = faturamento[0];
        for (double valor : faturamento) {
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }
        return maiorValor;
    }

    public double mediaFaturamento() {
        double soma = 0;
        for (double valor : faturamento) {
            soma = soma + valor;
        }
        mediaMensal = soma / faturamento.length;
        return mediaMensal;
    }

    public int numeroDias() {
        int numDias = 0;
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                numDias++;
            }
        }
        return numDias;
    }

}
