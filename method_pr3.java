public class method_pr3 {
    // two or more methods can have same name but different parameters such methods are called overload methods.
static void golu(){
    System.out.println("good morning bro!");
}
static void golu(int a)//parameters
{
    System.out.println("good morning " + a + " bro");
}
public static void main(String[] args) {
    golu();
    golu(3000);//arguments
}
}

//arguments are actual