public class Solution14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        if (minLen == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        lab:
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    break lab;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
