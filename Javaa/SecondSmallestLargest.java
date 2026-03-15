import java.util.*;

public class SecondSmallestLargest {
    public static void main(String[] args) {

        int arr[] = {1,2,4,7,7,5};

        Arrays.sort(arr);

        int n = arr.length;

        int secondSmallest = -1;
        int secondLargest = -1;

        int smallest = arr[0];
        int largest = arr[n-1];

        for(int i=1;i<n;i++){
            if(arr[i] != smallest){
                secondSmallest = arr[i];
                break;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(arr[i] != largest){
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println("Second Smallest : " + secondSmallest);
        System.out.println("Second Largest : " + secondLargest);
    }
}
