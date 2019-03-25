import java.util.*;
public class Method {
    public static void main(String[] args){
        System.out.println("input k");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        KSort(num, k);
    }
    static void KSort(int[] numbers, int k){
        for (int i = 0; i < numbers.length; i++){
            for (int j = i; j < numbers.length;j++){
                if (numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("the kth biggest number is " + numbers[k - 1]);
    }
}
