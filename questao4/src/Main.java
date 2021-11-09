import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("9");

        String[] array = list.toArray(new String[list.size()]);

        System.out.println("Lista de Numeros: " + Arrays.toString(array));

        List<Integer> numeros = list.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        Integer sum = numeros.stream()
                .reduce(0,Integer::sum);

        Integer max = Collections.max(numeros);

        Integer min = Collections.min(numeros);

        System.out.println("Soma dos Numeros: " + sum);
        System.out.println("Media dos Numeros: " + sum/5);
        System.out.println("O Maior dos Numeros: " + max);
        System.out.println("O Menor dos Numeros: " + min);

    }
}
