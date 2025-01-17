/*this question is asked in many companies as flipcart,morgan stanley,opera and many so i thought i couldn't get it but due to my experience with yesterday question(using prefix sum) 
i got an idea and gave it a try and boom i got the answer and i am very happy for it.

yesterday i was sad because i couldn't get the answer for yesterday question and i saw the solution to solve and understand it but i am happy today as i solved it on my own.*/

class Solution {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int totalProduct = 1;
        int zeroCount = 0;

       
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }

       
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                res[i] = 0; 
            } else if (zeroCount == 1) {
                res[i] = (arr[i] == 0) ? totalProduct : 0; 
            } else {
                res[i] = totalProduct / arr[i]; 
            }
        }

        return res;
    }
}
