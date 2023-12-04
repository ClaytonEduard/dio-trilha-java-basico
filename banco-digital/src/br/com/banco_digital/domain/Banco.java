package br.com.banco_digital.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;
    public static List<Cliente> clientes = new ArrayList<>();

    List<Cliente> listClientes = new ArrayList<>();

    public List<Cliente> listarClientes() {
        System.out.println("== Lista de Clientes Banco  ==");

        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
        return clientes;
    }

}
