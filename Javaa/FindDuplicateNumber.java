import java.util.*;

public class FindDuplicateNumber {
    public static void main(String[] args) {

        int arr[] = {1,3,4,2,2};

        Set<Integer> set = new HashSet<>();

        for(int i:arr){
            if(set.contains(i)){
                System.out.println(i);
                break;
            }
            set.add(i);
        }
    }
}
