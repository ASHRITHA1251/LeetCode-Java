import java.util.*;
import java.util.ArrayList;

class TUF{
static ArrayList<Integer>union(int[] a1, int a2[], int n1, int n2){
  HashSet < Integer > set = new HashSet <> ();
  for(int i=0, j=0;i<n1;i++,j++){
    set.add(a1[i]);
    set.add(a2[i]);
  }
  return new ArrayList<>(set);
}
public static void main(String[] xyz){
  int[] a1 = {1,2,5,6};
  int[] a2 = {7,8,8,9};
  System.out.println(union(a1,a2,4,4));
}
}