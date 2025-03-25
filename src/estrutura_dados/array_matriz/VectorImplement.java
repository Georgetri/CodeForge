package estrutura_dados.array_matriz;

import java.util.Vector;
import java.util.Iterator;

public class VectorImplement {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>(2, 1);

        vector.addElement(1);
        vector.addElement("a");
        vector.addElement(5);
        System.out.println("Capacidade do vetor: " + vector.capacity());

        Iterator<Object> iterator = vector.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
