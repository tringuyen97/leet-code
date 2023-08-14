/**
 * Creator: Nguyen Ngoc Tri
 * Date: 6/29/2022
 * Time: 11:45 AM
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int t = getT(s);
        System.out.println(t);
    }

    private static int getT(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n;i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    private static boolean checkRepetition(String s, int i, int j) {
        int[] chars = new int[128];
        for (int x = i ; x <= j ; x++) {
            char c = s.charAt(x);
            chars[c]++;
            if (chars[c] > 1)
                return false;
        }
        return true;
    }
}
