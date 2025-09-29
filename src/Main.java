/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Jacob
*****************************************************************************************************
*/
public class Main {

    public static void main(String[] args) {
        int sumTwo = add(2, 4);
        System.out.println(sumTwo);


    }
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add

    public class Main2 {

        public static void main(String[] args) {
            int sumFour = add(3, 8, 4, 9);
            System.out.println(sumFour);  // Expected output: 24
        }

        public static int add(int a, int b) {
            return a + b;
        }

        public static int add(int a, int b, int c, int d) {
            int firstPair = add(a, b);
            int secondPair = add(c, d);
            return add(firstPair, secondPair);
        }
    }


    // 3. morningGreeting
    public class Main3 {

        public static void main(String[] args) {
            String greeting = morningGreeting("Hello");
            System.out.println(greeting);
        }

        public static String morningGreeting(String name) {
            return "Hello" + name +"!";
        }

    // 4. afternoonGreeting
    public class Main4 {

        public static void main(String[] args) {
            String afternoon = afternoonGreeting("Mac Miller");
            System.out.println(afternoon);
        }

        public static String afternoonGreeting(String name) {
            return "hi, " + name + "!";
        }

        // 5. triple
        public class Main5 {

            public static void main(String[] args) {
                String tripled = triple("oohbaby");
                System.out.println(tripled);
            }

            public static String triple(String str) {
                return str + str + str;
            }
        }

        // 6. half
        public class Main6 {

            public static void main(String[] args) {
                double halfValue1 = half(8);
                System.out.println(halfValue1);
                double halfValue2 = half(17);
                System.out.println(halfValue2);
            }

            public static double half(int num) {
                return num / 2.0;
            }
        }

        // 7. roundPositiveValueToNearestInteger
        public class Main7 {

            public static void main(String[] args) {
                int roundedPos1 = roundPositiveValueToNearestInteger(8.5);
                System.out.println(roundedPos1);

                int roundedPos2 = roundPositiveValueToNearestInteger(8.49);
                System.out.println(roundedPos2);
            }

            public static int roundPositiveValueToNearestInteger(double num) {
                return (int) (num + 0.5);
            }
        }
        }

        // 8. roundNegativeValueToNearestInteger
        public class Main8 {

            public static void main(String[] args) {
                int roundedNeg1 = roundNegativeValueToNearestInteger(8.5);
                System.out.println(roundedNeg1);

                int roundedNeg2 = roundNegativeValueToNearestInteger(8.49);
                System.out.println(roundedNeg2);
            }

            public static int roundNegativeValueToNearestInteger(double num) {
                return (int) (num - 0.5);

    }}}}