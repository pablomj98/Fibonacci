package fibonacci;

public class Fibonacci {
	public static void main(String[] args){
		 
        int variable=0;
        int variable1=1;
        int variable2=0;
        
            System.out.print(variable+" ");  
        System.out.println(variable1+ " ");                 

        for (int i=0;i<=100;i++){
            variable2=variable+variable1;
            variable=variable1;
            variable1=variable2;
            System.out.print(variable2+" ");
        }
    }
}
