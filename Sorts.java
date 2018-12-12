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
    if(args[1].equals("insertionSort")){
      insertionSort(data);
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
    int whereSmall;
    int smallest;

    //outer loop for marking how much of the array has been sorted
    for (int sortMark = 0 ; sortMark < ary.length ; sortMark++){
      //holder values
      smallest = ary[sortMark];
      whereSmall = sortMark;

      //inner loop for finding the smallest
      for (int i = sortMark ; i < ary.length ; i++){
        //find the smallest from the unsorted pile
        if (ary[i] < smallest){
          smallest = ary[i];
          whereSmall = i;
        }
      }

      //swap the smallest and the first element of the unsorted
      ary[whereSmall] = ary[sortMark];
      ary[sortMark] = smallest;
    }


    }


  //---------------------------------------------------------------------------

  private static boolean bubbleSwap(int[] data, int index1, int index2){
    if (data[index1] > data[index2]){
      int placehold = data[index1];
      data[index1] = data[index2];
      data[index2] = placehold;
      return true;
    }
    return false;
  }

  public static void bubbleSort(int[] data){
    //keep track of up to which point has it been sorted
    int sortMark = data.length - 1;

    //while i havent sorted the enitre array
    while (sortMark > 0){

      //loop through the array and swap numbers along the way
      for (int i = 0 ; i < sortMark ; i++){
        bubbleSwap(data, i, i+1);

        //i've reached the end of the array and moved the biggest number to the
        //end so now the sorted array is closer
        if (i + 1 == sortMark){
          sortMark--;
        }

      }
    }
  }

  //---------------------------------------------------------------------------

  public static void insertionSort(int[] data){
    //outer loop loops through all the unsorted numbers
    //TLDR; selects the next unsorted number
    for (int i = 1 ; i < data.length ; i++){
      int original = data[i];
      int place = i;

      //finds the place the number belongs in and puts it there
      for (int replace = i - 1 ; replace > -1 && original < data[replace] ; replace--){
        data[replace+1] = data[replace];
        place = replace;
      }

      data[place] = original;
    }
  }

}
