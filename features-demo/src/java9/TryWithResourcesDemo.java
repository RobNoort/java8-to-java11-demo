package java9;

import java.io.Closeable;
import java.io.IOException;

public class TryWithResourcesDemo {

    public void java7() {
        try (Resource resource = new Resource()) {
            System.out.print(resource);
        }
    }

    public void java9() {
        Resource resource = new Resource();
        try (resource) {
            System.out.print(resource);
        }

        System.out.print(resource); // Careful with this!
    }

    private class Resource implements AutoCloseable {

        @Override
        public void close() {

        }
    }
}
