import java.lang.reflect.Method;
import java.util.ArrayList;


public class DumpMethods {

    public void foo() { }
    
    public void foo(int y) { }
    
    public void foo(int y, int u) { }

    public int bar() { return 12; }

    public String baz() { return ""; }

    public static void main(String args[])
    {
        try {
            Class c = DumpMethods.class;
            Method[] m = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
            System.out.println(m[i].toString());
        } catch (Throwable e) {
            System.out.println(e);
        }
    }
    
}