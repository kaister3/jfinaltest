import java.util.*;

public class HomeWork {
    static int[] numbers = new int[6];
    public static void main(String args[]){
        HomeWork homeWork01 = new HomeWork();
        homeWork01.FangCheng();
    }

    void Shunxu(){
        System.out.println("Please input 6 numbers");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 6; i++){
            this.numbers[i] = in.nextInt();
        }
        System.out.println("The numbers are: ");
        for (int i = 0; i < 6; i++){
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < 6; i++){
            for (int j = i + 1; j < 6; j++){
                if (numbers[i] <= numbers[j]){
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        System.out.println("The numbers are: ");
        for (int i = 0; i < 6; i++){
            System.out.println(numbers[i]);
        }
    }

    void FangCheng(){
        System.out.println("Please input a, b, and c");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (b*b < 4*a*c){
            System.out.println("NO!");
        }
        else{
            double x1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
            double x2 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
            System.out.println(x1 + "and" + x2);
        }
    }
