public class StringBuffer2 {
    public static void main(String[] args) {

        String result1 = "Hello";
        
        
        StringBuffer sb = new StringBuffer("This is a StringBuffer");
        
        System.out.println("1:" + sb);
        
        char arr[] = {'a','b'};
        System.out.println("2:" + sb.append(arr));
        
        
        System.out.println("3: " + sb.append(199.98));
        
        System.out.println("4: length is :" + sb.length());
        
        int index1 = sb.indexOf("String");
        System.out.println("5: index of string" + " "+index1);
        
        char ch1 = sb.charAt(10);
        System.out.println(ch1);
        
        sb.insert(4,"testdata");
        System.out.println(sb);
        
        String resultToSplit = sb.toString();
        
        String sp1[] = resultToSplit.split(" ");
        System.out.println("*******");
        for(String s:sp1) {
        System.out.println(s);
 }
    }
}
