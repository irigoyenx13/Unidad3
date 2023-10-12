import java.util.Scanner;

public class Fibonaccitarea {
    public static void main(String[] args) 
	{
      
		  Scanner scanner = new Scanner(System.in);
       
 System.out.print("Ingrese la cantidad de números");
        int n = scanner.nextInt();

        long[] Series = new long[n];

        Series[0] = 0;
        if (n > 1)
		 {
    Series[1] = 1;
        }

     for (int i = 2; i < n; i++) {
            Series[i] = Series[i - 1] + Series[i - 2];
        }

     System.out.println("Serie de " + n );
		
        for (int i = 0; i < n; i++)
		 {
            System.out.print(Series[i] + " ");
        }
    }
}