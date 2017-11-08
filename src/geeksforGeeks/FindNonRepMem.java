package geeksforGeeks;

import java.util.concurrent.CountDownLatch;

public class FindNonRepMem {

	int count[];
	void printRepeating(int arr[], int size) 
    {
        count = new int[size];
        int i;
 
        
        for (i = 0; i < size; i++) 
        {
            count[arr[i]]++;
                
        }
        
    }
	
	void display(int arr[]){
		System.out.println("Repeated elements are : ");
		for(int i=0;i<count.length;i++){
			
			if(count[i]>1){
				System.out.println(arr[i]);
			}
		}
	}
 
    public static void main(String[] args)
    {
    	FindNonRepMem repeat = new FindNonRepMem();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
        repeat.display(arr);
    }
}
