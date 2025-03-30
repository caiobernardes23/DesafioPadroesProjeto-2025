public class App {
    public static void main(String[] args) throws Exception {
        CodificadorSimples codS = new CodificadorSimples();
        CodificadorDesloca codD = new CodificadorDesloca();

        String aux = "Desafio Padrões de Projeto";

        System.out.println(aux);
        aux = codS.codifica(aux);
        System.out.println(aux);
        aux = codS.decodifica(aux);
        System.out.println(aux);
        aux = codD.codifica(aux);
        System.out.println(aux);
        aux = codD.decodifica(aux);
        System.out.println(aux);
    }
}