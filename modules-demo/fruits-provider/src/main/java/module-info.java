import com.checho.fruits.FruitsProvider;
import com.checho.provider.Provider;

module com.checho.fruits {

    requires com.checho.provider;

    exports com.checho.fruits;

    provides Provider
            with FruitsProvider;
}