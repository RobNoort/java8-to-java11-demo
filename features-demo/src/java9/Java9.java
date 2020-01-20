package java9;

public class Java9 implements PrivateMethodOnInterface {

        public static void main(String[] args) {
            PrivateMethodOnInterface demo = new Java9();

            int sumOfEvens = demo.addEvenNumbers(1,2,3,4,5,6,7,8,9);
            System.out.println(sumOfEvens);

            int sumOfOdds = demo.addOddNumbers(1,2,3,4,5,6,7,8,9);
            System.out.println(sumOfOdds);
        }
    }