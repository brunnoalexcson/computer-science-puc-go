public class matematica {

    public static int soma(int x, int y)
    {
        return x+y;
    }

    public static int subtrai(int x, int y)
    {
        return x-y;
    }

    public static int multiplica(int x, int y)
    {
        return x*y;
    }
    // public static double divide(int x, int y)
    // {
    //     if (y!=0)
    //        return (double)(x)/y;
    //     else
    //     {
    //         System.out.println("Erro. Divisao por zero.");
    //         return -1;
    //     }
    // }

    public static double divide(int x, int y)
    {
        try {
            return (double)((double)x/y);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return -1.0;
    }
}
