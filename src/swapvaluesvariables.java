public class swapvaluesvariables {

	public static void main(String[] args) {
		System.out.println("Swap 2 values without using variable");
		int i=10;
		int j=7;
		
		System.out.println("Before swapping no. : "+i +" "+j);
		
		i = i+j;
		j = i-j;
		i = i-j;
		
		System.out.println("After swapping no. : "+i+" "+j);
	}

	}


