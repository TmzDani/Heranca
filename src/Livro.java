public class Livro extends Produto {
    private String nome;
    private String autor;
    private String editora;

    public Livro(String descricao, String armazem, int ano, String nome, String autor, String editora) {
        super(descricao, ano, armazem);
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Nome do Livro: " + nome);
        System.out.println("Autor(a): " + autor);
        System.out.println("Editora: " + editora);
    }
}
