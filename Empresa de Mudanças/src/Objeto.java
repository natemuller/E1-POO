class Objeto {
    private String id;
    private String descricao;
    private double valorEstimado;

    public Objeto(String id, String descricao, double valorEstimado) {
        this.id = id;
        this.descricao = descricao;
        this.valorEstimado = valorEstimado;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getId() {
        return id;
    }
}