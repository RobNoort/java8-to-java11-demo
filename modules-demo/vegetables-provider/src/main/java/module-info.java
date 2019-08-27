import com.checho.provider.Provider;
import com.checho.vegetables.VegetablesProvider;

module com.checho.vegetables {

    requires com.checho.provider;

    exports com.checho.vegetables;

    provides Provider
            with VegetablesProvider;

}
