package Array;

public class Duplicate {
    public static void main(String[] args) {
        int [] num={1,2,8,6,7,7,4};

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){

                if (i!=j && num[i]==num[j]){

                    System.out.println(num[j]);

                }
            }
        }
    }
}
