import java.util.List;

public class App {
    public static void main(String[] args){
        VendasFachada proc = new VendasEmMemoria();
        List<Produto> produtos = proc.buscarProdutos();
        Venda venda1 = proc.iniciarVenda();
        proc.registrarVenda(venda1, produtos.get(0).getId(), 1);
        proc.registrarVenda(venda1, produtos.get(1).getId(), 2);
        System.out.println("Comprovante de Venda Simples:");
        System.out.println(proc.emitirComprovante(venda1));

        CompositeVenda compositeVenda = new CompositeVenda();
        compositeVenda.addAoKit(proc);

        VendasFachada proc2 = new VendasEmMemoria();
        Venda venda2 = proc2.iniciarVenda();
        proc2.registrarVenda(venda2, produtos.get(2).getId(), 1);
        compositeVenda.addAoKit(proc2);

        System.out.println("\nComprovante de Venda Composta (Kit de Produtos):");
        compositeVenda.vendaKit(venda1);
    }
}
