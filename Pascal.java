import java.util.Scanner;

public class Pascal {

//            1
//           1  1
//          1  2  1
//         1  3  3  1
//        1  4  6  4  1
//      1   5   10   5  1
//
  static void print(int [][]arr){
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j <=i ; j++) {
              System.out.print(arr[i][j]+ "  ");
          }
          System.out.println();
      }
  }
public static void main(String[] args) {
    System.out.println("enter the number in the array");
    Scanner Sc = new Scanner(System.in);
    int a = Sc.nextInt();
    int [][]arr ;
    arr = new int[a][];
    for (int i = 0; i <a; i++) {
        arr[i]=new int[i+1];
        arr[i][0]=arr[i][i]=1;
        System.out.println("reached here ");
        for (int j = 1; j <i ; j++) {
     arr[i][j]=arr[i-1][j]+arr[i-1][j-1];


        }

    }
    print(arr);

}

}
