public class App {
    public static void main(String[] args) {
        DadoNormal d6 = new DadoNormal(6);
        DadoNormal d20 = new DadoNormal(20);
        d6.rolar();
        d20.rolar();
        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());

        Dado dadoComHistorico = new DadoComHistorico(d6);
        
        dadoComHistorico.rolar();
        dadoComHistorico.rolar();
        dadoComHistorico.rolar();
        
        System.out.println("Último valor do D6: " + dadoComHistorico.getValor());
        System.out.println("Histórico do D6: " + ((DadoComHistorico) dadoComHistorico).getHistorico());
    }
}
