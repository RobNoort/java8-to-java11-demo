package main.java.nl.robnoort.application;

import nl.robnoort.provider.Provider;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Application {
// TODO
    private static List<Provider> providers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("All elements provided:");
        System.out.println("");

        ServiceLoader
                .load(Provider.class)
                .forEach(Application::printElements);
    }

    private static void printElements(Provider provider) {
        List<String> elements = provider.getElements();
        System.out.println(elements);
    }
}
