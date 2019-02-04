import java.util.ArrayList;
public class Recursion{
  /*You may write additional private methods */

  /*Recursively find the sqrt using Newton's approximation
  *tolerance is the allowed percent error the squared answer is away from n.
  *precondition: n is non-negative

  */
  public static double sqrt(double n, double tolerance){
    return sqrtHelper(n, n/2, tolerance);
  }
  private static double sqrtHelper(double n, double guess, double tolerance){
    if(guess*guess-n/n <= tolerance) return guess;
    return sqrtHelper(n,(guess+n/guess)/2, tolerance);
  }

  /*Recursively find the n'th fibbonaci number in linear time
  *fib(0) = 0
  *fib(1) = 1
  *fib(5) = 5
  *precondition: n is non-negative
  */
  public static int fib(int n){
    return fibHelper(n, 0,1);
  }
  private static int fibHelper(int n, int fib0,int fib1){
    if(n==0) return fib0;
    if(n==1) return fib1;
    return fibHelper(n-1, fib1, fib0+fib1);
  }

  /*As Per classwork*/
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> ans = new ArrayList<Integer>();
    return sumsHelper(n, ans);
  }
  private static ArrayList<Integer> sumsHelper(int n, ArrayList<Integer> ans){
    if(n==0) return ans;
    for(int x= ans.length();x>0;x){
      ans.add(ans.get(x)+n);
    }
    return sumsHelper(n-1,ans);
  }

}
