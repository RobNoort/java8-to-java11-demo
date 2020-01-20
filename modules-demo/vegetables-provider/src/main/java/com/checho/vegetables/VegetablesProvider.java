package nl.robnoort.vegetables;

import nl.robnoort.provider.Provider;

import java.util.List;

public class VegetablesProvider implements Provider {

    public List<String> getElements() {
        return List.of(
                "Broccoli",
                "Carrot"
        );
    }
}
