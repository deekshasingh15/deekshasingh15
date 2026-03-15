public class MissingNumber {
    public static void main(String[] args) {

        int nums[] = {3,0,1};

        int n = nums.length;
        int expectedSum = n*(n+1)/2;

        int actualSum = 0;

        for(int i:nums)
            actualSum += i;

        System.out.println(expectedSum - actualSum);
    }
}
