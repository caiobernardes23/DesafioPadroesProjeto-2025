import java.util.*;
class DadoComHistorico implements Dado {
    private Dado dadoDecorado;
    private List<Integer> historico;

    public DadoComHistorico(Dado dadoDecorado) {
        this.dadoDecorado = dadoDecorado;
        this.historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        dadoDecorado.rolar();
        historico.add(dadoDecorado.getValor());
    }

    @Override
    public int getValor() {
        return dadoDecorado.getValor();
    }

    public List<Integer> getHistorico() {
        return new ArrayList<>(historico);
    }
}