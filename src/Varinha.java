public class Varinha extends Produto {
    private String nucleo;
    private double tamanho;
    private String madeira;

    public Varinha(String descricao, String armazem, int ano, String nucleo, double tamanho, String madeira) {
        super(descricao, ano, armazem);
        this.nucleo = nucleo;
        this.tamanho = tamanho;
        this.madeira = madeira;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Núcleo: " + nucleo);
        System.out.println("Tamanho (cm): " + tamanho);
        System.out.println("Madeira: " + madeira);
    }
}
