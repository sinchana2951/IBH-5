
// Question										
// 	To display from the array prime numbers which are also an ascending number but don't have 9 in them										
// 	Output										
// 	127	137	157	167	257	347	367	457	467		

// 	Buggy Code										
public class Main {
    public static void main(String[] args) {
        boolean isPrime = true;
        boolean isAscending = true;

        for (int i = 100; i < 1000; ++i) {
            int num = i;
            isPrime = true;

            // Prime
            for (int j = 2; j < (int) Math.sqrt(num) && isPrime; ++j) {
                if (num % j == 0) {
                    isPrime = false;
                }
            }

            // Ascending
            int p = 10;
            int c = 0;
            isAscending = true;

            while (num > 0 && isAscending) {
                c = num % 10;

                if (c >= p) {
                    isAscending = false;
                } else {
                    p = c;
                    num /= 10;
                }
            }

            if ((isAscending) && (i % 10 == 7) && (isPrime)) {
                System.out.print(i + " ");
            }
        }
    }
}