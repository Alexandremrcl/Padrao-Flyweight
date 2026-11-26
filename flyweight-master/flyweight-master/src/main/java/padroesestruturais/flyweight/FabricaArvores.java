package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaArvores {

    private Map<String, Arvore> arvores = new HashMap<>();

    public Arvore getArvore(String tipo, String cor) {

        String chave = tipo + cor;

        if (!arvores.containsKey(chave)) {
            arvores.put(chave, new Arvore(tipo, cor));
        }

        return arvores.get(chave);
    }
}