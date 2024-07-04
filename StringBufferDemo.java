public class StringBufferDemo {
    public static void main(String[]args){
        String var="123456789";
        StringBuffer sb = new StringBuffer(var);
        System.out.println(sb);
        StringBuffer sb1=sb.append("1011");
        System.out.println(sb.append("1011"));
        
    }
}
