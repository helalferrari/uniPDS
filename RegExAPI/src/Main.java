import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
        String email = "ferrari.work@gmail.com"; // true
     // String email = "ferrari.work@gmail"; // false
        System.out.println(email.matches("^[\\w.-_]+@[\\w]+\\.[a-zA-Z0-9]{2,6}"));

        String texto = "O cep da residencia é 01234-567";
        Pattern pattern = Pattern.compile("\\d{5}-\\d{3}");
        Matcher matcher = pattern.matcher(texto);
        if(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}