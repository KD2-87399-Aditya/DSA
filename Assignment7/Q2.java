import java.util.HashMap;
import java.util.Map;

public class ModeOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 5, 5}; 

        int mode = calculateMode(array);

       
        System.out.println("Mode of the array: " + mode);
    }

    public static int calculateMode(int[] array) {
       
        Map<Integer, Integer> frequencyMap = new HashMap<>();

      
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        int mode = array[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mode;
    }
}
