public class Methods_pr1 {
    // non-static method can't be reference a static method.
      static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        
        int a=5;
        int b=7;
        int c;
        //method invocation using object creation
       // Methods_pr1 mp = new Methods_pr1();
        //c=mp.logic(a,b);
        c=logic(a,b);
        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
