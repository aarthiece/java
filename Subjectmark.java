
public class Subjectmark {

	public static void main(String[] args) {
		int tam=60;
		int eng=80;
		int mat=90;
		int sci=85;
		int soc=98;
		int sum,grade;
		sum=tam+eng+mat+sci+soc;
		grade=sum/5;
		System.out.println(grade);
		if(grade>80)
			System.out.println("class A");
		else
			System.out.println("class B");
		
	}
}
