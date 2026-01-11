//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProdutoRepo repo = new ProdutoRepo();
//  Optional permite trabalhar com retorno das suas próprias exceções, usando suas regras de negócio.
//        Produto p = repo.findById(10).orElse(new Produto(-1,"Produto inexistente", 0.00));
        Produto p = repo.findById(10).orElseThrow(()-> new RuntimeException("Produto Inexistente"));

        System.out.println(p.getNome());
    }
}