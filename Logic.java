import java.util.Stack;

public class Logic {
	
	String printAnswer (double answer)
	{
		String meh;
		int a=(int)answer;
		if(answer-(double)a>0)
		{
			meh=Double.toString(answer);

		}else {
			meh=Integer.toString(a);

			
		}
			return meh;
			
		
	}

	public String evaluate(String ans)
	{
		
	    String[] result = ans.split("\\s");
	    Stack<String> numbers = new Stack<String >();
	    
	    for(int i=0;i<result.length;i++)
	    {
	    	if(isNumeric(result[i]))
	    	{
	    		numbers.push(result[i]);
	    	}
	    	else {
	    		String a = "0",b = "0";
	    		if (!numbers.isEmpty()) a=numbers.pop(); 
	    		else System.out.println("EMPTY");
	    		if (!numbers.isEmpty()) b=numbers.pop();
	    		else System.out.println("EMPTY");

	    		switch(result [i]) {
	    		case "+": numbers.push(Double.toString(Double.parseDouble(a)+Double.parseDouble(b)));break;
	    		case "-": numbers.push(Double.toString(Double.parseDouble(b)-Double.parseDouble(a)));break;
	    		case "x": numbers.push(Double.toString(Double.parseDouble(a)*Double.parseDouble(b)));break;
	    		case "÷":  numbers.push(Double.toString(Double.parseDouble(b)/Double.parseDouble(a)));break;
	    		
	    	}
	    }

		
		
		
		
	}
	    
	    
	    System.out.println(numbers.peek());
	    return numbers.peek();
	}
	
	 static String toPostfix(String result[]) {
		String ch,ans="",xx = "";
		
		Stack<String> s  = new Stack<String>();	
		for(int i=0; i<result.length ;i++)
		{ch=result[i];
		int pr=priority(ch);

		if (pr==0) {ans=ans+ch+" ";		}
		else if (ch.equals(")")) // pop up to (
		{ 
			while(!s.isEmpty() && !s.peek().equals("(")) {
				ans=ans+s.peek()+" ";s.pop();
				
			}
		
		if(!s.isEmpty())s.pop();
		 }
		else if ( ch.equals("("))s.push(ch);

		else { while(!s.isEmpty()&& priority(s.peek())>=pr && !s.peek().equals("("))

		{ 
			xx=s.pop();
			 if (xx!="(") ans=ans+xx+" ";
		
		}

		
		s.push( ch); }
		

		}
		
		while(!s.isEmpty()) ans=ans+s.pop()+" ";// remaining

		return ans;
		}
	 
	  static int priority(String c){
		 

		 if(isNumeric(c))
			 {	 return 0;}
		 
		 if(c.equals("+")) {return 1;}
		 if(c.equals("-")) {return 1;}
		 if(c.equals("x")) {return 2;}
		 if(c.equals("÷")) {return 2;}
		 if(c.equals("(")) {return 9;}
		 
		 
		 return -1;
		 }
	 public static boolean isNumeric(String str)  
	 {  
	   try  
	   {  
	     double d = Double.parseDouble(str);  
	   }  
	   catch(NumberFormatException nfe)  
	   {  
	     return false;  
	   }  
	   return true;  
	 }
}
