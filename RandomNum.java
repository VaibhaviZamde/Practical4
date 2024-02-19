class RandomNum
{
	public static void main(String args[])
	{
		RandomNum rn = new RandomNum();
		
		int[] rannum = new int[1000000];
		
		for(int i=0;i<rannum.length;i++)
		{
			long nanoTime = System.nanoTime();
			System.out.println(nanoTime);
			
			rannum[i] = rn.generateRandom(nanoTime);
			System.out.println("Random Number "+rannum[i]);
		}
	}
	
	public int generateRandom(long nanoTime)
	{
		int randomNumber = (int) (nanoTime%10000);
		return randomNumber;
	}
}
