public class facto {
    static int factorial(int n){
      if(n==0||n==1){
        return 1;
      }
      else{
        return n*factorial(n-1);
      }
    }
    public static void main(String[] args) {
      int x=4;
      System.out.println("the factorial number is " + factorial(x));
    }
}
