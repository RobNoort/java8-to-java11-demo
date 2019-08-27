package com.checho.fruits;

import com.checho.provider.Provider;

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
