package NewCom;

public class QuickSort {
	
	
	//Quick sort has O(nlogn) time complexity
	//and in worst case it has O(n2) in case like pivot is smallest or largest number
	
	
	public static void quickSort(int[] arr, int low,int high) {
		
		if(low<high) {
			int pi= partition(arr,0,arr.length-1);
			
			quickSort(arr,low,pi-1);
			quickSort(arr, pi+1,high);
			
			
		}
		
	}
	
	public static int partition(int[] arr, int low,int high) {	
		int pivot=arr[high];
		int i=low-1; 
		for(int j=low;j<high;j++) {
			
			if(arr[j]<pivot) {
				i++;
				//swap	
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}	
		}
		
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		
		
		return i;
	}
	
	

	public static void main(String[] args) {
		int[] arr= {6,3,2,7,9,5,1,4,8};
		int n=arr.length;
		
		quickSort(arr, 0 , n-1);
		
		System.out.print(arr);

	}

}
