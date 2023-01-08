package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		//check if the number is prime or not

		int i,m=0,count=0;      

		int number=4;//it is the number to be checked    

		//int number=7;//it is the number to be checked    

		m=number/2;      

		if(number==0||number==1){ 
			System.out.println(number+" is not prime number");      
		}
		else{ 
			for(i=2;i<=m;i++)
			{   
				// when number = 4 is used, 4/2 = 2 so i = m   , hence this for loop and if condition will be executed
				//when number = 7. 7/2 = 3 so i>m hence for loop will not be executed and will break out of this loop

				if(number%i==0){       //4%2 == 0 hence is not prime number will be printed.  
					System.out.println(number+" is not prime number");      
					count=1;      
					break;      
				}      
			}      

			if(count==0)  { // this condition  will be executed when number = 7 is used
				System.out.println(number+" is prime number"); 
			}
		} 
	}
}




