import nl.robnoort.fruits.FruitsProvider;
import nl.robnoort.provider.Provider;

module nl.robnoort.fruits {

    requires nl.robnoort.provider;

    exports nl.robnoort.fruits;

    provides Provider
            with FruitsProvider;
}