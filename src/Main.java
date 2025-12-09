/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Jacob K
*****************************************************************************************************
*/
public class Main {

    public static void main(String[] args) {
        int sumTwo = add(2, 4);
        System.out.println(sumTwo);


    }

    // 2. add



    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c, int d) {
        int firstPair = add(a, b);
        int secondPair = add(c, d);
        return add(firstPair, secondPair);
    }



        public static String morningGreeting(String name) {
            return "早上好, " + name +"!";
        }

    // 4. afternoonGreeting


        public static String afternoonGreeting(String name) {
            return "下午好, " + name + "!";
        }

        // 5. triple


            public static String triple(String str) {
                return str + str + str;
            }


        // 6. half


            public static double half(int num) {
                return num / 2.0;
            }


        // 7. roundPositiveValueToNearestInteger


            public static int roundPositiveValueToNearestInteger(double num) {
                return (int) (num + 0.5);
            }


        // 8. roundNegativeValueToNearestInteger

            public static int roundNegativeValueToNearestInteger(double num) {
                return (int) (num - 0.5);

    }

}