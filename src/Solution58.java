/**
 * @author zhangguixing
 * @since 2022/1/17 2:07 PM
 */
public class Solution58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        return str.length() - str.lastIndexOf(" ") - 1;
    }
}