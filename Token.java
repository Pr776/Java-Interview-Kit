import java.util.*;
public class Token {
    public static void main(String[] args) {
      // TODO Auto-generated method stub
      String ipaddress = "192.168.22.68";
      StringTokenizer obj = new StringTokenizer(ipaddress ,".");
        
  while(obj.hasMoreTokens()) {
   System.out.println(obj.nextToken());
      }
        }
        
}
