package org.pkk.lambda;

public class CreatingLambda {

	interface Greeting{
		public String sayHello(String g);
	}
	
	public void testGreetings(String a, Greeting g){
		String result = g.sayHello(a);
		System.out.println("Result : " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input -> body
		new CreatingLambda().testGreetings("Harry", (String s) -> "Hello " + s);
		new CreatingLambda().testGreetings("Miss", (String s) -> "Hello " + s);
		
		
		new CreatingLambda().testGreetings("", 
				(String s) -> !s.isEmpty() ? "howdy, " + s : "Did you miss something");
	}

}
