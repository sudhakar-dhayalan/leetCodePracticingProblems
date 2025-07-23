
import java.util.Map;
import java.util.TreeMap;

class StrCount{

    public static void main(String[] args) {
        String str = new String("SudhAAAAAAAAAakaaaaarSSsssree");

        Map<Character, Integer> map = new TreeMap<>();

        str = str.toLowerCase();
        for (Integer i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (map.get(s) == null) {
                map.put(s, 1); 
            }else {
                map.put(s, map.get(s) + 1);
            }
        }

        System.out.println(map);
        // {a=15, d=1, e=2, h=1, k=1, r=2, s=6, u=1}
    }
}
