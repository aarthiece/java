import java.util.*;
public class CountEven {

	public static void main(String[] args) {
		int num,count=0;
		Scanner s=new Scanner(System.in);
		int even=0,odd=0;
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int a=s.nextInt();
			if(a%2==0){
			   even++;
		}
			else {
				odd++;
		  }
	}
		System.out.println(even +" "+odd);

}
}
