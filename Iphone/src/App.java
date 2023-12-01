import telefone.Celular;

public class App {
    public static void main(String[] args) throws Exception {
        Celular iphone = new Celular();
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        // iphone.atualizarPagina(); nao tem porque é privado não precisa sar como
        // atualiza

    }
}
