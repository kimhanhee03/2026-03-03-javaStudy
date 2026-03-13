import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,200,300,400,500};
		int[] copy=arr;
		copy[0]=1000;
		System.out.println(arr[0]);
		System.out.println("arr="+arr);
		System.out.println("copy="+copy);
		
		int[] copy2=arr.clone();
		System.out.println("copy2="+copy2);
		copy2[0]=5000;
		System.out.println("arr");
		System.out.println(Arrays.toString(arr));
		System.out.println("copy");
		System.out.println(Arrays.toString(copy));
		System.out.println("copy2");
		System.out.println(Arrays.toString(copy2));

		
	}

}
