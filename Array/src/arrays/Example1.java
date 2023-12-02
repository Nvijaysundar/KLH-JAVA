package arrays;
public class Example1 {
	public static void main(String[] args) {
		
		int[] arr = new int[7];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = i;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		for(int temp :arr)
			System.out.print(temp+" ");
	}
}
