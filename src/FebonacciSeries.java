public class FebonacciSeries {
    public static void main(String[] args)
    {
        //febonacci Series

        //1,2,3,5,8,13,21,34...

        int n = 13;

        for (int i=0;i<n;i++)
        {
            System.out.println(feboSeries(i));
        }
    }

    public static long feboSeries(int n)
    {
        //base case
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
           return 1;
        }

        return feboSeries(n-1) + feboSeries(n-2);
    }


}
