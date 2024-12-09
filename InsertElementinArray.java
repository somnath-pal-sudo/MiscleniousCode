package InterviewPrograms;

import java.util.ArrayList;  
public class InsertElementinArray {  
    public static void main(String[] args) {  
        // Create an ArrayList  
        ArrayList<Integer> arrayList = new ArrayList<>();  
        // Add elements to the ArrayList  
        arrayList.add(10);  
        arrayList.add(20);  
        arrayList.add(30);   
        // Convert ArrayList to array  
        Integer[] array = arrayList.toArray(new Integer[0]);  
        // Display the array  
        for (Integer num : array) {  
            System.out.println(num);  
        }  
    }  
}  