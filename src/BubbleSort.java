
public class BubbleSort {
	public static void main(String[] args) {
		 int array[] = {15,6,6,10,6,5,6,3,1,6,7,6,2,8,6};
	        System.out.println("排序之前：");
	        for(int element : array){
	            System.out.print(element+" ");
	        }

	        bubbleSort(array);

	        System.out.println("\n排序之后：");
	        for(int element : array){
	            System.out.print(element+" ");
	        }
	}
	
	public static int[] bubbleSort(int[] array) {
		
		int length = array.length;
		int i,j,temp;
		
		 for (i = length - 1; 0 < i; i--) {		// 此次冒泡的最大长度
		       for (j = 0; j < i; j++) {		// 两两比较将最大的交换到最后位置
		           if (array[j] > array[j + 1]) {
		               temp = array[j];
		               array[j] = array[j + 1];
		               array[j + 1] = temp;
		           }
		       }
		   }
		   return array;
	}
}
