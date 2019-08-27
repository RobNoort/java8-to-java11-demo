package java9;

public interface InterfaceDemo {

    default int getBookNumber() {
        return getNumber();
    }

    private int getNumber() {
        return -1;
    }
}
