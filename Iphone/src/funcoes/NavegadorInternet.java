package funcoes;

public interface NavegadorInternet {
    public void exibirPagina();

    public void adicionarNovaAba();

    private void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
