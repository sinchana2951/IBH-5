// Question:			
// Program to find out the number in the array which has 5 in it			
// Output:			
// 256	518	645	

public class Main1 {
    public static void main(String[] args) {
        int arr[] = { 141, 256, 384, 497, 518, 645, 723, 824, 910 };
        // int sum = 0;
        boolean flag = false;

        for (int i = 0; i < 9; i++) {
            int num = arr[i];

            while (num > 0) {
                if (num % 10 == 5) {
                    flag = true;
                    break;
                }

                else {
                    flag = false;
                }
                num /= 10;
            }

            if (flag == true) {

                System.out.print(arr[i] + " ");

            }

        }
    }
}