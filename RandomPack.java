//WAP to generate 10 random number which is less than 100
import java.util.Random;
class RandomPack
{
	public static void main(String args[])
	{
		Random rn = new Random();
		for(int i=0; i<10; i++)
		{
			int N = rn.nextInt(100);
			System.out.println(N);
		}
	}
}
