package java9;

public interface InterfaceDemo {

    default int aDefaultMethod() {
        step1();
        step2();
        return step3();
    }

    private void step1() {
    }

    private void step2() {
    }

    private int step3() {
        return -1;
    }
}
