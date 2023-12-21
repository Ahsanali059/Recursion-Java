
public class Factorial {
    public static void main(String[] args)
    {
           int number = 5;
           long res = findFact(number);

           System.out.println(res);
        }

        public static long findFact(int n)
        {
            //base case
            if(n==1 || n==0)
            {
                return 1;
            }
            else {
                //return n* findFact(n-1);
                long res = n* findFact(n-1);
                System.out.println(res);
                return res;

            }



        }
    }
/*
                        factorial(4)
                        /           \
            factorial(3)           4 * factorial(3)
           /         \             /           \
 factorial(2)  3 * factorial(2)  4 * factorial(2)  4 * 3 * factorial(2)
   /     \        /      \        /      \             /       \
factorial(1)  2 * factorial(1)  3 * factorial(1)  4 * 2 * factorial(1)
               /            \               /         \
           factorial(1)  2 * factorial(1)  3 * 2 * factorial(1)


 */
