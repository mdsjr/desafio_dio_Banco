package desafio_dio_Banco;
import java.util.List;
import java.util.ArrayList;

public class Transacao {
    private String nome;
    private String endereco;
    private List<CartaoDeCredito> cartoesDeCredito;

    public Transacao() {
        this.cartoesDeCredito = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<CartaoDeCredito> getCartoesDeCredito() {
        return cartoesDeCredito;
    }

    public void adicionarCartaoDeCredito(CartaoDeCredito cartao) {
        this.cartoesDeCredito.add(cartao);
    }
}


