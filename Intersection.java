import java.util.HashSet;

public class Intersection {
	public static int[] intersection(int[] array1, int[] array2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i: array1){
		 set1.add(i);
		}
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i: array2){
			if(set1.contains(i)){
				set2.add(i);
				}
		}
		int[] result = new int[set2.size()];
		int i=0;
		for(int n: set2){
			result[i++] = n;
		}
		return result;
	}
	
	public static void main(String args[]) {
		int[] a = {7,2,5,6,11};
		int[] b = {10,4,2,9,6};
		
		int[] res = intersection(a,b);
		for(int i: res)
		{
			System.out.println(i);
		}
		
	}
}

