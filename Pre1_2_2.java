import java.util.*;

class Solution {
    public String[] solution(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        for(int i = 0;i < s.length(); i++){
            char ch = s.charAt(i);

            if((ch >='A' && ch <= 'z') || (ch >= '0' && ch <='9') ){
                sb.append(ch);

            }else if(sb.length() !=0){
                list.add(sb.reverse().toString());
                sb.setLength(0);
            }
        }
        if(sb.length() !=0){
                list.add(sb.reverse().toString());
            }
        String[] ans = new String[list.size()];

        for(int i=0; i<list.size();i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
public class Pre1_2_2{
  
}
