import java.util.Arrays;

public class Split_K_Times {
    public static String[] test(int k, String abc) {
        String[] baller = new String[k];
        for(int i = 0; i < k; i++) {
            baller[i] = "\"" + abc.substring(i*k, (i+1)*k) + "\"";
        }
        return baller;
    }

    public static void main(String[] args) {
        String abc = "abcdefghi";
        int k = 3;
        System.out.println(Arrays.toString(test(k, abc)));
    }
}