// Question							
// Program to find out the numbers in the array which are divisble by 7							
// Output							
// 497	518	910					

// Buggy Code							
public class Main2 {
    public static void main(String[] args) {
        int arr[] = { 141, 256, 384, 497, 518, 645, 723, 824, 910 };
        // int sum = 0;
        boolean flag = false;

        for (int i = 0; i < 9; ++i) {
            int num = arr[i];
            flag = false;

            while (num > 0) {
                if (num % 7 == 0) {
                    flag = true;
                    break;
                }
                // else {
                // flag = false;
                // }

                num /= 10;
                // from both one and two any one method can be implemented
                // 1.break can use by commenting num/=10;
                // break;
                // 2.
                num = 0;
            }

            if (flag == true) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
