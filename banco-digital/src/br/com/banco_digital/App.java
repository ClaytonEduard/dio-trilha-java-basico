package br.com.banco_digital;

import br.com.banco_digital.domain.Banco;
import br.com.banco_digital.domain.Cliente;
import br.com.banco_digital.domain.Conta;
import br.com.banco_digital.domain.ContaCorrente;
import br.com.banco_digital.domain.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        // * Criando o primeiro cliente */
        Cliente clayton = new Cliente();
        clayton.setNome("Clayton ");

        // * Criando contas do primeiro cliente */
        Conta cc = new ContaCorrente(clayton);
        Conta poupanca = new ContaPoupanca(clayton);

        // * Deposio e transferencia do primeiro cliente */
        cc.depositar(250);
        cc.transferir(100, poupanca);

        // * Extratos do primeiro cliente */
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // * Criando o segundo cliente */
        Cliente nathalia = new Cliente();
        nathalia.setNome("nathalia ");

        // * Criando contas do segundo cliente */
        Conta cc1 = new ContaCorrente(nathalia);
        Conta poupanca1 = new ContaPoupanca(nathalia);

        // * Deposio e transferencia do segundo cliente */
        cc1.depositar(550);
        cc1.transferir(300, poupanca1);

        // * Extratos do segundo cliente */
        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        // * Adcionando o Cliente a lista static do banco */
        Banco.clientes.add(clayton);
        Banco.clientes.add(nathalia);

        Banco b = new Banco();
        // * Imprimindo os clientes do banco */
        b.listarClientes();
    }
}
