import java.io.BufferedWriter;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String fileName = "BenchMark.txt";
        String linhaBase = "Esta é uma linha de exemplo para benchmark de leitura de arquivos\n";
        long tamanho = 100L * 1024 * 1024;

        try {
            long tamanhoAtual = 0;
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            while (tamanhoAtual < tamanho) {
                writer.write(linhaBase);
                tamanhoAtual += linhaBase.getBytes().length;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}