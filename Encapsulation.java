package practices;

 class Acess{

    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Acess obj=new Acess();

        System.out.println(obj.getName()+":" +obj.getAge());
        
    }

   
    
}



