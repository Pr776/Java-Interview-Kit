package Practices;

enum status{
    Running,Failed,Pending,Success;
}
public class Enum {
    public static void main(String[] args) {
        int i=5;
        status[] ss=status.values();
        for(status s:ss){
            System.out.println(s+":"+s.ordinal());
        }
    }
}
