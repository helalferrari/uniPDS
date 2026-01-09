import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1, "Computador", 1500.0));
        lista.add(new Produto(2, "Mouse", 50.0));
        lista.add(new Produto(3, "Teclado", 100.0));
        lista.add(new Produto(1, "Computador", 1500.0));
        lista.add(new Produto(1, "Computador", 1500.0));
        System.out.println(lista);

        Set<Produto> conjunto = new HashSet<>();
        conjunto.add(new Produto(1, "Computador", 1500.0));
        conjunto.add(new Produto(1, "Computador", 1500.0));
        System.out.println(conjunto);

        Map<Integer, Produto> mapa = new HashMap<>();
        mapa.put(1, new Produto(1, "Computador", 1500));
        mapa.put(2, new Produto(2, "Teclado", 100));
        mapa.put(3, new Produto(3, "Mouse", 50));
        mapa.put(4, new Produto(1, "Computador", 1500));
        System.out.println(mapa);
    }
}
