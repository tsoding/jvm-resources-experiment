import java.net.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassLoader loader = new Main().getClass().getClassLoader();
        Enumeration<URL> resource = loader.getResources("index.mgn");
        while (resource.hasMoreElements()) {
            System.out.println(resource.nextElement());
        }
    }
}
