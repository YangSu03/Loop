import java.util.*;
class Seven {
  public static void main(String[] args) {
  String v;
  for (int i = 1; i < 10; i++){
  for(int n = 1; n <= 9; n++ ){
    v = n + "x" + i + "="+ i*n + " ";
    if (i*n <= 9)
      v = n + "x" + i + "="+ i*n + "  ";
    else 
      v = n + "x" + i + "="+ i*n + " ";
    if (n == 9)
      System.out.println(v);
    else
      System.out.print(v);
  }
  }
  }
}