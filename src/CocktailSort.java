
public class CocktailSort {

	public static void main(String[] args) {
		 int array[] = {15,6,6,10,6,5,6,3,1,6,7,6,2,8,6};
	        System.out.println("排序之前：");
	        for(int element : array){
	            System.out.print(element+" ");
	        }

	        cocktailSort(array);

	        System.out.println("\n排序之后：");
	        for(int element : array){
	            System.out.print(element+" ");
	        }
	}
	
	public static void cocktailSort(int[] array) {
	    
	    int length = array.length,
	        left = 0,
	        right = length - 1,
	        lastSwappedLeft = left,
	        lastSwappedRight = right,
	        i,
	        j;
	    while (left < right) {
	        // 从左到右
	        lastSwappedRight = 0;
	        for (i = left; i < right; i++) {
	            if (array[i] > array[i + 1]) {
	                swap(array, i, i + 1);
	                lastSwappedRight = i;
	            }
	        }
	        right = lastSwappedRight;
	        // 从右到左
	        lastSwappedLeft = length - 1;
	        for (j = right; left < j; j--) {
	            if (array[j - 1] > array[j]) {
	                swap(array, j - 1, j);
	                lastSwappedLeft = j;
	            }
	        }
	        left = lastSwappedLeft;
	    }	
	}
	
	public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

