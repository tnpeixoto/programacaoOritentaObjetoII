import java.util.ArrayList;
import java.util.Scanner;

public class Acao extends Ativo {

    private double precoLucro;

    public Acao(String cod, double ctc, double pl) {
        super(cod, ctc);
        this.setPrecoLucro(pl);
    }

    public double getPrecoLucro() {
        return precoLucro;
    }

    public void setPrecoLucro(double precoLucro) {
        this.precoLucro = precoLucro;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
