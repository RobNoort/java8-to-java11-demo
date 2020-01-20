import nl.robnoort.provider.Provider;
import nl.robnoort.vegetables.VegetablesProvider;

module nl.robnoort.vegetables {

    requires nl.robnoort.provider;

    exports nl.robnoort.vegetables;

    provides Provider
            with VegetablesProvider;

}
