public class validP{
public static StringBuilder removeValid(String s){
    StringBuilder c= new StringBuilder();
    int count=1;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(' ){
            if(count>=2){
                //add to c 
                c.append(s.charAt(i));
                //break;

            }
            count++;
        
        }
        else if(s.charAt(i)==')'){
            count--;
            if(count>=2){
                //add to c
                c.append(s.charAt(i));

            }

        }
    }
    return c;

}

public static void main(String [] xyz){
    String s = "(()())";
    String s1 = "(()())()((())())";
    System.out.println(removeValid(s));
    System.out.println(removeValid(s1));

}
}