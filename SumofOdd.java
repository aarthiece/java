
public class SumofOdd {

	public static void main(String[] args) {
		int num=100,sum=0,count=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				sum=sum+i;
				count++;
			}
		
			
		}
		System.out.println("count is"+count);
	System.out.println(sum);	
	}

}
