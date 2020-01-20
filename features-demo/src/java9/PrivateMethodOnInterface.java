package java9;

import java9.helpers.ExampleInterface;

public class PrivateMethodOnInterface implements ExampleInterface {

        public static void main(String[] args) {
            ExampleInterface demo = new PrivateMethodOnInterface();

            int sumOfEvens = demo.addEvenNumbers(1,2,3,4,5,6,7,8,9);
            System.out.println(sumOfEvens);

            int sumOfOdds = demo.addOddNumbers(1,2,3,4,5,6,7,8,9);
            System.out.println(sumOfOdds);
        }
    }