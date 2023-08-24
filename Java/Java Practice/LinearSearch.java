import java.util.Scanner;
public class LinearSearch{
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];
        
        addValues(list);
        //display the array
        printArray(list);
        int key = scanner.nextInt();
        System.out.println(linearSearch(list, key));
        
        
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
    
    //linearSearch
    public static int linearSearch(int[] list, int key){
        for(int i=0; i<list.length; i++){
            if(list[i] == key){
                //display the index of the key value in the array
                return i;
            }
        }
        return -1;
    }
}
