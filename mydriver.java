import java.util.List;
import java.util.ArrayList;
public class mydriver{
  public static void main(String[] args){
    int[] data = {2,5,1,7,4,9,6,7};
    //{1,2,4,5,6,7,7,9}
    Sorts.selectionsort(data);

    String ans = "[";
    for (int i = 0 ; i < data.length ; i++){
      ans += data[i] + ", ";
    }
    ans = ans.substring(0,ans.length()-2) + "]";
    System.out.println(ans);
  }
}
