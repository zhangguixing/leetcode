public class Solution43 {
    public static void main(String[] args) {
        System.out.println(multiply("99", "99"));
    }

    public static String multiply(String num1, String num2) {

        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        int[] resultArr = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                int res = resultArr[i + j + 1] + n1 * n2;
                resultArr[i + j + 1] = res % 10;
                resultArr[i + j] += res / 10;
            }
        }
        StringBuilder resultSB = new StringBuilder();
        for (int i = 0; i < resultArr.length; i++) {
            int res = resultArr[i];
            if (i == 0 && res == 0) {
                continue;
            }
            resultSB.append(res);
        }
        return resultSB.toString();

    }
}
