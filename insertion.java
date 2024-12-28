import java.util.Scanner;

public class insertion {

    public static void arrayElements(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");

        int size = scanner.nextInt();

        int array[] = new int[size];
        

        if(array.length ==0){
            System.out.println("Array is empty");
            return;
        }
        else{
        System.out.println("Enter " + size + " elements");

        for(int p = 0; p<size;p++){
            System.out.println("Element" + (p+1) + " :"); 
            array[p]=scanner.nextInt();
        } 
    }     
        System.out.println("The array you have entered is: ");    

        for(int p=0;p<size;p++){
            System.out.print(array[p] +" "+'\n');
        }

        insertionSort(array);
    }

    public static void insertionSort(int array[]){

        System.out.println("Array after insertion sorting sorting is: ");

        for(int i=1;i<array.length;i++){
            int key = array[i];
            int j = i-1;

            while(j>=0 && array[j]>key){
                array[j+1]= array[j];
                j--;
            }
            array[j+1]=key;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+'\n');
        }
    }



    public static void main(String[] args) {
    
        arrayElements();
    }
}
