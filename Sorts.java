public class Sorts{

  public static void main(String[] args){
    int[] data = new int[Integer.parseInt(args[0])];

    for (int i = 0 ; i < data.length ; i++){
      data[i] = (int) (Math.random() * 100);
    }

    System.out.println("Inital:");
    String ans = "[";
    for (int i = 0 ; i < data.length ; i++){
      ans += data[i] + ", ";
    }
    ans = ans.substring(0,ans.length()-2) + "]";
    System.out.println(ans);

    if(args[1].equals("selectionSort")){
      selectionSort(data);
    }
    if(args[1].equals("bubbleSort")){
      bubbleSort(data);
    }

    System.out.println("Final:");
    ans = "[";
    for (int i = 0 ; i < data.length ; i++){
      ans += data[i] + ", ";
    }
    ans = ans.substring(0,ans.length()-2) + "]";
    System.out.println(ans);

  }

  //---------------------------------------------------------------------------


  public static void selectionSort(int[] ary){
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

  //---------------------------------------------------------------------------

  private static boolean bubbleSwap(int[] data, int index1, int index2){
    //return true and swaps if the index1 is greater than index2 of data
    if (data[index1] > data[index2]){
      int placehold = data[index1];
      data[index1] = data[index2];
      data[index2] = placehold;
      return true;
    }
    return false;
  }

  private static boolean sorted(int[] data){
    for (int i = 0 ; i < data.length - 1; i++){
      if (data[i] > data[i+1]){
        return false;
      }
    }
    return true;
  }

  public static void bubbleSort(int[] data){
    while(!sorted(data)){
      for (int i = 0 ; i < data.length - 1 ; i++){
        if (data[i] > data[i+1]){
          bubbleSwap(data, i, i+1);
        }
      }
    }

  }

}
