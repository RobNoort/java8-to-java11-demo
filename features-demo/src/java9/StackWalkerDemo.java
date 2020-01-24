package java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StackWalkerDemo {
    public void methodOne() {
        this.methodTwo();
    }

    public void methodTwo() {
        this.methodThree();
    }

    public void methodThree() {
        List<StackWalker.StackFrame> stackTrace = StackWalker.getInstance()
                .walk(this::walkExample);
        stackTrace.stream().forEach(System.out::println);
    }
    public List<StackWalker.StackFrame> walkExample(Stream<StackWalker.StackFrame> stackFrameStream) {
        return stackFrameStream.collect(Collectors.toList());
    }
    public static void main(String[] args) {
      StackWalkerDemo stackWalkerDemo = new StackWalkerDemo();
      stackWalkerDemo.methodOne();
    }
}
