package Week_02;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by tianguoxing on 2020/7/4 23:01.
 */
public class LC242IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (null == s || null == t || s.length() != t.length()) {
            return false;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            Integer sv = null != hashMap.get(chars[i]+"") ? hashMap.get(chars[i]+"") : 0;
            hashMap.put(chars[i] + "", sv+1);
            Integer tv = null != hashMap.get(chart[i]+"") ? hashMap.get(chart[i]+"") : 0;
            hashMap.put(chart[i] + "", tv-1);
        }
        Collection<Integer> lst = hashMap.values();
        for (Integer x : lst) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (null == s || null == t || s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for (int x : count) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "abc";
        System.out.println(isAnagram2(s,t));
    }
}
