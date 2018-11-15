
class Algoritma_Insertion_Sort
{ 
    
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
   
    public static void main(String args[]) 
    {         
        int arr[] = {10, 11, 15, 3, 5}; 
  
        Algoritma_Insertion_Sort ob = new Algoritma_Insertion_Sort();         
        ob.sort(arr); 
          
        printArray(arr); 
    }

	private void sort(int[] arr) {
		
		
	} 
}
