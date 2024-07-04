
//create a java program to add two matrics of size 2*3 
public class arraypr4 {
    public static void main(String[] args) {
        int matrix1[][]={{2,3,5},{7,8,9}};
        int matrix2[][]={{6,7,8},{9,2,3}};
        int result[][]={{0,0,0},{0,0,0}};

        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
}
