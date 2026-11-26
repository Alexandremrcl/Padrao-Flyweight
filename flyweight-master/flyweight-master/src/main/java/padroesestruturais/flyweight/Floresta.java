package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Floresta {

    private List<Arvore> arvores = new ArrayList<>();

    public void plantarArvore(FabricaArvores fabrica, String tipo, String cor, int x, int y) {
        Arvore arvore = fabrica.getArvore(tipo, cor);
        arvores.add(arvore);
        arvore.desenhar(x, y);
    }
}