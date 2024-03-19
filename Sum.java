import java.util.Arrays;
import java.util.List;

public class Sum {
    public static int getLucky(String s, int k) {
        List<Character> temp = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        String inp = "";
        for(int i=0; i<s.length(); i++){
            inp += temp.indexOf(s.charAt(i))+1;
        }
        int out = 0;

        for(int i=0; i<inp.length(); i++){
            char ch = inp.charAt(i);
            int a = Character.getNumericValue(ch);
            out += a;
        }

        int p = 1;
        while(p < k){
            int sum = 0;
            while(out > 0){
                sum += out%10;
                out = out/10;
            }
            p++;
            out = sum;
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }
}
