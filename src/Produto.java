public class Produto {
    protected String descricao;
    protected int ano;
    protected String armazem;

    public Produto(String descricao, int ano, String armazem) {
        this.descricao = descricao;
        this.armazem = armazem;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + descricao);
        System.out.println("Ano: " + ano);
        System.out.println("Armazém: " + armazem);
    }
}
