public class sumOfDigits
{
    public static void main(String[] args)
    {
        int number = 134;

        int res = sumOfDigit(number);

        //System.out.println(res);
        System.out.println(res);


    }

    public static int sumOfDigit(int number)
    {
        //Base case
        if(number<10)
        {
            return number;
        }
        //Recursive Call
        return number % 10 + sumOfDigit(number/10);
    }
}
