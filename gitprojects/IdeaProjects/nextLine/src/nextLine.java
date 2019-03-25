import java.util.*;
public class nextLine {
    public static void main(String[] args) {
        //统计英文字母空格数字和其他数字的个数
        int num = 0;
        int letter = 0;
        int space = 0;
        int others = 0;

        System.out.println("请输入一串字符");
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (ch <= 57 && ch >= 48) {
                num++;
            }
            else if ((ch >= 65 && ch <= 90) ||(ch >= 97 && ch <= 122)) {
                letter++;
            }
            else if (ch == 32) {
                space++;
            }
            else {
                others++;
            }
        }
        System.out.println("数字"+num+"个,字母"+letter+"个,空格"+space+"个,其他"+others+"个");
        in.close();
    }
}
