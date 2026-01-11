import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Explorer {
    public static void explorerMetadata(Object o) throws Exception{
        System.out.println("----> Extraindo os atributos");
        for(Field f : o.getClass().getDeclaredFields()){
            if(f.isAnnotationPresent(Visible.class)){
                f.setAccessible(true);
                System.out.println("Atributo vísivel: " + f.getName() + " - " + f.get(o));
                f.setAccessible(false);
            }
            else {
                System.out.println("Atributo não vísivel" + f.getName());
            }
            System.out.println(f.getName() + ": " + f.getType().getName());
        }

        System.out.println("----> Extraindo os métodos");
        for(Method m : o.getClass().getDeclaredMethods()){
            System.out.println(m.getName() + ": " + m.getReturnType().getName());
        }

        System.out.println("----> Extraindo dados do objeto");
        for(Field f : o.getClass().getDeclaredFields()){
            f.setAccessible(true);
            System.out.println(f.get(o));
            f.setAccessible(false);
        }

        System.out.println("----> Extraindo por execução de método");
        for(Method m : o.getClass().getDeclaredMethods()){
            if(m.getName().startsWith("get")){
                System.out.println(m.getName() + " - valor: " + m.invoke(o, null));
            }
        }
    }
}
