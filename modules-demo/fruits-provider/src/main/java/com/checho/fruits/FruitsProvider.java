package nl.robnoort.fruits;

import nl.robnoort.provider.Provider;

import java.util.List;

public class FruitsProvider implements Provider {

    public List<String> getElements() {
        return List.of(
                "Apple",
                "Orange",
                "Mango"
        );
    }
}
