package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

class GfG {
    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                  
                    // Check if the duplicate element is already in res
                    if (!res.contains(arr[i])) {
                        res.add(arr[i]);
                    }
                    break; 
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        List<Integer> duplicates = findDuplicates(arr);        
        for (int x : duplicates) {
            System.out.print(x + " ");
        }
    }
}
