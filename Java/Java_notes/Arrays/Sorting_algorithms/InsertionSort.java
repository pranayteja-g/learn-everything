import java.util.Scanner;

public class InsertionSort{
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[20];
        
        addValues(list);
        printArray(list);
        insertionSort(list);
        //display the array
        printArray(list);
        
        
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
    
    public static void insertionSort(int[] list){
        for(int i = 1; i<list.length; i++){
            int currentElement = list[i];
            int k;
            
            for(k=i - 1; k>=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];                
                
            }
            
            list[k+1] = currentElement;
        }
    }
}
