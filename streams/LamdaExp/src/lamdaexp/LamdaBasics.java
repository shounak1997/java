package lamdaexp;

public class LamdaBasics {
	public static void main(String[] args) {
		
		Calculator add = new Calculator() {      //Anonymous Class which implements Calculator interface.

			@Override                            //Overriding the calculate abstract method
			public int calculate(int a, int b) {
				return a+b;
			}
			
		};//NOTE: Anonymous classes should be terminated 
		Calculator sub = new Calculator() {   

			@Override                            
			public int calculate(int a, int b) {
				return a-b;                 
			}
			
		};
		System.out.println("Addition " + add.calculate(1, 41));
		System.out.println("Subtraction "+ sub.calculate(5,20));
		
		// Lambda Expressions: These are functionals, no Object is created . Can only be used on functional interfaces. i.e SAM (Single Abstract Method)
	    
		Calculator addLambda = (n1,n2) -> n1 + n2;     /*{
			                                              return (n1 + n2);
		                                                  };*/
		System.out.println("LambdaAdd " + addLambda.calculate(45, 10));  //NOTE: calculate is the abstract interface method.
		
		
	
	}
}
