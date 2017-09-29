
public class MergeSort {
	
	
	public static int[] mergeSort(int[] array, int first, int last) {
	        if (last - first < 1) {
	            return array;
	        }
	        int middle = (first + last) / 2;
	        
	        mergeSort(array, first, middle);
	        mergeSort(array, middle + 1, last);
	        
	        int f = first,
	            m = middle,
	            i,
	            temp;
	        while (f <= m && m + 1 <= last) {
	            if (array[f] >= array[m + 1]) { // 这里使用了插入排序的思想
	                temp = array[m + 1];
	                for (i = m; i >= f; i--) {
	                    array[i + 1] = array[i];
	                }
	                array[f] = temp;
	                m++;
	            } else {
	                f++;
	            }
	        }
	        return array;
	    }
}


