import java.util.Arrays;

public class Employee {
	@Override
	public String toString() {
		return "Employee [eSal=" + eSal + "]";
	}

	int eSal;
	public Employee(int eSal) {
		this.eSal = eSal;}
	public static void quickSort(Employee arr[]) {
		for(int i = 1; i<arr.length;i++) {
			for(int j = 0; j<arr.length-1;j++) {
				if(arr[j+1].eSal<arr[j].eSal) {
					int temp = arr[j+1].eSal;
					arr[j+1].eSal = arr[j].eSal;
					arr[j].eSal = temp;
				}
			}
			
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = {new Employee(2400),new Employee(2300),new Employee(2500),new Employee(2700)};
		System.out.println("Sorted array by salary: "+Arrays.toString(arr));

	}

}
