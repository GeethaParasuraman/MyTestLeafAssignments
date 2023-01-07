package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		//Initialize 3 integer variables
		int n1=0;
		int n2=1;
		int n3;
		int count = 11;
		int i;

		//print first number
		System.out.print(n1);
		for (i=1;i<count;i++)
		{
			n3 = n1+n2; //first n3= 0+1
			System.out.print(" " +n3);
			n1 = n2; //1
			n2 = n3; //1

		}




	}

}
