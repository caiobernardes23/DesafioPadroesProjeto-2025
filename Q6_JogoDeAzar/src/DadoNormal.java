import java.util.Random;

public class DadoNormal implements Dado{
    private int lados;
    private int valorJogada;
    private final Random random;

    public DadoNormal(int lados) {
        this.lados = lados;
        this.random = new Random();
    }
    @Override
    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }
    @Override
    public int getValor() {
        return valorJogada;
    }
}
