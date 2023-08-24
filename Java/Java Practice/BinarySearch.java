import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch{
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[20];
        
        addValues(list);
        //display the array
        Arrays.sort(list);
        printArray(list);
        int key = scanner.nextInt();
        System.out.println(binarySearch(list, key));
        
        
    }
    
    //add values to the array
    public static int[] addValues(int[] list){
        for(int i = 0; i<list.length; i++)
            list[i] = (int)(Math.random()*100);
        
        return list;
    }
    
    //print the array
    public static void printArray(int[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    
    //binarySearch
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length-1;
        
        while(high >= low){
            int mid = (low + high)/2;
            if(key < list[mid])
                high = mid-1;
            else if(key == list[mid])
                return mid;
            else
                low = mid+1;
        }
        //if key is not in the list, this line will show the index where key should be at to keep the array sorted
        return -low - 1;
    }
}
