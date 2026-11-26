package padroesestruturais.flyweight;

public class Arvore {

    private String tipo;
    private String cor;

    public Arvore(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public void desenhar(int x, int y) {
        System.out.println("Árvore " + tipo + " " + cor +
                " na posição (" + x + ", " + y + ")");
    }
}