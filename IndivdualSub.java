
public class IndivdualSub {
	public static void main(String[] args) {
		int tam=60;
		int eng=40;
		int mat=90;
		int sci=85;
		int soc=98;
		int sum,grade;
		sum=tam+eng+mat+sci+soc;
		grade=sum/5;
		if((tam>50)&&(eng>50)&&(mat>50)&&(sci>50)&&(soc>50)) {
			System.out.println("pass");
			System.out.println("sum");
			System.out.println(grade);
			
		}
		else {
			System.out.println("fail");
		}
		
		}
	

}
