import java.util.ArrayList;

class Produto{

    private String nomeloja;
    private double preco;
    protected String descricao;

    public Produto(String nomeloja, double preco, String descricao) {
        this.nomeloja = nomeloja;
        this.preco = preco;
        this.descricao = descricao;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public String getNomeloja() {
        return nomeloja;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}

class Mouse extends Produto{
    private String tipo;

    public Mouse(String nomeloja, double preco, String descricao, String tipo) {
        super(nomeloja, preco, descricao);
        this.tipo = tipo;
    }

    @Override
    public String getDescricao(){
        return descricao + " " + tipo;
    }
    
}

class Livro extends Produto{
    private String autor;

    public Livro(String nomeloja, double preco, String descricao, String autor) {
        super(nomeloja, preco, descricao);
        this.autor = autor;
    }

    @Override
    public String getDescricao(){
        return descricao + " " + autor;
    }

}



public class Main{
    public static void main(String[] args){
        final ArrayList<Produto> carrinho = new ArrayList<Produto>();
        
        Mouse mouse1 = new Mouse("Amazon", 49.90, "Mouse sem fio de conexão USB Logitech.", "Design ambidestro e compacto.");

        Mouse mouse2 = new Mouse("Miranda", 329.90, "Mouse sem fio de conexão USB Logitech, DPI máximo de 4000.", "Design vertical para a mão direita, adequado para mãos pequenas.");

        Mouse mouse3 = new Mouse("Kalunga", 809.91, "Mouse sem fio de conexão USB Logitech.", "Design de alto desempenho, com rastreamento máximo de 25.600 DPI e 11 botões programáveis.");

        carrinho.add(mouse1);
        carrinho.add(mouse2);
        carrinho.add(mouse3);

        Livro livro1 = new Livro("Amazon", 55.43, "Torto arado - capa comum.", "Autor: Itamar Vieira Junior");

        Livro livro2 = new Livro("Americanas", 71.59, "Por quem os sinos dobram - capa comum.", "Autor: Ernest Hemingway");


        carrinho.add(livro1);
        carrinho.add(livro2);

        for (Produto produto : carrinho) {
            System.out.println(produto.getDescricao()); //+ " " + produto.getNomeloja() + " - R$" + produto.getPreco()); OPCIONAL
        }

    }

}