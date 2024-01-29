public class Demo
{
	public static void main(String args[])
	{
		int arr[] = {};
		int size = arr.length;
		
		arrPrint(arr , size);
		System.out.println("Hello World");
	}
	
	private static void arrPrint(int arr[],int size)
	{
		int i;
		for(i=0; i<size; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
