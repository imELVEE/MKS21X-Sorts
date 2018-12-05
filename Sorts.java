public class Sorts{
  public static void selectionsort(int[] ary){
    //hold the the location of the smallest
    int whereSmall = 0;

    for (int counter = 0 ; counter < ary.length ; counter++){
      int smallest = ary[counter];

      //record the smallest and where the smallest is
      for (int i = counter ; i < ary.length ; i++){
        if (ary[i] < smallest){
          whereSmall = i;
          smallest = ary[i];
        }
      }

      ary[whereSmall] = ary[counter];
      ary[counter] = smallest;
    }

  }
}
