package com.checho.vegetables;

import com.checho.provider.Provider;

import java.util.List;

public class VegetablesProvider implements Provider {

    public List<String> getElements() {
        return List.of(
                "Broccoli",
                "Carrot"
        );
    }
}
