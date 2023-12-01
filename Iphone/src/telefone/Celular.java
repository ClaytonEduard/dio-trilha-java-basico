package telefone;

import funcoes.AparelhorTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Celular implements AparelhorTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina aberta");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }

}
