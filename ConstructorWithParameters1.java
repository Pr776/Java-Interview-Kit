public class ConstructorWithParameters1 {

String BookName;
double BookPrice;
ConstructorWithParameters1(String bn, double bp){
BookName="Let us C";
BookPrice = 967.50;

}

public static void main(String[] args) {
ConstructorWithParameters1 obj = new ConstructorWithParameters1("LUC",67);

System.out.println(obj.BookName + " " + obj.BookPrice);


}

}
