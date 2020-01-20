package java9;

public class TryWithResourcesDemo {


    public static void main(String[] args) {
        TryWithResourcesDemo demo = new TryWithResourcesDemo();
        demo.java7();
        demo.java9();

    }
    private void java7() {
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

    // As long as this is implementing a closable
    private class Resource implements AutoCloseable {

        @Override
        public void close() {

        }
    }
}
