package pl.kkufel.creditcard;

import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        var name = "Kamil";
        var message =  String.format("Hello %s", name);

        var names = Collections.singletonList("Kamil Kufel");

        System.out.println(message);
    }
}
