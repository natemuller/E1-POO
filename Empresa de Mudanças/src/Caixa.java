public class Caixa {
    private String numSerie;
    private String funcResponsavel;
    private int qtdItens;
    private double valorTotal = 0.0;

    public Caixa (String numSerie, String funcResponsavel, int qtdItens) {
        this.numSerie = numSerie;
        this.funcResponsavel = funcResponsavel;
        this.qtdItens = qtdItens;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public int qtdItens () {
        return qtdItens;
    }

    public double valorTotal () {
        return valorTotal;
    }

    public String getFuncResponsavel () {
        return funcResponsavel;
    }

    public void adicionarObjeto (Objeto obj) {
        valorTotal += obj.getValorEstimado();
    }

    public void imprimirEtiqueta () {
        System.out.println("ID etiqueta: 100" + numSerie);
        System.out.println("Funcionario responsavel: " + funcResponsavel);
        System.out.println("Quantidade de itens: " + qtdItens);
        System.out.println("Valor total: R$ " + valorTotal);
    }
}

// Nome completo: Natan de Aragão Müller
// Auto-avaliação: 8.5
// Comentário sobre desempenho: Creio que falte fluidez na hora de escrever o código, muitos erros desnecessários de sintaxe, estou satisfeito com o resultado. 