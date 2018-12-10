import java.util.List;
import java.util.ArrayList;
public class mydriver{
  public static void main(String[] args){
    int[] data = new int[Integer.parseInt(args[0])];

    for (int i = 0 ; i < data.length ; i++){
      data[i] = (int) (Math.random() * 100);
    }

    String ans = "[";
    for (int i = 0 ; i < data.length ; i++){
      ans += data[i] + ", ";
    }
    ans = ans.substring(0,ans.length()-2) + "]";
    System.out.println(ans);

    //{1,2,4,5,6,7,7,9}
    Sorts.bubbleSort(data);

    ans = "[";
    for (int i = 0 ; i < data.length ; i++){
      ans += data[i] + ", ";
    }
    ans = ans.substring(0,ans.length()-2) + "]";
    System.out.println(ans);

  }
}
