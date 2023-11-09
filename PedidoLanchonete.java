import java.util.ArrayList;

public class PedidoLanchonete {
    private ArrayList<ArrayList<PedidoLanchonete>> pedidos;

    private Associado associado;
    private String item;
    private double valor;

    public PedidoLanchonete(Associado associado, String item, double valor) {
        this.associado = associado;
        this.item = item;
        this.valor = valor;
    
    }

    public void registrarConsumo(Associado associado, String item, double valor) {
        ArrayList<PedidoLanchonete> dadosAssociado = new ArrayList<PedidoLanchonete>();  //Array para armazenar objeto      
        PedidoLanchonete novoPedido = new PedidoLanchonete(associado, item, valor);
        
        dadosAssociado.add(novoPedido);
        this.pedidos.add(dadosAssociado);
        System.out.println("Consumo registrado para o associado " + associado.getNome());
    }

    // Outros métodos da lanchonete, se necessário
}