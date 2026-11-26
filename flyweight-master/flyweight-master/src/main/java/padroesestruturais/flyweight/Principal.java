package padroesestruturais.flyweight;

public class Principal {

    public static void main(String[] args) {

        FabricaArvores fabrica = new FabricaArvores();
        Floresta floresta = new Floresta();

        floresta.plantarArvore(fabrica, "Pinheiro", "Verde", 10, 20);
        floresta.plantarArvore(fabrica, "Pinheiro", "Verde", 30, 40);
        floresta.plantarArvore(fabrica, "Carvalho", "Marrom", 50, 60);
        floresta.plantarArvore(fabrica, "Pinheiro", "Verde", 70, 80);
    }
}