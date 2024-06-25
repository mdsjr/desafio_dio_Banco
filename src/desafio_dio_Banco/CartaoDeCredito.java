package desafio_dio_Banco;

public class CartaoDeCredito {
    private String numero;
    private String validade;
    private double limite;
    private Cliente cliente;

    public CartaoDeCredito(String numero, String validade, double limite, Cliente cliente) {
        this.numero = numero;
        this.validade = validade;
        this.limite = limite;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public String getValidade() {
        return validade;
    }

    public double getLimite() {
        return limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void realizarCompra(double valor) {
        if (valor <= limite) {
            limite -= valor;
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Limite insuficiente!");
        }
    }
}

