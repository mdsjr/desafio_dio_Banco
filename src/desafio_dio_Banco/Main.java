package desafio_dio_Banco;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Cliente moacir = new Cliente();
        moacir.setNome("Moacir Jr");
        moacir.setEndereco("Rua Boa, 999");

        Conta cc = new ContaCorrente(moacir);
        Conta poupanca = new ContaPoupanca(moacir);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Adicionando cartões de crédito ao cliente
        CartaoDeCredito cartao = new CartaoDeCredito("1234 5678 9101 1121", "12/25", 2999, moacir);
        moacir.adicionarCartaoDeCredito(cartao);

        cartao.realizarCompra(1999);
        cartao.realizarCompra(600);

        // Registrando transações
        Transacao saque = new Transacao(new Date(), 100, "saque", cc, null);
        Transacao deposito = new Transacao(new Date(), 150, "deposito", null, poupanca);
        Transacao transferencia = new Transacao(new Date(), 50, "transferencia", cc, poupanca);

        System.out.println("Transações realizadas:");
        System.out.println("Saque: " + saque.getValor() + " na conta " + saque.getContaOrigem().getNumero());
        System.out.println("Depósito: " + deposito.getValor() + " na conta " + deposito.getContaDestino().getNumero());
        System.out.println("Transferência: " + transferencia.getValor() + " da conta " + transferencia.getContaOrigem().getNumero() + " para a conta " + transferencia.getContaDestino().getNumero());
    }
}

