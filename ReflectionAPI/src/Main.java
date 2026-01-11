//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        // Serve para conhecer as classes de maneira indireta
        // muito usado pelos frameworks
        Produto p = new Produto(1, "Computador", 1000.0);
        Explorer.explorerMetadata(p);

    }
}