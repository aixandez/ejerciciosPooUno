package expresionBalanceada;

import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/* Escribir un método que evalúa si una cadena de paréntesis, corchetes y llaves está bien balanceada
 * y devuelve true si está bien balanceada y false si está mal balanceada.
 * Por ejemplo: [()]{}{[()()]()} debe devolver true,
 * mientras que [(]) debe devolver false.  */

public class ExpresionBalanceada {
	

    private Set<Character> deAbrir = new TreeSet<Character>();
    private Set<Character> deCerrar = new TreeSet<Character>();
    private Map<Character, Character> parejita = new TreeMap<Character, Character>();
    private Stack<Character> pila = new Stack<Character>();

    public ExpresionBalanceada() {
        this.deAbrir.add('(');
        this.deAbrir.add('[');
        this.deAbrir.add('{');

        this.deCerrar.add(')');
        this.deCerrar.add(']');
        this.deCerrar.add('}');

        this.parejita.put(')', '(');
        this.parejita.put(']', '[');
        this.parejita.put('}', '{');
    }

    public boolean estaBalanceada(String exp) {

        for (Character simbolo : exp.toCharArray()) {

            if (esDeAbrir(simbolo)) {
                pila.push(simbolo);
            } else {

                if (pila.isEmpty() || !sonParejita(pila.pop(), simbolo)) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    private boolean esDeAbrir(Character c) {
        return deAbrir.contains(c);
    }

    private boolean sonParejita(Character a, Character b) {
        return a == parejita.get(b);
    }

}