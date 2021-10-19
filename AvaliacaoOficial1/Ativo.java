public abstract class Ativo {
    private String ticker;
    private double cotacao;

    public Ativo(String cod, double ctc) {
        this.setTicker(cod);
        this.setCotacao(ctc);
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }
}

