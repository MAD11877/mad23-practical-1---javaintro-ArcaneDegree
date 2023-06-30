import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    int base = in.nextInt();

    for (int currentRowIndex = 0; currentRowIndex < base; currentRowIndex++)
    {
      for (int currentColumnIndex = 0; currentColumnIndex < base - currentRowIndex; currentColumnIndex++)
      {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
