//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Produto p = new Produto(1, "Computador", 1000.0);
        Cliente c = new Cliente(1, "Isidro", "004.681.454-44", "ferrari.work@gmail.com");
        Explorer.explorerMetadata(p);
    }
}