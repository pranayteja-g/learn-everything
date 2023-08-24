import java.util.Scanner;

public class selectionSort{
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[20];
        
        addValues(list);
        selectionSort(list);
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
    
    public static void selectionSort(int[] list){
        for(int i = 0; i<list.length-1; i++){
            int currentMin = list[i];
            int currentMinIndex = i;
            
            for(int j=i+1; j<list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
