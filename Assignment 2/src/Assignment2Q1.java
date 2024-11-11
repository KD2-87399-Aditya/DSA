import java.util.Arrays;

public class Assignment2Q1 {

	public static void InsertionSort(int arr[]) {
		for(int i = 1; i<arr.length;i++) {
			int temp = arr[i];
			int j;
			for(j = i-1; j>=0 && arr[j]<temp;j--) {
				arr[j+1] = arr[j];
				
			}arr[j+1] = temp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,88,33,99,55,66,77};
		InsertionSort(arr);
		System.out.println("Array after sort: "+ Arrays.toString(arr));

	}

}
