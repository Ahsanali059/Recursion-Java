public class PowerFunction
{
    public static void main(String[] args) {
         int base=3;
         int exponent = 3;

         int result = powerFunction(base,exponent);

        System.out.println(result);
    }

    public static int powerFunction(int base ,int exponential)
    {
        //Base case
        if(exponential==0)
        {
            return 1;
        }
        //recursive call
        return base * powerFunction(base,exponential-1);
    }
}
