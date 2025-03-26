import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CompositeVenda implements VendasFachada {
    private ArrayList<VendasFachada>kits=new ArrayList<>();

    public void addAoKit(VendasFachada vendaPossivel){
       kits.add(vendaPossivel);
    }

    public void removeDoKit(VendasFachada vendaFeita){
        kits.remove(vendaFeita);
     }
     public void vendaKit(Venda venda) {
        
        for (VendasFachada itemVendido : kits) {
            itemVendido.registrarVenda(venda, 1, 1);
            System.out.println(itemVendido.emitirComprovante(venda)); 
        }
    }
    
    
    
    @Override
    public Venda iniciarVenda() {
        return new Venda(LocalDateTime.now());
    }

    @Override
    public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
        Produto produto = buscarProdutos().stream()
                .filter(p -> p.getId() == codigoProduto)
                .findFirst()
                .get();
        umaVenda.registrarVenda(produto, quantidade);
    }

    @Override
    public String emitirComprovante(Venda umaVenda) {
        return umaVenda.emitirComprovante();
    }

    @Override
    public List<Produto> buscarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Caneta", 1.55));
        produtos.add(new Produto(2, "Borracha", 1.15));
        produtos.add(new Produto(3, "Caderno", 32.99));
        return produtos;
    }

}
