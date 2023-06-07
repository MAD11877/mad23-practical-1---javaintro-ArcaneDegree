import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    int numIntegerElements = in.nextInt();

    int[] distinctIntegerElements = new int[numIntegerElements];

    int[] distinctIntegerElementOccurrenceCounts = new int[numIntegerElements];

    for (int currentIntegerElementIndex = 0; currentIntegerElementIndex < numIntegerElements; currentIntegerElementIndex++)
    {
      int currentIntegerElement = in.nextInt();

      int currentDistinctIntegerElementIndex = 0;

      boolean isUnique = true;

      for (; currentDistinctIntegerElementIndex < distinctIntegerElements.length; currentDistinctIntegerElementIndex++)
      {
        if (currentIntegerElement == distinctIntegerElements[currentDistinctIntegerElementIndex])
        {
          isUnique = false;

          break;
        }
      }

      if (isUnique == true)
      {
        int[] previousDistinctIntegerElementArray = distinctIntegerElements;

        distinctIntegerElements = new int[distinctIntegerElements.length + 1];

        // Copy over elements of old array to new array for the distinctIntegerElements array.
        for (int currentIndex = 0; currentIndex < previousDistinctIntegerElementArray.length; currentIndex++)
        {
          distinctIntegerElements[currentIndex] = previousDistinctIntegerElementArray[currentIndex];
        }

        distinctIntegerElements[distinctIntegerElements.length - 1] = currentIntegerElement;

        int[] previousDistinctIntegerElementOccurrenceCountArray = distinctIntegerElementOccurrenceCounts;

        distinctIntegerElementOccurrenceCounts = new int[distinctIntegerElementOccurrenceCounts.length + 1];

        // Copy over elements of old array to new array for the distinctIntegerElementOccurrenceCounts array.
        for (int currentIndex = 0; currentIndex < previousDistinctIntegerElementOccurrenceCountArray.length; currentIndex++)
        {
          distinctIntegerElementOccurrenceCounts[currentIndex] = previousDistinctIntegerElementOccurrenceCountArray[currentIndex];
        }

        distinctIntegerElementOccurrenceCounts[distinctIntegerElements.length - 1] = 0;
      }
      else
      {
        distinctIntegerElementOccurrenceCounts[currentDistinctIntegerElementIndex]++;
      }
    }

    int highestIntegerElementOccurrenceCount = 0;

    int mode = 0;

    for (int currentDistinctIntegerElementIndex = 0; currentDistinctIntegerElementIndex < distinctIntegerElements.length; currentDistinctIntegerElementIndex++)
    {
      if (distinctIntegerElementOccurrenceCounts[currentDistinctIntegerElementIndex] > highestIntegerElementOccurrenceCount)
      {
        highestIntegerElementOccurrenceCount = distinctIntegerElementOccurrenceCounts[currentDistinctIntegerElementIndex];

        mode = distinctIntegerElements[currentDistinctIntegerElementIndex];
      }
    }

    System.out.println(mode);
  }
}
